package com;

public class DirectionE extends Direction {

    public DirectionE(char direction) {
        super(direction);
    }

    @Override
    public Direction turnLeft() {
        return new DirectionE('N');
    }

    @Override
    public Direction turnRight(){
        return new DirectionE('E');
    }
}
