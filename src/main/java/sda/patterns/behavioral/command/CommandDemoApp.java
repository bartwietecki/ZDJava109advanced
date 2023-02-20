package sda.patterns.behavioral.command;

public class CommandDemoApp {

    public static void main(String[] args) {

        MyFile myFile = new MyFile("simpleFile.txt");
        FileOperationPerformer performer = new FileOperationPerformer();

        performer.executeOperation(new CreateFileOperation(myFile), "aaaaaaaaaaabbbbbbbbbb");
        System.out.println(myFile.getContent());
        System.out.println("========================");
        performer.executeOperation(new UpdateFileOperation(myFile), "xxxxxxxyyyyyyzzzzz");
        System.out.println(myFile.getContent());
        System.out.println("========================");
        performer.executeOperation(new CreateFileOperation(myFile), "aaaaaabbbcccddeeff");
        System.out.println(myFile.getContent());
        System.out.println("========================");

        System.out.println("Historia operacji:");
        performer.getOperationHistory()
                .forEach(System.out::println);
    }
}
