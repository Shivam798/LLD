package org.example.compoundpattern;

import java.util.ArrayList;
import java.util.List;

public class ContextChatRoom implements ChatRoom{

    private List<User> users = new ArrayList<>();
    private ChatBehavior chatBehavior;

    public ContextChatRoom(ChatBehavior chatBehavior) {
        this.chatBehavior = chatBehavior;
    }

    public void setChatBehavior(ChatBehavior chatBehavior) {
        this.chatBehavior = chatBehavior;
    }

    @Override
    public void sendMessage(String message) {
        chatBehavior.sendMessage(message,users);
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
