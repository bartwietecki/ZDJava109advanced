package sda.patterns.behavioral.command;

public class CreateFileOperation implements FileOperation {

    private MyFile myFile;

    public CreateFileOperation(MyFile myFile) {
        this.myFile = myFile;
    }

    @Override
    public String performOperation(String content) {
        System.out.println(getClass().getSimpleName() + " called for " + myFile.getFileName());
        return myFile.createContent(content);
    }
}
