package sda.solid.lsp;

public interface FileOperation {

    byte[] read(String filename);

    void write(String filename, byte[] content);
}
