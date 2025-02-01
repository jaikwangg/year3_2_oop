public class AutomobileDisplayFactory {
    public static AutomobileDisplay getDisplay(String type) {
        if (type.equals("Ford")) {
            return new FordDisplay();
        } else if (type.equals("Toyota")) {
            return new ToyotaDisplay();
        } else {
            return null;
        }
    }
    
}
