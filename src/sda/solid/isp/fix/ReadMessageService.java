package sda.solid.isp.fix;

import java.util.List;

public class ReadMessageService implements ReadableMessageService{

    List<String> messages;

    public ReadMessageService(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public List<String> readMessages() {
        return messages;
    }
}
