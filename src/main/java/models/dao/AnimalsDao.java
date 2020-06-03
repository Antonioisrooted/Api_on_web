package models.dao;

import models.Animals;

import java.util.List;

public interface AnimalsDao {
    void create(Animals animals);

    List<Animals>getAll();

    Animals getById(int id);

    void clear();
}
