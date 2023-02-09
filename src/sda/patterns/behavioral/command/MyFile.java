package sda.patterns.behavioral.command;

public class MyFile {
    private String fileName;
    private String content;

    public MyFile(String fileName){
        this.fileName = fileName;
        this.content = content;
    }

    public String createContent(String content) {
        this.content = content;
        return "File " + fileName + ", new content added: " + content;
    }

    public String updateContent(String newContent) {
        this.content += newContent;
        return "File " + fileName + ", content appended, now it's : " + content;
    }

    public String getFileName() {
        return fileName;
    }

    public String getContent() {
        return content;
    }
}
