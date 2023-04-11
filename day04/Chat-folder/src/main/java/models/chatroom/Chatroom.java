package models.chatroom;
import models.user.User;
import models.message.Message;
import java.util.*;

public class Chatroom {
    private int ChatroomId;
    private String ChatroomName;
    private User ChatroomOwner;
    private List<Message> MessageList;
    @Override
    public boolean equals(Object obj){     
        if (!(obj instanceof Chatroom))
            return false;
        Chatroom o = (Chatroom)obj;
        if (this.ChatroomId == o.ChatroomId)
            return true;
        return false;
    }
    @Override
    public int hashCode(){
        return ChatroomId;   
    }
}