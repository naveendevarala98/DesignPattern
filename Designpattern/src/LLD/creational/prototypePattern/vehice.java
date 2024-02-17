package LLD.creational.prototypePattern;

public abstract class vehice implements Cloneable{

    private int wheelCount;

    public vehice(int count){
        this.wheelCount = count;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public vehice clone() throws CloneNotSupportedException {
        return (vehice) super.clone();
    }
}
