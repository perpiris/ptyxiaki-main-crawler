package crawler;

import org.neo4j.driver.*;

public class Repository implements AutoCloseable {
    private final Driver driver;

    public Repository() {
        driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "password"));
    }

    public void close() {
        driver.close();
    }
}
