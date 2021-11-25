package org.example.model.entity;

import java.util.Objects;

public class Rating {

    private Integer id;

    private Integer stars;

    public Rating() {
    }

    public Rating(Integer stars) {
        this.stars = stars;
    }

    public Rating(Integer id, Integer stars) {
        this.id = id;
        this.stars = stars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Raiting{" +
                "id=" + id +
                ", stars=" + stars +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rating rating = (Rating) o;
        return stars == rating.stars && Objects.equals(id, rating.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stars);
    }
}
