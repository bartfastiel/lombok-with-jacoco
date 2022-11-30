package org.example;

import lombok.With;

@With
public record Cat(
        String name,
        int age) {
}
