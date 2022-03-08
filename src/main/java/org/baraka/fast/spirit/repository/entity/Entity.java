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
    String id() default "";
    GenerationId GenerationId() default GenerationId.AUTO_INCREMENT; // Custom si id n'est pas vide
    // TODO: A prendre en compte
    String BDD_NAME() default "";
}
