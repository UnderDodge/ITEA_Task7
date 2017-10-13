package com.playstation.store;

/**
 * Created by Администратор on 13.10.2017.
 */
public class Zombie {
    String name;

    Zombie(String name){
        this.name = name;
        System.out.println("GARGGHHHHH "+name);
    }

    public void eatHuman(Human human){
        System.out.println("OH GOD! "+name+" have eaten "+human.getName()+(human.getWeight()>100?" |  Ummmmm ffffaaat hummman tasty :)":" |  ugh ddddis one is only bones :("));
    }
}
