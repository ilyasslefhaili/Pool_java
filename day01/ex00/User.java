
public class User{
    static int incerement_id = 0;
    private Integer id;
    private String name;
    private Integer Balance;
    public User(String name, Integer Balance)
    {
        this.id = incerement_id;
        incerement_id++;
        this.name = name;
        this.Balance = Balance;
    }
    public Integer getBalance(){return this.Balance;};
    public void setBalance(Integer Balance){this.Balance = Balance;}
    public String getName(){return this.name;}
    public Integer getId(){return this.id;}
}