public class Main {
    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setEmailId("durgesh@dev.in")
                .setUserId("USERID123")
                .setUserName("Durgesh")
                .build();

        System.out.println(user);

        User user2 = User.UserBuilder.builder()
                .setUserId("USER1234")
                .setEmailId("Ankit@gmail.com")

                .build();

        System.out.println(user2);

      
    }
}
