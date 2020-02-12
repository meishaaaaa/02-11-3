package com;

public class DirectionW extends Direction {


    public DirectionW(char direction) {
        super(direction);
    }

    @Override
    public Direction turnLeft() {
        return new DirectionW('S');
    }

    @Override
    public Direction turnRight(){
        return new DirectionW('S');
    }
}
