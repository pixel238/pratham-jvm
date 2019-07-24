package com.tavisca.workshops.pratham.rover;

import java.util.List;

public class Rover {
    private Vector vector;

    public Rover(final Vector vector) {
        this.vector = vector;
    }

    public void turnRight() {
        this.vector=this.vector.turnRight();
    }

    public void turnLeft() {
        this.vector=this.vector.turnLeft();
    }

    public void move() {
        this.vector = this.vector.moveForward();
    }

    public String getPosition() {
        return this.vector.x + " " + this.vector.y + " " + this.vector.direction;
    }
}
