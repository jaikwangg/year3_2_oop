import java.util.List;
import java.util.ArrayList;

public class FootballScore implements Subject {
    private List<Observer> observers;

    public FootballScore() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String score) {
        for (Observer o : observers) {
            o.update(score);
        }
    }
}
