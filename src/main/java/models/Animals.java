package models;

import java.util.Objects;

public class Animals {
    private int id;
    private String type;
    private String breed;
    private String image;
    private String description;

    public Animals(String type, String breed, String image, String description) {
        this.type = type;
        this.breed = breed;
        this.image = image;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(type, animals.type) &&
                Objects.equals(breed, animals.breed) &&
                Objects.equals(image, animals.image) &&
                Objects.equals(description, animals.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, breed, image, description);
    }
}

