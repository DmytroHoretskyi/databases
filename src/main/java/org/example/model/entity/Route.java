package org.example.model.entity;

import java.util.Objects;

public class Route {

    private Integer id;

    private String start;

    private String end;

    private  String data;

    private Integer price;

    private Integer idUser;

    private Integer idDriver;

    public Route() {
    }

    public Route(Integer id, String start, String end, String data, Integer price, Integer idUser, Integer idDriver) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.data = data;
        this.price = price;
        this.idUser = idUser;
        this.idDriver = idDriver;
    }

    public Route(String start, String end, String data, Integer price, Integer idUser, Integer idDriver) {
        this.start = start;
        this.end = end;
        this.data = data;
        this.price = price;
        this.idUser = idUser;
        this.idDriver = idDriver;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", data='" + data + '\'' +
                ", price=" + price +
                ", idUser=" + idUser +
                ", idDriver=" + idDriver +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return Objects.equals(id, route.id) && Objects.equals(start, route.start) && Objects.equals(end, route.end) && Objects.equals(data, route.data) && Objects.equals(price, route.price) && Objects.equals(idUser, route.idUser) && Objects.equals(idDriver, route.idDriver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, start, end, data, price, idUser, idDriver);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(Integer idDriver) {
        this.idDriver = idDriver;
    }
}
