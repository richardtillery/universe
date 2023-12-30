package com.world;

import com.world.record.Universe;

public class UniverseCreator {

    public static void main(String[] args) {
        Universe one = new Universe("One", Long.MAX_VALUE);
        Universe two = new Universe("Two", 3600l);
        Universe three = new Universe("Three", null);
        System.out.println("Hello world!");
        System.out.println(String.format("Universes One [%s], Two [%s], Three [%s]", one, two, three));
    }
}