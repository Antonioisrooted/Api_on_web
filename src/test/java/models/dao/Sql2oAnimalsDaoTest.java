package models.dao;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.sql2o.*;

public class Sql2oAnimalsDaoTest {
    private static Connection connection;

    private static Sql2oAnimalsDao animalsDao;

    @BeforeClass
    public static void setUp() throws Exception {
        String connectionString = "jdbc:postgresql://localhost:5432/organisational_api_test";
        Sql2o sql2o = new Sql2o(connectionString, "moringa", "Access");
        animalsDao=new Sql2oAnimalsDao(sql2o);
        connection=sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("CLEARING DATABASE!!!!!!!");
        animalsDao.clear();
    }

    @AfterClass
    public static void shutDown() throws Exception {
        System.out.println("SHUTTING DOWN DATABASE!!!!!!");
        connection.close();
    }
}