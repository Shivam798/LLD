package org.example.compoundpattern;

import java.util.List;

public class BroadcastChatBehavior implements ChatBehavior{
    @Override
    public void sendMessage(String message, List<User> users) {
        for(User user:users){
            user.update("Broadcast: " + message);
        }
    }
}
