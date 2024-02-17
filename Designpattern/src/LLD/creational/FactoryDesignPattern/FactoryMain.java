package LLD.creational.FactoryDesignPattern;

public class FactoryMain {

    public static void main(String[] args) {

        OperatingSystem windows = OSFactory.getInstance(1,"win1","windows");

        windows.getCommands();
        windows.a();

        OperatingSystem linux = OSFactory.getInstance(1,"linux1","linux");
        linux.getCommands();
        linux.a();

    }
}
