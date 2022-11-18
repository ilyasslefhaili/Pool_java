
public class Program {
    public static void main(String[] args) {
        User a = new User("ilyas", 16);
        User f = new User("dkjf", 16);
        Transaction l = new Transaction(a, f, "credit", 9);
        Transaction b = new Transaction(a, f, "credit", 9);
        Transaction s = new Transaction(a, f, "credit", 9);
        TransactionsList linked = new TransactionsList();
        linked.add(s);
        linked.add(b);
        linked.add(l);
        Transaction tol = s;
        while (tol != null)
        {
            System.out.println(tol.getId());
            tol = tol.next;
        }
        linked.removeById(s.getId());
        Transaction [] t = linked.toArray();
        for (int i = 0;i < 2;i++)
            System.out.println(t[i].getId());

    }
}