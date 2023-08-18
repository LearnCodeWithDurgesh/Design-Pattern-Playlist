class Main {
    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();

        userManagement.addUser(new User("durgesh", "14"));
        userManagement.addUser(new User("harsh", "15"));
        userManagement.addUser(new User("ankit", "16"));
        userManagement.addUser(new User("gautam", "74"));

        MyIterator myIterator = userManagement.getIterator();
        while (myIterator.hasNext()) {
            User user = (User) myIterator.next();
            System.out.println(user.getName());
        }

    }
}