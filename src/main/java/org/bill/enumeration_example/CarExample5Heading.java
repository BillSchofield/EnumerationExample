package org.bill.enumeration_example;

public class CarExample5Heading {
    public static CarExample5Heading NORTH = null;
    public static CarExample5Heading EAST = null;
    public static CarExample5Heading SOUTH = null;
    public static CarExample5Heading WEST = null;

    private CarExample5Heading headingAfterTurningRight;
    private String name;
    private MoveForwardStrategy moveForwardStrategy;

    public CarExample5Heading(String name, MoveForwardStrategy moveForwardStrategy) {
        this.name = name;
        this.moveForwardStrategy = moveForwardStrategy;
    }

    private void setHeadingAfterTurningRight(CarExample5Heading newHeading){
        this.headingAfterTurningRight = newHeading;
    }

    public static void init(){
        NORTH = new CarExample5Heading("North", new NorthHeadingMoveForwardStrategy());
        EAST = new CarExample5Heading("East", new EastHeadingMoveForwardStrategy());
        SOUTH = new CarExample5Heading("South", new SouthHeadingMoveForwardStrategy());
        WEST = new CarExample5Heading("West", new WestHeadingMoveForwardStrategy());
        NORTH.setHeadingAfterTurningRight(EAST);
        EAST.setHeadingAfterTurningRight(SOUTH);
        SOUTH.setHeadingAfterTurningRight(WEST);
        WEST.setHeadingAfterTurningRight(NORTH);
    }

    public void moveForward(Position2d position){
        moveForwardStrategy.moveForward(position);
    }

    CarExample5Heading turnRight() {
        return headingAfterTurningRight;
    }

    public String toString(){
        return name;
    }

    interface MoveForwardStrategy {
        void moveForward(Position2d position);
    }

    private static class NorthHeadingMoveForwardStrategy implements MoveForwardStrategy {
        public void moveForward(Position2d position) {
            position.y++;
        }
    }
    private static class EastHeadingMoveForwardStrategy implements MoveForwardStrategy {
        public void moveForward(Position2d position) {
            position.x++;
        }
    }
    private static class SouthHeadingMoveForwardStrategy implements MoveForwardStrategy {
        public void moveForward(Position2d position) {
            position.y--;
        }
    }
    private static class WestHeadingMoveForwardStrategy implements MoveForwardStrategy {
        public void moveForward(Position2d position) {
            position.x--;
        }
    }
}
