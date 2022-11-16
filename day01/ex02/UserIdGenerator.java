public class UserIdGenerator{
    static int numtoIncement;
    public static UserIdGenerator getInstance(){return new UserIdGenerator();}
    public int generateId(){
        int a = numtoIncement;
        numtoIncement++;
        return a;
    }
}