package Øvelse;

import java.util.ArrayList;

public class Car {
    double topSpeed;

    public Car(double topSpeed) {
        this.topSpeed = topSpeed;
    }
    public String toString() {
        return " " + topSpeed;
    }

    /*public Car findFastestCar(ArrayList<Car> cars) {
        Car fastestCar = cars.get(0);

        for (Car c: cars) {
            if(c.topSpeed> fastestCar.topSpeed) {
                fastestCar = c;
            }
        }
        System.out.println("Den hurtigste bil: " + fastestCar);
        return fastestCar;

    }*/

    public void fastestCar(ArrayList<Car> cc) {
        Car fastCar = cc.getFirst();
        for (Car c: cc) {
            if (c.topSpeed>fastCar.topSpeed) {
                fastCar = c;
            }
        }
        System.out.println("Fastest car: " + fastCar);
    }
    public static void addCar(ArrayList<Car> cars, double topspeed) {
        Car newCar = new Car(topspeed);
        cars.add(newCar);
        System.out.println("New car added: " + newCar.topSpeed + " mph.");
    }

    public static void main(String[] args) {
        Car c = new Car(100);
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car(900));
        carList.add(new Car(130));
        carList.add(new Car(1000));
        addCar(carList, 300);
        addCar(carList, 150);


        for (Car cc: carList) {
            System.out.println(cc);
        }
        //c.findFastestCar(carList);
        c.fastestCar(carList);
    }
}
