package practicalTasks.one.person;

public class DemoIO {

    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 33, Gender.MALE, 4);

        PersonIOOperations ops = new PersonIOOperations();
        String textFileName = "PersonTexted.txt";

        ops.savePersonToFile(textFileName, person1);
        Person person2 = ops.readPersonFromFile(textFileName);
        System.out.println("===============================");
        System.out.println("READ TEXT FILE");
        System.out.println(person2.personInfo(true));
        System.out.println("===============================");

        String objectFileName = "PersonSerialized.dat";
        ops.saveToSerializedStream(objectFileName, person1);
        Person person3 = ops.readFromSerializedStream(objectFileName);
        System.out.println("===============================");
        System.out.println("READ DAT FILE");
        System.out.println(person3.personInfo(true));
        System.out.println("===============================");
    }
}
