package com.yanemr;

import org.flywaydb.core.Flyway;

public class FlywayMigrationApp
{
    public static void main( String[] args )
    {
        Flyway flyway = Flyway.configure().load();
        flyway.migrate();
    }
}
