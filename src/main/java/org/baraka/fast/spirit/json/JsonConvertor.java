package org.baraka.fast.spirit.json;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonConvertor {
    private static GsonBuilder gson = new GsonBuilder();
    static {
        ExclusionStrategy strategy = new CustomExclusionStrategy();
        gson = new GsonBuilder();
//                .registerTypeAdapter(NormalClass.class, new ObjectSerializer())
                .addSerializationExclusionStrategy(strategy)
                .create();
    }
    public static String toJson(Object object) {
        return gson.toJson(object);
    }
    public static <T> T fromJson(String json, Class c) {
        return (T) gson.fromJson(json, c);
    }
}
