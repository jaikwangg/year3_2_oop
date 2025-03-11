package q4;

public class Sprinkler extends Device {
    public Sprinkler() {
        super("Sprinkler");
    }

    public void activate() {
        System.out.println("Sprinkler is now watering the garden...");
        mediator.sendEvent("SprinklerDone", this);
    }

    @Override
    public void receiveEvent(String event) {
        if (event.equals("AlarmTriggered")) {
            activate();
        }
    }
}
