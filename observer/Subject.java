interface Subject {

    void subscribe(Observer ob);

    void unsubscribe(Observer ob);

    void newVideoUploaded(String title);

}