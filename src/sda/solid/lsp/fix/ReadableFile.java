package sda.solid.lsp.fix;

public class ReadableFile implements Readable{
    @Override
    public byte[] read(String filename) {
        System.out.println("Reading from file " + filename);
        return new byte[0];
    }
}
