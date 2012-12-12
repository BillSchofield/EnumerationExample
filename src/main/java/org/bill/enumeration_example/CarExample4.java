package org.bill.enumeration_example;

public class CarExample4 extends Car {
    private Heading heading;

    public CarExample4(Position2d position, Heading heading) {
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

    public interface Heading{

        public static final Heading NORTH = new NorthHeading();
        public static final Heading EAST = new EastHeading();
        public static final Heading SOUTH = new SouthHeading();
        public static final Heading WEST = new WestHeading();

        void moveForward(Position2d position);
        Heading turnRight();

        static class NorthHeading implements Heading {
            public void moveForward(Position2d position) {
                position.y++;
            }
            public Heading turnRight() {
                return EAST;
            }
            public String toString(){
                return "North";
            }
        }
        static class EastHeading implements Heading {
            public void moveForward(Position2d position) {
                position.x++;
            }
            public Heading turnRight() {
                return SOUTH;
            }
            public String toString(){
                return "East";
            }
        }
        static class SouthHeading implements Heading {
            public void moveForward(Position2d position) {
                position.y--;
            }
            public Heading turnRight() {
                return WEST;
            }
            public String toString(){
                return "South";
            }
        }
        static class WestHeading implements Heading {
            public void moveForward(Position2d position) {
                position.x--;
            }
            public Heading turnRight() {
                return NORTH;
            }
            public String toString(){
                return "West";
            }
        }
    }
}
