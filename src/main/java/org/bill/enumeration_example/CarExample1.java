package org.bill.enumeration_example;

public class CarExample1 extends Car{
    private String heading;

    public CarExample1(Position2d position, String heading) {
        super(position);
        this.heading = heading;
    }

    public void moveForward() {
        if (heading.equals("North")){
            position.y++;
        } else if (heading.equals("South")){
            position.y--;
        } else if (heading.equals("East")){
            position.x++;
        } else if (heading.equals("West")){
            position.x--;
        }
    }

    public void turnRight() {
        if (heading.equals("North")){
            heading = "East";
        } else if (heading.equals("South")){
            heading = "West";
        } else if (heading.equals("East")){
            heading = "South";
        } else if (heading.equals("West")){
            heading = "North";
        }
    }

    @Override
    protected String heading() {
        return heading;
    }
}
