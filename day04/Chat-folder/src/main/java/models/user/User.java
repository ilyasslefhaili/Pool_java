package models.user;
import models.chatroom.Chatroom;
import java.util.*;

public class User{
    private String UserId;
    private String Login;
    private String Password;
    private List<Chatroom> RoomsCreated;
    private List<Chatroom> RoomsSocials;
}