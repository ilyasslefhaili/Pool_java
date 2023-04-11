package models.message;
import models.user.User;
import models.chatroom.Chatroom;

import java.time.LocalTime;

public class Message {
    private int MessageId;
    private User Autor;
    private Chatroom Room;
    private String Text;
    private LocalTime Time;
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Message))
        return false;
        Message o = (Message)obj;
        if (o.MessageId == this.MessageId)
            return true;
        return false;
    }
    @Override
    public int hashCode(){
        return MessageId;
    }
}
