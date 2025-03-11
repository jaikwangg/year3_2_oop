package q4;

public class CoffeePot extends Device {
    public CoffeePot() {
        super("Coffee Pot");
    }

    public void activate() {
        System.out.println("Coffee Pot is brewing some fresh coffee...");
        mediator.sendEvent("CoffeePotDone", this);
    }

    @Override
    public void receiveEvent(String event) {
        if (event.equals("AlarmTriggered")) {
            activate();
        }
    }
}
