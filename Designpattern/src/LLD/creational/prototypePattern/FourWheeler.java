package LLD.creational.prototypePattern;

public class FourWheeler extends vehice{
    public FourWheeler(int count) {
        super(count);
    }

    public FourWheeler Clone() throws CloneNotSupportedException {
        return (FourWheeler) super.clone();
    }

    public FourWheeler clone() throws CloneNotSupportedException {
        return (FourWheeler) super.clone();
    }
}
