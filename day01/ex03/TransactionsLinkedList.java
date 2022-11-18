import java.util.UUID;

public class TransactionsLinkedList{
    Transaction first;
    Transaction last;
    int i;
    TransactionsLinkedList(){
        i = 0;
    }
    void add(Transaction toAdd)
    {
        if (i == 0)
        {
            this.first = toAdd;
            this.last = toAdd;
            this.first.next = null;
            i++;
        }
        else
        {
            this.last.next = toAdd;
            this.last = toAdd;
            i++;
            toAdd.next = null;
        }
    }
    void removeById(UUID Id)
    {
        Transaction a = this.first;
    
        if (a.getId() == Id)
        {
            this.first = this.first.next;
            i-=1;
            return;
        }
        while (a != null){
            if (a.next != null && a.next.getId() == Id)
            {
                a.next = a.next.next;
                i-=1;
                break;
            }
            a = a.next;
        }
    }
    Transaction [] toArray()
    {
        Transaction [] array = new Transaction[i];
        Transaction toIter = this.first;
        for (int j = 0;j < this.i; j++)
        {
            array[j] = toIter;
            toIter = toIter.next;
        }
        return (array);
    }
}