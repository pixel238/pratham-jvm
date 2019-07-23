package com.tavisca.workshops.pratham.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {
    @Test
    void vectorInitilizationWithGivenPositionDetails() {
        Vector r = new Vector(10,10,'N');
        assertEquals(10,r.X());
        assertEquals(10,r.Y());
        assertEquals('N',r.Direction());
    }

    @Test
    void vectorCanRotateLeftFromNorth(){
        Vector r = new Vector(10,10,'N');
        Vector newVector=r.turnLeft();
        assertEquals('W',newVector.Direction());
    }

    @Test
    void vectorCanRotateLeftFromWest(){
        Vector r = new Vector(10,10,'W');
        Vector newVector=r.turnLeft();
        assertEquals('S',newVector.Direction());
    }

    @Test
    void vectorCanRotateLeftFromSouth(){
        Vector r = new Vector(10,10,'S');
        Vector newVector=r.turnLeft();
        assertEquals('E',newVector.Direction());
    }

    @Test
    void vectorCanRotateLeftFromEast(){
        Vector r = new Vector(10,10,'E');
        Vector newVector=r.turnLeft();
        assertEquals('N',newVector.Direction());
    }

    @Test
    void vectorCanRotateRightFromNorth(){
        Vector r = new Vector(10,10,'N');
        Vector newVector=r.turnRight();
        assertEquals('E',newVector.Direction());
    }

    @Test
    void vectorCanRotateRightFromWest(){
        Vector r = new Vector(10,10,'W');
        Vector newVector=r.turnRight();
        assertEquals('N',newVector.Direction());
    }

    @Test
    void vectorCanRotateRightFromSouth(){
        Vector r = new Vector(10,10,'S');
        Vector newVector=r.turnRight();
        assertEquals('W',newVector.Direction());
    }

    @Test
    void vectorCanRotateRightFromEast(){
        Vector r = new Vector(10,10,'E');
        Vector newVector=r.turnRight();
        assertEquals('S',newVector.Direction());
    }

    @Test
    void vectorCanMove(){
        Vector r = new Vector(10,10,'N');
        Vector newVector=
    }
}