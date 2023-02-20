package sda.solid.isp;

import java.util.List;

public interface MessageService {
    void writeMessage(String message);

    List<String> readMessages();

}
