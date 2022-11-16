public class UserIdGenerator{
    int numtoIncement;
    private UserIdGenerator(){numtoIncement = 0;}
    static UserIdGenerator a = new UserIdGenerator();
    public static UserIdGenerator getInstance(){return a;}
    public int generateId(){
        int a = numtoIncement;
        numtoIncement++;
        return a;
    }
}