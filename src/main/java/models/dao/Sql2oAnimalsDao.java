package models.dao;

import models.Animals;

import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.sql.*;
import java.util.List;

public class Sql2oAnimalsDao implements AnimalsDao {
    private final Sql2o sql2o;

    public Sql2oAnimalsDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void create(Animals animals) {
        String sql = "INSERT INTO animals (type, breed, image, description) VALUES (:type, :breed, :image, :description)";
        try ( Connection connection = sql2o.open() ) {
            int id = (int) connection.createQuery(sql, true)
                    .bind(animals)
                    .executeUpdate()
                    .getKey();
            animals.setId(id);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Animals> getAll() {
        try ( Connection connection = sql2o.open() ) {
            return connection.createQuery("SELECT * FROM animals")
                    .executeAndFetch(Animals.class);
        }
    }

    @Override
    public Animals getById(int id) {
        try ( Connection connection = sql2o.open() ) {
            return connection.createQuery("SELECT * FROM animals WHERE id=:id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(Animals.class);
        }
    }

    @Override
    public void clear() {
        String sql = "DELETE FROM animals";
        try (Connection connection = sql2o.open()){
            connection.createQuery(sql)
                    .executeUpdate();
        } catch (Sql2oException ex){ System.out.println(ex);}
    }
}