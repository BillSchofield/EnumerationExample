package org.bill.enumeration_example;

public class CarExample3 extends Car {
    private Heading heading;

    public CarExample3(Position2d position, CarExample3.Heading heading) {
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

    public enum Heading {
        North {
            public void moveForward(Position2d position) {
                position.y++;
            }
            public Heading turnRight() {
                return East;
            }
        },
        South {
            public void moveForward(Position2d position) {
                position.y--;
            }
            public Heading turnRight() {
                return West;
            }
        },
        East {
            public void moveForward(Position2d position) {
                position.x++;
            }
            public Heading turnRight() {
                return South;
            }
        },
        West {
            public void moveForward(Position2d position) {
                position.x--;

            }
            public Heading turnRight() {
                return North;
            }
    };

//        private Heading rightHeading;
//        private Heading(Heading rightHeading){
//            this.rightHeading = rightHeading;
//        }
        public abstract void moveForward(Position2d position);
        public abstract Heading turnRight();
    }
}
