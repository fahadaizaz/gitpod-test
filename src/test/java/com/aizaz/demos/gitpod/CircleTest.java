package com.aizaz.demos.gitpod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void checkCorners() {
        Circle circle = new Circle();
        Assertions.assertEquals(0, circle.checkCorners());
    }
}