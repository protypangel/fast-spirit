package org.baraka.fast.spirit.repository.jpa;

import java.util.List;
import java.util.Optional;

public interface JPA<TABLE> {
    <ID> Optional<TABLE> deleteWhereId(ID id, TABLE column); // Return the deleted element
    <ID> Optional<TABLE> updateWhereId(ID id, TABLE column); // Update only element which aren't null, and return the last column
    <ID> Optional<TABLE> selectWhereId(ID id);
    List<TABLE> select();
    int count();
}
