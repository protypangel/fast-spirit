package org.baraka.fast.spirit.repository.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {
    // Table name
    String value() default "";
    String ID_NAME() default "id";
    GenerationId GenerationId() default GenerationId.AUTO_INCREMENT;
    String BDD_NAME() default "";
}
