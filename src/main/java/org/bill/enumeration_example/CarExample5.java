package org.bill.enumeration_example;

public class CarExample5 extends Car {
    private CarExample5Heading heading;

    public CarExample5(Position2d position, CarExample5Heading heading) {
        super(position);
        this.heading = heading;
    }

    @Override
    public void moveForward() {
        heading.moveForward(position);
    }

    @Override
    public void turnRight() {
        heading = heading.turnRight();
    }

    @Override
    protected String heading() {
        return heading.toString();
    }
}
