public class LiveResult implements Observer {
    private String name;

    public LiveResult(String name) {
        this.name = name;
    }

    @Override
    public void update(String score) {
        System.out.println(name + ": " + score);
    }
}
