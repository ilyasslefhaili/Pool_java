package models.user;
import models.chatroom.Chatroom;
import java.util.*;

public class User{
    private int UserId;
    private String Login;
    private String Password;
    private List<Chatroom> RoomsCreated;
    private List<Chatroom> RoomsSocials;
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof User))
            return false;
        User o = (User)obj;
        if (o.UserId == this.UserId)
            return true;
        return false;
    }
    @Override
    public int hashCode(){
        return UserId;
    }
}