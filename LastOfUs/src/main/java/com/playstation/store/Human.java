package com.playstation.store;

/**
 * Created by Администратор on 13.10.2017.
 */
public class Human {

    String name;
    int weight;

    Human(String name, int weight){
        this.name = name;
        this.weight = weight;
        System.out.println("Hello I am a human: "+name+" | "+(weight>100?" I'm fat":" I'm skinny"));
    }

    public String getName() {
        return name;
    }

    public int getWeight() {

        return weight;
    }
}
