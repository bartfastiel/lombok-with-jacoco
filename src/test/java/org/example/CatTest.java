package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {

    @Test
    void name() {
        Cat modifiedCat = new Cat("Garfield", 39, "ginger", "tabby")
                .withName("Felix");
        assertEquals("Felix", modifiedCat.name());
    }

    @Test
    void age() {
        new Cat("Garfield", 39, "ginger", "tabby")
                .withAge(12);
    }

    @Test
    void color() {
        Cat cat = new Cat("Garfield", 39, "ginger", "tabby");
        assertEquals("ginger", cat.color());
    }
}