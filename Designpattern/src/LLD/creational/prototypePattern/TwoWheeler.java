package LLD.creational.prototypePattern;

public class TwoWheeler extends vehice{

    boolean isElectric;
    public TwoWheeler(int count, boolean isElectric) {
        super(count);
        this.isElectric=isElectric;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public TwoWheeler Clone() throws CloneNotSupportedException {
        return (TwoWheeler) super.clone();
    }
}
