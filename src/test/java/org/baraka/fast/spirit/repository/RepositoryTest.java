package org.baraka.fast.spirit.repository;

import lombok.SneakyThrows;
import org.baraka.fast.spirit.repository.connection.Connection;
import org.baraka.fast.spirit.repository.connection.MethodConnection;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RepositoryTest {
/*
        Statement stmt = conn.createStatement();
        stmt.executeQuery("SELECT * FROM person");

        ALTER TABLE public.newtable ADD id int8 NOT NULL GENERATED ALWAYS AS IDENTITY;
        ALTER TABLE public.newtable ADD test varchar NULL;
*/

    @SneakyThrows @Test void createTable() {
        Connection connection = new Connection(
                "jdbc:postgresql://grapyamo.c0pbt9zfbdtr.eu-west-3.rds.amazonaws.com:5432/FastSpirit",
                "FastSpirit",
                "FastSpirit",
                "org.postgresql.Driver",
                MethodConnection.UPDATE,
                Arrays.asList(TestRepository.class));
    }
}
