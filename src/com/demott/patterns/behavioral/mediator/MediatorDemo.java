
package com.demott.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

// Mediator interface
interface ChatRoomMediator {
    void showMessage(User user, String message);
    void addUser(User user);
}

// Concrete Mediator
class ChatRoom implements ChatRoomMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void showMessage(User user, String message) {
        for (User u : users) {
            // Don't send the message to the sender
            if (u != user) {
                u.receive(user.getName() + ": " + message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}

// Colleague
class User {
    private String name;
    private ChatRoomMediator chatRoom;

    public User(String name, ChatRoomMediator chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
        chatRoom.addUser(this);
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        System.out.println(name + " sends: " + message);
        chatRoom.showMessage(this, message);
    }

    public void receive(String message) {
        System.out.println(name + " receives: " + message);
    }
}

public class MediatorDemo {
    public static void main(String[] args) {
        ChatRoomMediator chatRoom = new ChatRoom();
        User alice = new User("Alice", chatRoom);
        User bob = new User("Bob", chatRoom);
        User charlie = new User("Charlie", chatRoom);

        alice.send("Hi everyone!");
        bob.send("Hello Alice!");
        charlie.send("Hey folks, what's up?");
    }
}
