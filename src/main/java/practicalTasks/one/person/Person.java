package practicalTasks.one.person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private int numberOfChildren;
    private List<Person> childrenList;

    public Person(String firstName, String lastName, int age, Gender gender, int numberOfChildren) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.numberOfChildren = numberOfChildren;
        childrenList = new ArrayList<>();

    }

    // drugi konstruktor do 2 części zadania
    public Person(String firstName, String lastName, int age, String gender, int numberOfChildren) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = Gender.findByAbbrv(gender);
        this.numberOfChildren = numberOfChildren;
        childrenList = new ArrayList<>();
    }



    /**
     * Kontynuacja zadania Java Zaawanasowana
     * Opis zadania w Instructions (file).
     */
    public Person readFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\\|");

        String firstName = scanner.next();
        String lastName = scanner.next();
        int age = scanner.nextInt();
        String gender = scanner.next();
        int numberOfChildren = scanner.nextInt();

        return new Person(firstName, lastName, age, gender, numberOfChildren);
    }

    public void writeToFile(String fileName, Person person) throws IOException {

        FileWriter fileWriter = new FileWriter(fileName);

        fileWriter.write(person.getFirstName() + "|");
        fileWriter.write(person.getLastName() + "|");
        fileWriter.write(person.getAge() + "|");
        fileWriter.write(person.getGender() + "|");
        fileWriter.write(person.getNumberOfChildren() + "|");
    }

    // INNA METODA, KTÓRA POLEGA NA:
    // odczytywaniu plików i zapisywaniu ich zawartości w innym pliku. Ta metoda jest ogólną metodą do odczytywania
    // plików w Javie i może być stosowana do odczytywania dowolnych plików, nie tylko plików tekstowych.
    // W metodzie tej nie jest dokonywany żaden parsing danych
    private static void fileReader() throws IOException {
        var fileReader = new FileReader("src/main/resources/input");
        var fileWriter = new FileWriter("src/main/resources/output");

        int i;
        while ((i = fileReader.read()) != -1) {
            fileWriter.write(i);
            System.out.println((char) i);
        }
        System.out.println((char) fileReader.read());
    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String secondName) {
        this.lastName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public List<Person> getChildrenList() {
        return childrenList;
    }

    // metoda pozwalająca dodać dzieck do rodzica
    public boolean addChild(Person child) {
        return childrenList.add(child);
    }

    // Metoda Grzegorza
    public String personInfo(boolean showNumberOfChildren) {
        return new StringBuilder("Person: ")
                .append(firstName)
                .append(" ")
                .append(lastName)
                .append(", age: ")
                .append(age)
                .append(", gender: ")
//                .append(gender)
                .append(gender.getTranslationEng())
                .append(showNumberOfChildren ? ", children: " : "")
                .append(showNumberOfChildren ? numberOfChildren : "")
                .toString();
    }

    // Moja metoda
    public void printInfoAboutPerson(boolean numberOfChildren) {
        System.out.println("Name: " + firstName);
        System.out.println("Surname: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        if (numberOfChildren == true) {
            System.out.println("Number of Children: " + numberOfChildren);
        } else {
            System.out.println("Person doesn't have any children.");
        }
    }

    // metoda wyświetlająca rodzica a potem dziecko
    public String personInfoWithChildren() {
        String childrenConcat = "";
//        for (Person child : childrenList) {
//            childrenConcat += child.personInfo(false) + "\n\t";
//        }

        childrenConcat = childrenList.stream()
                .map(child -> child.personInfo(false))
                .collect(Collectors.joining("\n\t"));


        return personInfo(true) + "\n\t" + childrenConcat;
    }


    // część 4
    // ta metoda służy do porównywania po nazwisku i imieniu
    @Override
    public int compareTo(Person p) {
        return (this.lastName + this.firstName).compareTo(p.getLastName() + p.getFirstName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", numberOfChildren=" + numberOfChildren +
                '}';
    }
}

