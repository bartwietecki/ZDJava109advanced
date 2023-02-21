package practicalTasks.one.person;

import java.io.*;
import java.util.Scanner;

public class PersonIOOperations {

    public void savePersonToFile(String filename, Person person) {

        File file = new File(filename);

        try {
            FileWriter writer = new FileWriter(file);
            String personString = person.getFirstName() + "|" + person.getLastName() + "|" + person.getAge() + "|" +
                    person.getGender() + "|" + person.getNumberOfChildren();
                    writer.write(personString);
                    writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


        public Person readPersonFromFile(String filename) {
            File file = new File(filename);

            try {
                FileReader reader = new FileReader(file);
                Scanner scanner = new Scanner(reader);
                String line = scanner.nextLine();
                String[] personString = line.split("|");
                scanner.close();
                return new Person(personString[0], personString[1], Integer.parseInt(personString[2]), personString[3],
                        Integer.parseInt(personString[4]));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

}
