package org.baraka.fast.spirit.repository;

import org.baraka.fast.spirit.repository.entity.Entity;
import org.baraka.fast.spirit.repository.entity.Transient;
import org.baraka.fast.spirit.repository.entity.TransientUnique;
import org.baraka.fast.spirit.repository.entity.Unique;

@Entity(id = "long_value")
public class TestEntity {
    @TransientUnique({ "string", "integer" }) String stringDeux;
    String string;
    Integer integer;
    Long long_value;
    @Unique Double double_value;
    @Transient Float float_value;
    Boolean bool_value;
}
