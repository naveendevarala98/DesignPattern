package LLD.creational.prototypePattern;

public class Prototypemain {

    public static void main(String[] args) throws CloneNotSupportedException {

        VehicleRegistry vehicleRegistry = new VehicleRegistry();
        System.out.println("main");
        vehice vehice = vehicleRegistry.getInstance("two");

        System.out.println(vehice.getWheelCount());

        vehice fourvehice = vehicleRegistry.getInstance("four");

        System.out.println(fourvehice.getWheelCount());
    }
}
