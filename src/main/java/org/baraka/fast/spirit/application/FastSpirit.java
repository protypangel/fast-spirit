package org.baraka.fast.spirit.application;

public class FastSpirit {
    public static void run(String []args) {
        try {
            new FastSpirit(args);
        } catch (PropertiesException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    private FastSpiritArgumentTransform transform;
    private FastSpirit(String []args) throws PropertiesException {
        transform = new FastSpiritArgumentTransform(args);
    }
}
