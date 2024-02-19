package NewØvelse;

import java.util.ArrayList;

public interface Vehicle {
    public void drive();
    public void stop();
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Cyklen cykler :-)");
    }
    public void stop() {
        System.out.println("Cyklen stoppede :-) ");
    }
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Bilen kører :-)");
    }
    public void stop() {
        System.out.println("Bilen stoppede :-) ");
    }
}

class New {
    public static void main(String[] args) {
        ArrayList<Vehicle> ve = new ArrayList<>();
        ve.add(new Bike());
        ve.add(new Car());

        for (Vehicle v: ve) {
            System.out.println(v);
            v.drive();
            v.stop();
        }
    }

}
