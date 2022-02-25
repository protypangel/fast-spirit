package org.baraka.fast.spirit.json;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomExclusionStrategy implements ExclusionStrategy {
    @Override public boolean shouldSkipField(FieldAttributes field) {
        if (field.getAnnotation(JsonIgnore.class) != null) {
            JsonIgnore jsonIgnore = field.getAnnotation(JsonIgnore.class);
            return getValue(jsonIgnore.value(), field, field.getDeclaringClass());
        }
        return false;
    }
    @Override public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }
    // TODO : Prendre en compte les elements avant .
    @SneakyThrows
    private <T> boolean getValue(String value, FieldAttributes field, T parent) {
        if (value.isEmpty()) return true;

        List<String> values = new ArrayList<>(Arrays.asList(value.split("\\.")));

//        Object object = getObject(values.remove(0), field.getDeclaringClass(), parent);
//
//        for (String v : values) {
//            object = getObject(v, object.getClass(), parent);
//        }

        return (Boolean) true;
    }
    private Object getObject(String value, Class<?> c, Class<?> parent) throws Exception {
        if (value.endsWith("()")) {
            return c.getDeclaredMethod(value.replace("()", "")).invoke(parent);
        }
        return c.getDeclaredField(value).get(parent);
    }
}
