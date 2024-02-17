package LLD.creational.FactoryDesignPattern;

public class Linux extends OperatingSystem{
    public Linux(int version, String type) {
        super(version, type);
    }

    @Override
    public void getCommands() {
        System.out.println("linux");
    }

    @Override
    protected void a() {
        System.out.println("linux protected");
    }
}
