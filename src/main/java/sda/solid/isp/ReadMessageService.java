package sda.solid.isp;

import java.util.List;

public class ReadMessageService implements MessageService   {

    private List<String> messages;

    public ReadMessageService(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public void writeMessage(String message) {
        throw new UnsupportedOperationException("Can't write on read only device");
    }

    @Override
    public List<String> readMessages() {
        System.out.println("List of all messages provided.");
        return messages;
    }


}
