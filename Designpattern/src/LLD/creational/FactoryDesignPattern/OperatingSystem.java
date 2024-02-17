package LLD.creational.FactoryDesignPattern;

public abstract class OperatingSystem {
    int version;
    String type;
    public OperatingSystem(int version, String type){
        this.type=type;
        this.version=version;
    }

    public abstract void getCommands();

    protected abstract void a();


}
