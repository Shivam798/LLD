package org.example.compoundpattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChatRoom implements ChatRoom{

    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message) {
        System.out.println("ChatRoom :" + message);
        notifyUser(message);
    }

    private void notifyUser(String message) {
        for (User user:users){
            user.update(message);
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
