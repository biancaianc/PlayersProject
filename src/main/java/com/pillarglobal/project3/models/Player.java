package com.pillarglobal.project3.models;


import java.util.Objects;

public class Player {
    private int id;
    private String name;
    private String sport;
    private int age;

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

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Player(int id, String name, String sport, int age) {
        this.id = id;
        this.name = name;
        this.sport = sport;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && age == player.age && Objects.equals(name, player.name) && Objects.equals(sport, player.sport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sport, age);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                ", age=" + age +
                '}';
    }
}
