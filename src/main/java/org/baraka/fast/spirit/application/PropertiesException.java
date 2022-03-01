package org.baraka.fast.spirit.application;

import java.util.Properties;

public class PropertiesException extends Exception {
    public PropertiesException(String path) {
        super("Le fichier properties n'a pas été trouver (path:" + path + ")");
    }
}
