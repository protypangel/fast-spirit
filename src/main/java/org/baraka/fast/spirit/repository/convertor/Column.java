package org.baraka.fast.spirit.repository.convertor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.baraka.fast.spirit.repository.entity.Transient;
import org.baraka.fast.spirit.repository.entity.TransientUnique;
import org.baraka.fast.spirit.repository.entity.Unique;

import java.lang.reflect.Field;

@Getter
public class Column {
    String type;
    boolean unique = false;
    boolean isTransient = false;
    String[] valued = {};

    public Column(Field field) throws TableException {
        type = field.getType().getName();
        TransientUnique transientUnique = field.getAnnotation(TransientUnique.class);
        Unique unique = field.getAnnotation(Unique.class);
        Transient TRANSIENT = field.getAnnotation(Transient.class);
        if (transientUnique != null && unique != null && TRANSIENT != null) throw new TooMuchAnnotation("You cannot have TransientUnique, Unique and Transient annotation");
        if (transientUnique != null) {

            isTransient = true;
            this.unique = true;
            valued = transientUnique.value();
        }
        if (unique != null) this.unique = true;
        if (TRANSIENT != null) this.isTransient = true;
        type = field.getName();
    }
}
