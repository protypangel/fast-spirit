package org.baraka.fast.spirit.repository;

import org.baraka.fast.spirit.repository.entity.Connection;
import org.junit.jupiter.api.Test;

public class RepositoryTest {
    @Test void createTable() {
        Connection connection = new Connection("jdbc:postgresql://grapyamo.c0pbt9zfbdtr.eu-west-3.rds.amazonaws.com:5432/FastSpirit","FastSpirit","FastSpirit");
    }
}
