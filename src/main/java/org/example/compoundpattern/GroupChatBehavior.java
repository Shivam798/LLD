package org.example.compoundpattern;

import java.util.List;

public class GroupChatBehavior implements ChatBehavior{
    @Override
    public void sendMessage(String message, List<User> users) {
        for (User user : users) {
            user.update("Group message: " + message);
        }
    }
}
