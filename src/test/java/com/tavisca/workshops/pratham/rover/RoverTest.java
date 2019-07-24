package com.tavisca.workshops.pratham.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    @Test
    void RoverInitilizing() {
        Rover r = new Rover(new Vector(10, 10, 'N'));
        assertEquals("10 10 N", r.getPosition());
    }

    @Test
    void RoverTurnLeftWhenFacingNorth(){
        Rover r = new Rover(new Vector(10, 10, 'N'));
        r.turnLeft();
        assertEquals("10 10 W", r.getPosition());
    }

    @Test
    void RoverTurnLeftWhenFacingWest(){
        Rover r = new Rover(new Vector(10, 10, 'W'));
        r.turnLeft();
        assertEquals("10 10 S", r.getPosition());
    }

    @Test
    void RoverTurnLeftWhenFacingSouth(){
        Rover r = new Rover(new Vector(10, 10, 'S'));
        r.turnLeft();
        assertEquals("10 10 E", r.getPosition());
    }

    @Test
    void RoverTurnLeftWhenFacingEast(){
        Rover r = new Rover(new Vector(10, 10, 'E'));
        r.turnLeft();
        assertEquals("10 10 N", r.getPosition());
    }

    @Test
    void RoverTurnRightWhenFacingNorth(){
        Rover r = new Rover(new Vector(10, 10, 'N'));
        r.turnLeft();
        assertEquals("10 10 E", r.getPosition());
    }

    @Test
    void RoverTurnRightWhenFacingWest(){
        Rover r = new Rover(new Vector(10, 10, 'W'));
        r.turnLeft();
        assertEquals("10 10 N", r.getPosition());
    }

    @Test
    void RoverTurnRightWhenFacingSouth(){
        Rover r = new Rover(new Vector(10, 10, 'S'));
        r.turnLeft();
        assertEquals("10 10 W", r.getPosition());
    }

    @Test
    void RoverTurnRightWhenFacingEast(){
        Rover r = new Rover(new Vector(10, 10, 'E'));
        r.turnLeft();
        assertEquals("10 10 S", r.getPosition());
    }

    @Test
    void RoverCanMoveWhenFacingNorth(){
        Rover r = new Rover(new Vector(10, 10, 'N'));
        r.move();
        assertEquals("10 11 N", r.getPosition());
    }
}
