package practicalTasks.one.person;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
            String[] personString = line.split("\\|");
            scanner.close();
            return new Person(personString[0], personString[1], Integer.parseInt(personString[2]), personString[3],
                    Integer.parseInt(personString[4]));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // zapis osoby zserializowanej
    public void saveToSerializedStream(String filename, Person person) {

        try (FileOutputStream fout = new FileOutputStream(filename)) {
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(person);
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // odczyt osoby zserializowanej
    public Person readFromSerializedStream(String filename) {
        Person person = null;

        try (FileInputStream fis = new FileInputStream(filename)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            person = (Person) ois.readObject();

            // dodanie ois do try-with-resources - czyli do definicji w nawiasie okrągłym
            // w bloku try() powoduje że JVM sam będzie zamykał strumienie, w naszym przypadku ois i fis
            // UWAGA - działa tylko na klasach które implementują jeden z 2 interfejsów: Closeable lub AutoCloseable
            ois.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return person;
    }




    // Zrobić odczyt i zapis Person do / z pliku tekstowego ale korzystając z Java NIO -
    // macie w bazie wiedzy i ja też pokazywałem przykład

    // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    // Zapis do pliku tekstowego korzystając z Java NIO
    public void saveToFileWithNIO(String filename, Person person) {
        String personString = person.getFirstName() + "|" + person.getLastName() + "|" + person.getAge() + "|" +
                person.getGender() + "|" + person.getNumberOfChildren();
        byte[] data = personString.getBytes(StandardCharsets.UTF_8);
        Path path = Paths.get(filename);
        try {
            Files.write(path, data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

  /*
    Metoda saveToFileWithNIO przyjmuje nazwę pliku i obiekt Person, a następnie serializuje obiekt do postaci tekstowej
    (w której pola oddzielone są znakiem '|') i zapisuje do pliku korzystając z metody Files.write().
     */

    // Inny zapis:
    // TODO person.getGender() nie działa !!! POPRAWIĆ
    /*
    public void saveToFileWithNIO(String fileame, Person person) {
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileame));
            String personString = String.join("|", person.getFirstName(), person.getLastName(),
                    String.valueOf(person.getAge()), person.getGender(), String.valueOf(person.getNumberOfChildren()));
            writer.write(personString);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
     */


    // Odczyt z pliku tekstowego korzystając z Java NIO

    public Person readFromFileWithNIO(String filename) {
        Path path = Paths.get(filename);
        try {
            byte[] data = Files.readAllBytes(path);
            String personString = new String(data, StandardCharsets.UTF_8);
            String[] line = personString.split("\\|");
            return new Person(line[0], line[1], Integer.parseInt(line[2]), line[3], Integer.parseInt(line[4]));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        /*
    Metoda readFromFileWithNIO przyjmuje nazwę pliku, odczytuje zawartość pliku do tablicy bajtów korzystając
    z metody Files.readAllBytes(), a następnie konwertuje bajty na tekst w kodowaniu UTF-8 i parsuje go na obiekt Person.
     */

    // Inny zapis
    /*
    public Person readFromFileWithNIO(String filename) {
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(filename));
            String line = reader.readLine();
            String[] personString = line.split("\\|");
            reader.close();
            return new Person(personString[0], personString[1], Integer.parseInt(personString[2]), personString[3],
                    Integer.parseInt(personString[4]));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
     */



}
