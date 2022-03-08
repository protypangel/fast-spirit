package org.baraka.fast.spirit.properties;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum DefaultProperties {
    COMMUNICATION_PORT("80"),
    COMMUNICATION_API_DOC_URL("/api"),
    COMMUNICATION_API_DOC_ACCESS_ROLES("ADMIN|DEV"),
    COMMUNICATION_API_DOC_ACCESS_IP("*"),
    COMMUNICATION_API_DOC_TITLE("Fast Spirit"),
    COMMUNICATION_API_DOC_VERSION("ALPHA TEST"),

    REPOSITORY_CONNECTION_METHOD("UPDATE"),
    REPOSITORY_DRIVER("org.postgresql.Driver");

    private String value;
    DefaultProperties(String value) {
        this.value = value;
    }
    public String value() {
        return value;
    }
    private static String key (DefaultProperties props) {
        StringBuilder builder = new StringBuilder();
        for (char c : props.name().toCharArray()) {
            if ('_' == c) builder.append(".");
            else if ('A' <= c && c <= 'Z') builder.append((char) (c + 32));
            else builder.append(c);
        }
        return builder.toString();
    }
    public static Map<String, String> get() {
        return Arrays.stream(DefaultProperties.values()).collect(Collectors.toMap(DefaultProperties::key, DefaultProperties::value));
    }
}
