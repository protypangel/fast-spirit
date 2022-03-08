package org.baraka.fast.spirit.repository.conformity;

import org.baraka.fast.spirit.repository.convertor.TwiceFieldName;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Conformity {
    public static void PrimitiveType(Class c) throws ConformityPrimitiveTypeException {
        List<Class<?>> classes = Arrays.asList(
                Long.class,
                Integer.class,
                String.class,
                Double.class,
                Boolean.class
        );
        for (Class<?> CLASS : classes) {
            if (isSameClass(c, CLASS)) return;
        }
        throw new ConformityPrimitiveTypeException(c);
    }
    private static boolean isSameClass(Class a, Class b) {
        return a.getName().equals(b.getName());
    }

    public static void notTwiFieldId(Class entityClass, String tableName) throws TwiceFieldName {
        try {
            entityClass.getDeclaredField("id");
            throw new TwiceFieldName("You have twice the column [id] in the table [" + tableName + "]");
        } catch (NoSuchFieldException e) {}
    }

    public static void notTwiField(Class<?> entityClass) throws TwiceFieldName {
        Map<String, List<Field>> fields = Arrays.stream(entityClass.getDeclaredFields()).collect(Collectors.groupingBy(Field::getName))
                .entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        if (!fields.isEmpty()) {
            Set<Map.Entry<String, List<Field>>> entries = fields.entrySet();
            StringBuilder builder = new StringBuilder("You have " + entries.size() + "which have the same field's name\n:");
            for (Map.Entry<String, List<Field>> entry : entries) {
                builder.append(entry.getValue().get(0).getName()).append("\n");
            }
            throw new TwiceFieldName(builder.toString());
        }
    }
}
