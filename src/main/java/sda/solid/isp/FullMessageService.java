package sda.solid.isp;

import java.util.List;

public class FullMessageService implements  MessageService {

    private List<String> messages;

    public FullMessageService(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("Adding '" + message + "' to messages.");
        messages.add(message);
    }

    @Override
    public List<String> readMessages() {
        System.out.println("Returning all messages.");
        return messages;
    }
}
