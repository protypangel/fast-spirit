package org.baraka.fast.spirit.properties;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum DefaultProperties {
    PortController("80"),
    PortStream("81");

    private String value;
    DefaultProperties(String value) {
        this.value = value;
    }
    public String value() {
        return value;
    }
    private static String key (DefaultProperties props) {
        char[] chars = props.name().toCharArray();
        char init = (char) (chars[0] + 32);
        StringBuilder builder = new StringBuilder().append(init);
        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if ('A' <= c && c <= 'Z') builder.append(".").append((char) (c + 32));
            else builder.append(c);
        }
        return builder.toString();
    }
    public static Map<String, String> get() {
        return Arrays.stream(DefaultProperties.values()).collect(Collectors.toMap(DefaultProperties::key, DefaultProperties::value));
    }
}
