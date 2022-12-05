

public class Program{
    public static  void main(String[] args) {
        User s = new User("ilaysss", 15);
        User a = new User("ana", 10);
        Transaction t = new Transaction(a, s, "credit", 10);
        System.out.println(t);
    }
}