package com.company;

public class Main {

    public static void main(String[] args) {
        Job programmer = new Job("Programmer");
        Dad objectA = new Dad("Azamat",60,180,90,LivesIn.KYRGYSTAN,programmer);
        System.out.println(objectA.getInfo() );

        Job nothing = new Job("nothing");
        Son objectB = new Son("Akyl", 16,170,68,LivesIn.KYRGYSTAN,nothing,"School");
        System.out.println(objectB.getInfo());

        Job waiter = new Job("waiter");
        Son objectC = new Son("Anarbek", 21,183,101,LivesIn.KYRGYSTAN,waiter,"University");
        System.out.println(objectC.getInfo());





    }
}
