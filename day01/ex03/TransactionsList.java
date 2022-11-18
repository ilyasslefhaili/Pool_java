import java.util.UUID;

public class TransactionsList{
    TransactionsLinkedList list = new TransactionsLinkedList();
    public void add(Transaction toAdd)
    {
        list.add(toAdd);
    }
    public void removeById(UUID iD)
    {
        list.removeById(iD);
    }
    public Transaction [] toArray()
    {
        return (list.toArray());
    }
}