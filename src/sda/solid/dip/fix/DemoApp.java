package sda.solid.dip.fix;

public class DemoApp {

    // w tym przypadku to metoda main odpowida za tworzenie obiektów
    // czyli ogolnie pozbywamy sie opcji, że 1 obiekt ktory piszemy tworzy 2 obiekt klasy, ktory tez napisalismy
    // raczej robimy w ten sposob, że to jedna klasa drugiej klasie przekazuje obiekty jako parametry
    // czy to przez konstruktor czy przez settery
    // na tym polega właśnie zasada odwracania zaleznosci
    public static void main(String[] args) {

        Repository repository = new FileRepository();

        TaskService taskService = new TaskService(repository);

        taskService.addTask("First");
        taskService.addTask("Second");
        taskService.addTask("Third");
        taskService.removeTask("First");
    }
}
