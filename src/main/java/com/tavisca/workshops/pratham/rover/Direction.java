package com.tavisca.workshops.pratham.rover;

class TwoDVector {
    public final int x;
    public final int y;
    public TwoDVector(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public interface Direction {
    public TwoDVector move(TwoDVector v);
}
