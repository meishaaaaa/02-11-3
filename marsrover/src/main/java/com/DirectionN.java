package com;

public class DirectionN extends Direction {

    public DirectionN(char direction) {
        super(direction);
    }

    @Override
    public Direction turnLeft() {
        return new DirectionN('W');
    }

    @Override
    public Direction turnRight(){
        return new DirectionN('E');
    }
}
