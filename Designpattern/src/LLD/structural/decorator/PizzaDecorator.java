package LLD.structural.decorator;

public abstract class PizzaDecorator implements pizza{

    protected pizza pizza;

    public PizzaDecorator(pizza pizza){
        this.pizza=pizza;
    }
}
