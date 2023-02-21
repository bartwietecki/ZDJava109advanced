package practicalTasks.one.person;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingToAndWritingFromFile {

    public static void main(String[] args) {

        Person person = new Person("Adam", "Smith", 20, Gender.MALE, 0);

        try {
            person.writeToFile("fileName.txt", person);
            System.out.println("Person data has been saved to a file");
        } catch (IOException e) {
            System.err.println("Error writing data to the file");
        }

        try {
            person.readFromFile("fileName.txt");
            System.out.println("Person data read from file");
        } catch (FileNotFoundException e) {
            System.err.println("The data file could not be found.");
            e.printStackTrace();
        }
    }


}

