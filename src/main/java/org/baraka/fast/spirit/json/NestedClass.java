package org.baraka.fast.spirit.json;

import lombok.Data;

@Data
public class NestedClass {
    String str;
    int integer;
    double doubled;
    float f;
    long l;
    boolean b;

    public static NestedClass init () {
        NestedClass nested = new NestedClass();
        nested.str = "str";
        nested.integer = 5;
        nested.doubled = 5.5;
        nested.f = 5.5F;
        nested.l = 5L;
        nested.b = true;

        return nested;
    }
}
