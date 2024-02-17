package LLD.structural.decorator;

public class ExtraCheeseDecorator extends PizzaDecorator{

    public ExtraCheeseDecorator(pizza pizza){
        super(pizza);
    }
    @Override
    public String bake() {
        return pizza.bake()+addCheese();
    }

    private String addCheese(){
        return "cheese";
    }
}
