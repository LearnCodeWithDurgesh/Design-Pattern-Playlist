public class Subsriber implements Observer {

    String name;

    Subsriber(String name) {
        this.name = name;
    }

    @Override
    public void notified(String title) {
        System.out.println("Hello " + this.name + " new video upload : " + title);
    }

}
