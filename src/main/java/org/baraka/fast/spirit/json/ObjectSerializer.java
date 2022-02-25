package org.baraka.fast.spirit.json;

import com.google.gson.*;

import java.lang.reflect.Type;

public class ObjectSerializer implements JsonSerializer<Object> {
    private static Gson gson = new Gson();
    public JsonElement serialize(Object o, Type type, JsonSerializationContext jsonSerializationContext) {
        return null;
    }
}
