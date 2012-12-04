package org.bill.enumeration_example;

public abstract class Car {
    protected Position2d position;

    public Car(Position2d position) {
        this.position = position;
    }

    public abstract void moveForward();
    public abstract void turnRight();

    @Override
    public String toString(){
        return "Car is located at (" + position.x + ", " + position.y + ") and is heading " + direction();
    }

    protected abstract String direction();
}
