package org.bill.enumeration_example;

import static org.bill.enumeration_example.CarExample2.Heading.*;

public class CarExample2 extends Car {
    public static enum Heading {
        NORTH, SOUTH, EAST, WEST
    }

    Heading direction;

    public CarExample2(Position2d position, Heading direction) {
        super(position);
        this.direction = direction;
    }

    @Override
    public void moveForward() {
        System.out.println("Car moves forward");
        switch(direction){
            case NORTH:
                position.y++;
                break;
            case SOUTH:
                position.y--;
                break;
            case EAST:
                position.x++;
                break;
            case WEST:
                position.x--;
                break;
        }
    }

    public void turnRight() {
        System.out.println("Car turns right");
        switch(direction){
            case NORTH:
                direction = EAST;
                break;
            case SOUTH:
                direction = WEST;
                break;
            case EAST:
                direction = SOUTH;
                break;
            case WEST:
                direction = NORTH;
                break;
        }
    }

    @Override
    protected String direction() {
        return direction.toString();
    }
}
