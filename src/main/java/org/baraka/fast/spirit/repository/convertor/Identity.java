package org.baraka.fast.spirit.repository.convertor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.baraka.fast.spirit.repository.entity.GenerationId;

@AllArgsConstructor
@Getter
public class Identity {
    String name;
    String type;
    GenerationId generationId;
}
