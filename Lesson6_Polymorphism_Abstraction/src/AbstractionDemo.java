
abstract class Appliance {

    abstract void operate();

    void turnOff() {
        System.out.println("The appliance is turned off.");
    }
}

class WashingMachine extends Appliance {

    @Override
    void operate() {
        System.out.println("Washing machine is washing clothes.");
    }
}

class ElectricFan extends Appliance {

    @Override
    void operate() {
        System.out.println("Electric fan is circulating air.");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        WashingMachine washer = new WashingMachine();
        ElectricFan fan = new ElectricFan();

        System.out.println("=== ABSTRACTION DEMO ===");

        washer.operate();
        washer.turnOff();

        System.out.println();

        fan.operate();
        fan.turnOff();
    }
}
