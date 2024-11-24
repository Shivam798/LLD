package org.example.compoundpattern;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom  = new ConcreteChatRoom();
        User user1 = new ConcreteUser("Alice");
        User user2 = new ConcreteUser("Bob");
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

        System.out.println("Basic Chat Room:");
        chatRoom.sendMessage("Hello, everyone!");

        ChatRoom loggingChatRoom = new LoggingChatRoom(chatRoom);
        System.out.println("\nChat Room with Logging:");
        loggingChatRoom.sendMessage("This is a logged message.");

        ChatRoom encryptedChatRoom = new EncryptMessage(chatRoom);
        System.out.println("\nChat Room with Encryption:");
        encryptedChatRoom.sendMessage("This is an encrypted message.");

        ContextChatRoom contextChatRoom = new ContextChatRoom(new GroupChatBehavior());
        contextChatRoom.addUser(user1);
        contextChatRoom.addUser(user2);

        System.out.println("\nContextual Chat Room with Group Chat Behavior:");
        contextChatRoom.sendMessage("Hello, group!");

        System.out.println("\nSwitching to Broadcast Chat Behavior:");
        contextChatRoom.setChatBehavior(new BroadcastChatBehavior());
        contextChatRoom.sendMessage("Broadcasting to all users!");

    }
}
