package lesson1.elloWorld;

import lesson1.helloWorldLibrary.WorldLibrary;

public class HelloWorld {

    public static void main(String[] args) {

        WorldLibrary theWorld = new WorldLibrary();
        theWorld.setPlanetName("Earth");


        System.out.println("Welcome to JAVA2 course!" + WorldLibrary.getName());
        System.out.println("I live on planet named" + theWorld.getPlanetName());

        theWorld.setPlanetName("Mars");
        System.out.println("But now i decided to go to " + theWorld.getPlanetName());
    }
}
