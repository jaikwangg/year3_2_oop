public class MilkDecorator extends BeverageDecorator{
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "milk ";
    }
}
