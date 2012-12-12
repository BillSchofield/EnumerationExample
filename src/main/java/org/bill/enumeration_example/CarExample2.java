package org.bill.enumeration_example;

import static org.bill.enumeration_example.CarExample2.Heading.*;

public class CarExample2 extends Car {
    public static enum Heading {
        North, South, East, West
    }

    Heading heading;

    public CarExample2(Position2d position, Heading heading) {
        super(position);
        this.heading = heading;
    }

    @Override
    public void moveForward() {
        switch(heading){
            case North:
                position.y++;
                break;
            case South:
                position.y--;
                break;
            case East:
                position.x++;
                break;
            case West:
                position.x--;
                break;
        }
    }

    public void turnRight() {
        switch(heading){
            case North:
                heading = East;
                break;
            case South:
                heading = West;
                break;
            case East:
                heading = South;
                break;
            case West:
                heading = North;
                break;
        }
    }

    @Override
    protected String heading() {
        return heading.toString();
    }
}
