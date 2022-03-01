package org.baraka.fast.spirit.application;

import org.baraka.fast.spirit.properties.PropertiesArguments;
import org.baraka.fast.spirit.properties.PropertiesException;

public class FastSpirit {
    public static void run(String []args) {
        try {
            new FastSpirit(args);
        } catch (PropertiesException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    private PropertiesArguments properties;
    private FastSpirit(String []args) throws PropertiesException {
        properties = new PropertiesArguments(args);
    }
}
