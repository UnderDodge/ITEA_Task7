package com.playstation.store;

/**
 * Created by Администратор on 13.10.2017.
 */
public class Fight {
    public static void main (String [] args){
        System.out.println("Start");
        Human human1 = new Human("Cartman",150);
        Human human2 = new Human("Canny",60);

        Zombie zombie1 = new Zombie("Starving Zombie");

        zombie1.eatHuman(human2);
        zombie1.eatHuman(human1);
        System.out.println("End");

        System.out.println("Commits are done!");
    }
}
