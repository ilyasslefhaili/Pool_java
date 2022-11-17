import java.security.PublicKey;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message){
        super(message);
    }
}