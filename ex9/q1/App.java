import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Subject
        FootballScore footballScore = new FootballScore();

        //Observer
        LiveResult screen1 = new LiveResult("live result(1):");
        LiveResult screen2 = new LiveResult("live result(2):");

        footballScore.registerObserver(screen1);
        footballScore.registerObserver(screen2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Score");

        while(true) {
            System.out.print("Enter Score");
            String score = sc.nextLine().trim();
            if(score.equals("")) {
                break;
            }
            // แจ้งสกอร์
            footballScore.notifyObservers(score);
        }

        System.out.println("End Program");
        sc.close();
    }
}
//Proxy + Observer 