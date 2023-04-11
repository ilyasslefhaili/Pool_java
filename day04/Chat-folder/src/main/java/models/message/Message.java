package models.message;
import models.user.User;
import models.chatroom.Chatroom;

import java.time.LocalTime;

public class Message {
    private String MessageId;
    private User Autor;
    private Chatroom Room;
    private String Text;
    private LocalTime Time;
}
