package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CatTest {

    @Test
    void name() {
        Cat modifiedCat = new Cat("Garfield", 39)
                .withName("Felix");
        Assertions.assertEquals("Felix", modifiedCat.name());
    }
}