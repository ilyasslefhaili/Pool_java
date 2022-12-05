
public class Program {
    public static void main(String[] args) {
        UsersList a = new UsersList();
        User k = new User("ilyass", 7);
        User p = new User("kk", 0);
        a.AddUser(p);
        a.AddUser(k);
        try {
            User foundUser = a.RetrieveUserById(4);
            System.out.println(foundUser.getName());
        } catch (UserNotFoundException e) { 
                System.out.println(e.getMessage());
        }

        // System.out.println(a.RetrieveUserByIndex(2).getName());
        // System.out.println(a.RetrieveNumOfUsers());
    }
}