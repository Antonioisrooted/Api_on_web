CREATE DATABASE animals_database;
\c animals_database;
CREATE TABLE animals(id serial PRIMARY KEY, type VARCHAR, breed VARCHAR, image VARCHAR, description VARCHAR);
CREATE DATABASE animals_test_database WITH TEMPLATE animals_database;