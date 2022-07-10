package com.aizaz.demos.gitpod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void checkSquareCorners() {
        Square square = new Square();
        Assertions.assertEquals(4, square.checkCorners());
    }
}