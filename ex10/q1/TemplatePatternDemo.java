package q1;
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game football = new Football();
        football.play();

        System.out.println();

        Game basketball = new Basketball();
        basketball.play();
    }
}
