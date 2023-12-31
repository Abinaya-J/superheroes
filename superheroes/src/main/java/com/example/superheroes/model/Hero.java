package com.example.superheroes.model;

import jakarta.persistence.*;

@Entity
@Table(name="heroes")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String alias;
    private String superpower;

    private int teamid;

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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSuperPower() {
        return superpower;
    }

    public void setSuperPower(String superPower) {
        this.superpower = superPower;
    }

    public int getTeamID() {
        return teamid;
    }

    public void setTeamID(int teamID) {
        this.teamid = teamID;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", superPower='" + superpower + '\'' +
                ", teamID=" + teamid +
                '}';
    }
}
