package rmiage.server.controller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import rmiage.app.server.MainController;
import rmiage.server.modules.ModuleLoader;
import rmiage.server.modules.Module;
import rmiage.server.modules.TreeModule;

public class ModulesController {

    protected MainController main;
    public Hashtable<SessionController, List<Module>> modules =
            new Hashtable<SessionController, List<Module>>();

    protected ModulesController() {
        super();
    }

    public ModulesController(MainController main) {
        this();
        this.main = main;
    }

    public void initializeModules(SessionController sc) {
        List<ModuleLoader> moduleLoadersList = ClassesManager.getInstances(
                main.getModuleLoadersDescriptions());
        ArrayList<Module> modulesList = new ArrayList<Module>();
        for (ModuleLoader ml : moduleLoadersList) {
            modulesList.add(ml.createModule(sc));
        }
        modules.put(sc, (List) modulesList);
    }

    /**
     * Get modules from a SessionController given as parameter
     * @param sc
     * @return the modules from this SessionController
     */
    public List<Module> getModules(SessionController sc) {
        return modules.get(sc);
    }

    /**
     * Removes a Sessioncontroller from the modules Hashtable
     * @param sc
     */
    public List<TreeModule> getTreeModules(SessionController sc) {
        ArrayList<TreeModule> res = new ArrayList<TreeModule>();
        for(Module m : getModules(sc)) {
            if (m instanceof TreeModule) {
                res.add((TreeModule)m);
            }
        }
        return res;
    }

    public void sessionFinished(SessionController sc) {
        modules.remove(sc);
    }
}
