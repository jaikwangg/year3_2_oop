public class WidgetFactoryProvider {
    public static IWidgetFactory getWidgetFactory(String type) {
        if (type.equals("PM")) {
            return PMWidgetFactory.getMotifWidgetFactory();
        } else if (type.equals("Motif")) {
            return MotifWidgetFactory.getMotifWidgetFactory();
        } else {
            return null;
        }
    }
}
