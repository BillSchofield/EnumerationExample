package org.bill.enumeration_example;

public class CarExample1 extends Car{
    private String direction;

    public CarExample1(Position2d position, String direction) {
        super(position);
        this.direction = direction;
    }

    public void moveForward() {
        System.out.println("Car moves forward");
        if (direction.equals("North")){
            position.y++;
        } else if (direction.equals("South")){
            position.y--;
        } else if (direction.equals("East")){
            position.x++;
        } else if (direction.equals("West")){
            position.x--;
        }
    }

    public void turnRight() {
        System.out.println("Car turns right");
        if (direction.equals("North")){
            direction = "East";
        } else if (direction.equals("South")){
            direction = "West";
        } else if (direction.equals("East")){
            direction = "South";
        } else if (direction.equals("West")){
            direction = "North";
        }
    }

    @Override
    protected String direction() {
        return direction;
    }
}
