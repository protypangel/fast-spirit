package org.baraka.fast.spirit.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

public class PropertiesArguments {
    private Properties properties;
    public PropertiesArguments(String []args) throws PropertiesException {
        Map<String, String> arguments = Arrays.stream(args).collect(Collectors.toMap(arg -> arg.split("=")[0], arg -> arg.split("=")[1]));
        basicArgument(arguments);
        arguments.put("properties", arguments.get("properties").replaceAll("\\\\", "/"));
        String resourcePath = findResourcePath(new File(System.getProperty("user.dir")), arguments.get("properties"));
        this.setProperties(resourcePath);
    }
    private void basicArgument(Map<String, String> arguments) {
        if (!arguments.containsKey("properties")) arguments.put("properties", "resources/application.properties");
    }
    private void basicProperties() {
        Map<String, String> properties = DefaultProperties.get();
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            if (!this.properties.contains(entry.getKey())) properties.put(entry.getKey(), entry.getValue());
        }
    }
    private String findResourcePath(File file, String path) {
        for (File f : file.listFiles()) {
            if (f.isFile() && f.getPath().replaceAll("\\\\", "/").endsWith(path)) return f.getPath();
            if (f.isDirectory()) {
                String resource = findResourcePath(f, path);
                if (resource != null) return resource;
            }
        }
        return null;
    }
    private void setProperties(String resourcePath) throws PropertiesException {
        this.properties = new Properties();
        try {
            properties.load(new FileInputStream(resourcePath));
            basicProperties();
        } catch (IOException e) {
            throw new PropertiesException(resourcePath);
        }
    }
    public String getProperty(String key) {
        return (String) this.properties.get(key);
    }
}
