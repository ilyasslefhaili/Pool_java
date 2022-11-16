

public class Program{
    public static  void main(String[] args) {
        UsersList a = new UsersList();
        User k = new User("ilyass", 7);
        User p = new User("kk", 0);
        a.AddUser(p);
        a.AddUser(k);
        System.out.println(a.RetrieveUserById(0).getName());
        System.out.println(a.RetrieveUserByIndex(1).getName());
        System.out.println(a.RetrieveNumOfUsers());
    }
}