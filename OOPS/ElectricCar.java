package OOPS;

public class ElectricCar extends Car {
    @Override
    public final String drive() {
        return "Drive Electric car";
    }

    public static void main(String[] args) {
        final Car c = new Car();
        System.out.println(c.drive());

        final ElectricCar ec = new ElectricCar();
        System.out.println(ec.drive());
    }
}

class AutoMobile {
    private String drive() {
        return "Drive vehicle";
    }
}

class Car extends AutoMobile {
    protected String drive() {
        return "Drive car";
    }
}
