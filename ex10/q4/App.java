package q4;

public class App {
    public static void main(String[] args) {
        SmartHomeController mediator = new SmartHomeController();

        Alarm alarm = new Alarm();
        Sprinkler sprinkler = new Sprinkler();
        CoffeePot coffeePot = new CoffeePot();

        mediator.registerDevice(alarm);
        mediator.registerDevice(sprinkler);
        mediator.registerDevice(coffeePot);

        alarm.doAlarm();
    }
}
