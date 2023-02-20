package sda.solid.lsp.fix;

public class File implements Writable, Readable {

    @Override
    public byte[] read(String filename) {
        System.out.println("Reading from file " + filename);
        return new byte[0];
    }

    @Override
    public void write(String filename, byte[] content) {
        System.out.println("Writing to  file " + filename);
        // zapis do pliku...
    }
}
