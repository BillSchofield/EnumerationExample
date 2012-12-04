package org.bill.enumeration_example;

public class CarExample3 extends Car {
    private Heading direction;

    public CarExample3(Position2d position, CarExample3.Heading direction) {
        super(position);
        this.direction = direction;
    }

    @Override
    public void moveForward() {
        System.out.println("Car moves forward");
        direction.moveForward(position);
    }

    @Override
    public void turnRight() {
        System.out.println("Car turns right");
        direction = direction.turnRight();
    }

    @Override
    protected String direction() {
        return direction.toString();
    }

    public enum Heading {
        NORTH {
            public void moveForward(Position2d position) {
                position.y++;
            }
            public Heading turnRight() {
                return EAST;
            }
        },
        SOUTH {
            public void moveForward(Position2d position) {
                position.y--;
            }
            public Heading turnRight() {
                return WEST;
            }
        },
        EAST {
            public void moveForward(Position2d position) {
                position.x++;
            }
            public Heading turnRight() {
                return SOUTH;
            }
        },
        WEST {
            public void moveForward(Position2d position) {
                position.x--;

            }
            public Heading turnRight() {
                return NORTH;
            }
    };

//        private Heading rightDirection;
//        private Heading(Heading rightDirection){
//            this.rightDirection = rightDirection;
//        }
        public abstract void moveForward(Position2d position);
        public abstract Heading turnRight();
    }
}
