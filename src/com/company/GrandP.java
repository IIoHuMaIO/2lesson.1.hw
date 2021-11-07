package com.company;

public class GrandP {
    private int age;
    private int height;
    private int weight;
    private LivesIn LivesIn;

    public GrandP(int age, int height, int weight, com.company.LivesIn livesIn) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        LivesIn = livesIn;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public com.company.LivesIn getLivesIn() {
        return LivesIn;
    }

    public GrandP(String name, int age, int height, int weight, LivesIn livesIn) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        LivesIn = livesIn;
    }
}
