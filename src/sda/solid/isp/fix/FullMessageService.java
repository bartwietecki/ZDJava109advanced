package sda.solid.isp.fix;

import java.util.ArrayList;
import java.util.List;

public class FullMessageService implements MessageService {

    private List<String> messages;

    public FullMessageService(List<String> messages) {
        this.messages = new ArrayList<>();
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("Adding new message");
        messages.add(message);
    }

    @Override
    public List<String> readMessages() {
        System.out.println("Returning all messages");
        return messages;
    }
}
