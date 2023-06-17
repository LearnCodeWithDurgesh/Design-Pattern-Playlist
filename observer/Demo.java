import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws NumberFormatException, IOException {

        Subject channel = new YoutubeChannel();

        Observer aman = new Subsriber("Aman");
        Observer raman = new Subsriber("Raman");

        channel.subscribe(aman);
        channel.subscribe(raman);

        channel.newVideoUploaded("Learn Design Pattern");
        channel.newVideoUploaded("New Angular Course");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("Press 1 to upload Video");
            System.out.println("Press 2 create new Subscriber");
            System.out.println("Press 3 to exit");

            int c = Integer.parseInt(br.readLine());
            if (c == 1) {
                // new video upload code

                System.out.println("Enter video title ");
                String videoTitle = br.readLine();
                channel.newVideoUploaded(videoTitle);

            } else if (c == 2) {
                /// create new subscribe
                System.out.println("Enter name of subscriber: ");
                String subsName = br.readLine();
                Observer subsriber3 = new Subsriber(subsName);
                channel.subscribe(subsriber3);

            } else if (c == 3) {
                // exit
                System.out.println("Thankyou for using app");
                break;
            } else {
                // exit wrong input
                System.out.println("Wrong input");
            }

        }

    }
}
