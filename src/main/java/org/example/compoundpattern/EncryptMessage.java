package org.example.compoundpattern;

public class EncryptMessage implements ChatRoom{

    private ChatRoom chatRoom;

    public EncryptMessage(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    @Override
    public void sendMessage(String message) {
        String encryptedMessage = encryptMessage(message);
        chatRoom.sendMessage(encryptedMessage);
    }


    @Override
    public void addUser(User user) {
        chatRoom.addUser(user);
    }

    private String encryptMessage(String message) {
        return "***" + message + "***"; // Simple encryption (just for demo)
    }
}
