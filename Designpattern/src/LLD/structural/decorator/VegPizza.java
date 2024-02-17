package LLD.structural.decorator;

public class VegPizza implements pizza {
    @Override
    public String bake() {
        return "veg pizza";
    }
}
