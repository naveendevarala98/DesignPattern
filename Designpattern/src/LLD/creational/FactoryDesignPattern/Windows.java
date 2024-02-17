package LLD.creational.FactoryDesignPattern;

public class Windows extends OperatingSystem{
    public Windows(int version, String type) {
        super(version, type);
    }

    @Override
    public void getCommands() {
        System.out.println("windows");
    }

    @Override
    protected void a() {
        System.out.println("windows protected");
    }
}
