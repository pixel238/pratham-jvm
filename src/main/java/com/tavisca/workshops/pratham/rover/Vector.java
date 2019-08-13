package com.tavisca.workshops.pratham.rover;

import java.util.HashMap;

public class Vector {
    public final int x;
    public final int y;
    public final char direction;

    public Vector(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    private static HashMap<Character,Character> leftMap
            = new HashMap<Character, Character>(){{
                put('N','W');
                put('W','S');
                put('S','E');
                put('E','N');
    }};

    private static HashMap<Character,Character> RightMap
            = new HashMap<Character, Character>(){{
        put('N','E');
        put('W','N');
        put('S','W');
        put('E','S');
    }};

    public Vector turnLeft() {
        return new Vector(this.x,this.y,leftMap.get(this.direction));
    }

    public Vector turnRight() {
        return new Vector(this.x,this.y,RightMap.get(this.direction));
    }


    public Vector moveForward() {
        switch(direction)
        {
            case 'N':
                return new Vector(this.x,this.y+1,this.direction);
            case 'S':
                return new Vector(this.x,this.y-1,this.direction);
            case 'E':
                return new Vector(this.x+1,this.y,this.direction);
            case 'W':
                return new Vector(this.x-1,this.y,this.direction);
            default:
                throw new IllegalStateException("Unexpected value: " + direction);
        }
    }
}
