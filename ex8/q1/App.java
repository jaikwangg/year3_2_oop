public class App {
    public static void main(String[] args) {
        ImageManager manager = new ImageManager();
		manager.setRenderer(new SmartphoneRenderer());
		manager.show();

        manager.setRenderer(new TVRenderer());
        manager.show();
        
        manager.setRenderer(new LaptopRenderer());
        manager.show();
    }
}
//using Strategy Pattern