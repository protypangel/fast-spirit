package org.baraka.fast.spirit.repository.convertor;

import org.baraka.fast.spirit.repository.conformity.Conformity;
import org.baraka.fast.spirit.repository.conformity.ConformityPrimitiveTypeException;
import org.baraka.fast.spirit.repository.entity.Entity;
import org.baraka.fast.spirit.repository.jpa.JPA;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

public class Table {
    Identity identity;
    Map<String, Column> columns;
    public Table(Class<?> entityClass, String tableName) throws TableException {
        Conformity.notTwiField(entityClass);
        Entity entity = entityClass.getAnnotation(Entity.class);
        List<Field> fields = new ArrayList<>(Arrays.asList(entityClass.getDeclaredFields()));
        if (entity.id().isEmpty()) {
            Conformity.notTwiFieldId(entityClass, tableName);
            identity = new Identity("id", Long.class.getName(), entity.GenerationId());
        } else {
            Field fieldID = fields.stream().filter(field -> field.getName().equals(entity.id())).collect(Collectors.toList()).stream().findAny().orElseThrow(() -> new FieldNameNotExist("The field [" + entity.id() + "] doesn't in the class [" + entityClass.getName() + "]"));
            Conformity.PrimitiveType(fieldID.getType());
            identity = new Identity(entity.id(), fieldID.getType().getName(), entity.GenerationId());
            fields.remove(fieldID);
        }

        columns = new HashMap<>();
        for (Field field : fields) {
            columns.put(this.key(field), this.value(field));
        }
    }

    private String key(Field field) {
        return field.getName().toLowerCase();
    }
    private Column value(Field field) throws TableException {
        return new Column(field);
    }

    public static Map<String, Table> fromRepositories(List<Class> repositories) throws TableException {
        Map<String, Table> tables = new HashMap<>();
        for (Class repository : repositories) {
            Class<?> entity = getEntityClass(repository);
            String key = key(entity);
            tables.put(key, new Table(entity, key));
        }
        return tables;
    }
    private static Class<?> getEntityClass(Class repository) {
        for (Type genericInterface : repository.getGenericInterfaces()) {
            ParameterizedType parameterizedType = (ParameterizedType) genericInterface;
            if(parameterizedType.getRawType().getTypeName().equals(JPA.class.getName())) {
                return (Class<?>) parameterizedType.getActualTypeArguments()[0];
            }
        }
        return null;
    }
    private static String key(Class<?> entityClass) {
        Entity entity = entityClass.getAnnotation(Entity.class);
        return entity.value().isEmpty() ? entityClass.getName().replace("Entity", "").toLowerCase() : entity.value();
    }
}
