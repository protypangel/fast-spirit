package org.baraka.fast.spirit.repository.connection;

public enum MethodConnection {
    UPDATE, // Only get the value of the bdd and create non-existent column and table
    DROP // Drop all useless element of the table [column, table]
}
