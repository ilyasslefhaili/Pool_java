
import java.util.UUID;

 public class Transaction{
    private UUID Id;
    private User Re;
    private User Send;
    private String TrasferCategory;
    private Integer Amount;
    Transaction next;
    Transaction(User Re, User Send, String TsCa, Integer Amount)
    {
        if (Send.getBalance() < Amount)
            throw (new RuntimeException("Transaction cannot created"));
        this.Id = UUID.randomUUID();
        this.Re = Re;
        this.Send = Send;
        this.TrasferCategory = TsCa;
        this.Amount = Amount;
    }
    public int getAmount(){return this.Amount;}
    public String getTransferCategory(){return this.TrasferCategory;}
    public UUID getId(){return this.Id;}
 }