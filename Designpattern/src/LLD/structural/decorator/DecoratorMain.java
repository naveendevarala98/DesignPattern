package LLD.structural.decorator;

public class DecoratorMain {

    public static void main(String[] args) {

        pizza pizza = new JalpenoDecorator(new ExtraCheeseDecorator(new VegPizza()));

        System.out.println(pizza.bake());
    }
}
