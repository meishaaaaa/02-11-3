package com;

public class DirectionS extends Direction {

    public DirectionS(char direction) {
        super(direction);
    }

    @Override
    public Direction turnLeft() {
        return new DirectionS('N');
    }

    @Override
    public Direction turnRight(){
        return new DirectionS('N');
    }
}
