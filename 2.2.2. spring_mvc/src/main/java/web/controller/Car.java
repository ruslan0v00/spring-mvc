package web.controller;

import org.springframework.stereotype.Controller;


public class Car {
    private int id;
    private String name;
    private int price;

    public Car(String s, int i, int price) {
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
