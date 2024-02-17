package LLD.structural.decorator;

public class JalpenoDecorator extends PizzaDecorator{

    public JalpenoDecorator(pizza pizza){
        super(pizza);
    }
    @Override
    public String bake() {
        return pizza.bake()+addjalpeno();
    }

    private String addjalpeno(){
        return "jalpeno";
    }
}
