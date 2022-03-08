package org.baraka.fast.spirit.repository.conformity;

import org.baraka.fast.spirit.repository.convertor.TableException;

import java.lang.reflect.Field;

public class ConformityPrimitiveTypeException extends TableException {
    public ConformityPrimitiveTypeException(Class c) {
        super(c.getName() + "is not a primitive type");
    }
}
