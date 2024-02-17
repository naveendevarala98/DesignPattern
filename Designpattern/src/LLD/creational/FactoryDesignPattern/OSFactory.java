package LLD.creational.FactoryDesignPattern;

public class OSFactory {

    private OSFactory(){
    }

    public static OperatingSystem getInstance(int version, String type, String os){
        switch(os){
            case "windows":
                return new Windows(version,type);
            case "linux":
                return new Linux(version,type);
            default:
                throw new IllegalArgumentException("os not supported");

        }
    }
}
