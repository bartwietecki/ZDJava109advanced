package practicalTasks.second;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main implements Serializable {

    public static void main(String[] args) {

        Eagle eagle = new Eagle("Bielik");
        PussyCat pussyCat = new PussyCat("Kotek");
        Salmon salmon = new Salmon("Łosoś uwędzony");

        List<Animal> animals = List.of(eagle, pussyCat, salmon);
        saveToFile("Zwierzęta", animals);

    }

    public static void saveToFile(String fileName, List objectList) {
        System.out.println("Trying to write to file" + fileName);
        Path path = Paths.get(fileName);
        int line = 0;
        try {
            for (Object o : objectList) {
                if (line == 0) {
                    Files.writeString(path, objectList.get(0).toString());
                    line++;
                } else {
                    Files.writeString(path, "\n"+o.toString(), StandardOpenOption.APPEND);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
