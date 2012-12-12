package org.bill.enumeration_example;

public class EnumerationExample {

    public static void main(String args[]){
        moveAndReport(new CarExample1(new Position2d(0, 0), "North"));
        moveAndReport(new CarExample2(new Position2d(0, 0), CarExample2.Heading.North));
        moveAndReport(new CarExample3(new Position2d(0, 0), CarExample3.Heading.North));
        moveAndReport(new CarExample4(new Position2d(0, 0), CarExample4.Heading.NORTH));
        CarExample5Heading.init();
        moveAndReport(new CarExample5(new Position2d(0, 0), CarExample5Heading.NORTH));

    }

    private static void moveAndReport(Car car) {
        System.out.println(car);
        System.out.println("Car moves forward");
        car.moveForward();
        System.out.println(car);
        System.out.println("Car turns right");
        car.turnRight();
        System.out.println(car);
        System.out.println();
    }
}
