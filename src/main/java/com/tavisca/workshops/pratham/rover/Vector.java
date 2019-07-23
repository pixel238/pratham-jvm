package com.tavisca.workshops.pratham.rover;

public class Vector {
    private final int x;
    private final int y;
    private final char direction;

    public Vector(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int X() {
        return x;
    }

    public int Y() {
        return y;
    }

    public char Direction() {
        return direction;
    }

    public Vector turnLeft() {
        char newDirection;
        switch (direction) {
            case 'N':
                newDirection = 'W';
                break;
            case 'W':
                newDirection = 'S';
                break;
            case 'S':
                newDirection = 'E';
                break;
            case 'E':
                newDirection = 'N';
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + direction);
        }
        return new Vector(this.x,this.y,newDirection);
    }

    public Vector turnRight() {
        char newDirection;
        switch (direction) {
            case 'N':
                newDirection = 'E';
                break;
            case 'W':
                newDirection = 'N';
                break;
            case 'S':
                newDirection = 'W';
                break;
            case 'E':
                newDirection = 'S';
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + direction);
        }
        return new Vector(this.x,this.y,newDirection);
    }


}
