package com.tillery.record;

public record Universe(String name, Long size) {

    public Universe {
        name = name.toUpperCase();
        size = size == null ? Long.MAX_VALUE : size;
    }
}
