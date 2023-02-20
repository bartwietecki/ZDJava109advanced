package sda.solid.lsp;

public class File implements FileOperation {
    @Override
    public byte[] read(String filename) {
        System.out.println("Reading from file " + filename);
        return new byte[0];
    }

    @Override
    public void write(String filename, byte[] content) {
        System.out.println("Writing to file " + filename);

    }

}
