import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    List<Observer> subcribers = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        this.subcribers.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        this.subcribers.remove(ob);
    }

    @Override
    public void newVideoUploaded(String title) {

        for (Observer ob : this.subcribers) {
            ob.notified(title);
        }

    }

}
