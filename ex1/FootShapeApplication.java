import java.util.Scanner;

//Abstract class
abstract class FootShape {
    public abstract void draw();
}

//Ellipse class
class Ellipse extends FootShape {
    @Override
    public void draw() {
        System.out.println("draw ellipse");
    }
}

//Rectangle class
class Rectangle extends FootShape {
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}

//Foot class
class Foot {
    public void draw(FootShape shape) {
        shape.draw();
    }
}

public class FootShapeApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Foot foot = new Foot();
        FootShape shape = null;

        while (true) {
            System.out.println("What to draw? 1. Ellipse, 2. Rectangle");
            int choice = scanner.nextInt();

            if (choice == 1) {
                shape = new Ellipse();
            } else if (choice == 2) {
                shape = new Rectangle();
            } else {
                System.out.println("Invalid choice.");
                break;
            }

            foot.draw(shape);
        }

        scanner.close();
    }
}
