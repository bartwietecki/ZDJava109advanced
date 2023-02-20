package sda.patterns.behavioral.command;

public class UpdateFileOperation implements FileOperation {

    private MyFile myFile;

    public UpdateFileOperation(MyFile myFile) {
        this.myFile = myFile;
    }

    @Override
    public String performOperation(String content) {
        System.out.println(getClass().getSimpleName() + " called for " + myFile.getFileName());
        return myFile.updateContent(content);
    }
}
