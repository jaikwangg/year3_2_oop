package ex3.ex3_isp;

public class CEO implements ICEO {
    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }

    @Override
    public void hire() {
        System.out.println("Hiring new employees...");
    }

    @Override
    public void train() {
        System.out.println("Training employees...");
    }

    @Override
    public void addBonus() {
        System.out.println("Adding bonus at the end of the year...");
    }

    @Override
    public void makeDecisions() {
        System.out.println("Making decisions...");
    }

    @Override
    public void addStocks() {
        System.out.println("Getting shares of the company as bonus...");
    }
}
