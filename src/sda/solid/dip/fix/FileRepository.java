package sda.solid.dip.fix;

public class FileRepository implements Repository{

    @Override
    public void saveTask(String task) {
        System.out.println("Saving task for file : " + task);
    }

    @Override
    public void deleteTask(String task) {
        System.out.println("Deleting task for file : " + task);
    }
}
