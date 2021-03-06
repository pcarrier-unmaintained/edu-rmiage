package rmiage.server.controller;

import rmiage.server.settings.*;
import rmiage.server.exceptions.SettingsException;
import java.rmi.registry.Registry;
import java.util.Hashtable;

/**
 * A controller used to get some configuration values
 */
public class SettingsController {

	protected SettingsBackend backend = null;

	/**
	 * Constructor. Return a SettingController instance.
	 * 
	 * @param cmdlineParams
	 *            Strings containing params (e.g from argv).
	 */
	public SettingsController(String[] cmdlineParams) {
		try {
			String backendClassName = System.getProperty(
					"rmiage.settingsloader",
					"rmiage.server.settings.PropertiesSettingsBackend");
			backend = (SettingsBackend) ClassesManager
					.createInstance(backendClassName);
			backend.giveCommandLine(cmdlineParams);
		} catch (Exception ex) {
			throw new SettingsException(ex.getMessage());
		}
	}

	/**
	 * get the rmiregistry port
	 * @return The port for rmiregistry to use.
	 */
	public int getRmiPort() {
		int res = 0;
		try {
			res = new Integer(backend.getOption("RMIport"));
		} catch (NumberFormatException ex) {
			res = Registry.REGISTRY_PORT;
		}
		return res;
	}

	/**
	 * Return the resource name to expose to clients
	 * 
	 * @return The resource name to expose to clients.
	 */
	public String getRessourceName() {
		return (backend.getOption("RessourceName"));
	}

	/**
	 * Return the Modules descriptions from parameters.
	 * 
	 * @return Strings describing the modules to use. 
	 */
	public String[] getModuleLoadersDescriptions() {
		return (backend.getList("ModuleLoaders"));
	}

	/**
	 * Return the SecurityController description from settings.
	 * 
	 * @return A string describing the SecurityController. 
	 */
	public String getSecurityControllerDescription() {
		return (backend.getOption("SecurityController"));
	}

	/**
	 * get an option which his name is given as parameter
	 * @param optionName
	 * @return
	 */
	public String getOption(String optionName) {
        return backend.getOption(optionName);
    }

	/**
	 * get options which names are given as parameter
	 * @param optionsName
	 * @return
	 */
    public String[] getListOption(String optionsName) {
        return backend.getList(optionsName);
    }
}