package rmiage.server.settings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Properties;

public class PropertiesSettingsBackend implements SettingsBackend {

    protected Properties properties;

    public void giveCommandLine(String[] cmdlineParams) {
        String fileName = null;
        for (String param : cmdlineParams) {
            if (param.startsWith("--config-file=")) {
                fileName = param.substring(14);
            }
        }
        if (fileName == null) {
            throw new SettingsException("No config file specified! " +
                    "Please use --config-file=");
        }
        properties = new Properties();
        try {
            properties.load(new FileInputStream(fileName));
        } catch (FileNotFoundException ex) {
            throw new SettingsException("Config file cannot be found!");
        } catch (IOException ex) {
            throw new SettingsException("Config file cannot be read!");
        }
    }

    public String getOption(String optionName) {
        return(properties.getProperty(optionName));
    }
}