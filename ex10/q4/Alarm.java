package q4;

public class Alarm extends Device {
    public Alarm() {
        super("Alarm");
    }

    public void doAlarm() {
        System.out.println("Alarm: Time's up! Sending wake-up signals...");
        mediator.sendEvent("AlarmTriggered", this);
    }

    @Override
    public void receiveEvent(String event) {
        System.out.println("Alarm has detected: " + event);
    }
}
