/**
 * Coding Zombies, LLC 2016
 */
package com.codingzombies;

public class Printer {

    private String name;

    public Printer(String name) {
        super();
        this.name = name;
    }

    public void print(String stringToPrint) {
        System.out.println(name + ": " + stringToPrint);
    }

    @Override
    public String toString() {
        return "Printer [name=" + name + "]";
    }

}
