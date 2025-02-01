import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter widget type (PM/Motif) ");
        String type = sc.nextLine();
        sc.close();
        IWidgetFactory factory = WidgetFactoryProvider.getWidgetFactory(type);
        IScrollBar scrollBar = factory.createScrollBar();
        IWindow window = factory.createWindow();
        displayWidget(window, scrollBar);
        
    }

    public static void displayWidget(IWindow window, IScrollBar scrollBar) {
        window.displayWindow();
        scrollBar.displayScrollBar();
    }
}
