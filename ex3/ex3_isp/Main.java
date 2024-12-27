package ex3.ex3_isp;

public class Main {
    public static void main(String[] args) {
        IEmployee employee = new Employee();
        System.out.println("Employee:");
        employee.salary();

        IManager manager = new Manager();
        System.out.println("Manager:");
        manager.salary();
        manager.hire();
        manager.train();
        manager.addBonus();

        ICEO ceo = new CEO();
        System.out.println("CEO:");
        ceo.salary();
        ceo.hire();
        ceo.train();
        ceo.addBonus();
        ceo.makeDecisions();
        ceo.addStocks();
    }
}
