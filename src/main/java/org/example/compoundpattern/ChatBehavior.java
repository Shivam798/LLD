package org.example.compoundpattern;

import java.util.List;

public interface ChatBehavior {
    void sendMessage(String message, List<User> users);
}
