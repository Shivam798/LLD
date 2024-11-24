package org.example.compoundpattern;

public class LoggingChatRoom implements ChatRoom{

    private ChatRoom chatRoom;

    public LoggingChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    @Override
    public void sendMessage(String message) {
        logMessage(message);
        chatRoom.sendMessage(message);
    }

    private void logMessage(String message) {
        System.out.println("Logging: "+message);
    }

    @Override
    public void addUser(User user) {
        chatRoom.addUser(user);
    }
}
