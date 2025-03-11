package q4;

public abstract class Device {
    protected SmartHomeMediator mediator;
    protected String name;

    public Device(String name) {
        this.name = name;
    }

    public void setMediator(SmartHomeMediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void receiveEvent(String event);
}
