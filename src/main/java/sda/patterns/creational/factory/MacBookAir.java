package sda.patterns.creational.factory;

public class MacBookAir extends MacBook {
    private int memory;
    private int disc;
    private int screenSize;

    public MacBookAir(int memeory, int disc, int screenSize) {
        this.memory = memeory;
        this.disc = disc;
        this.screenSize = screenSize;
    }

    @Override
    public int getMemory() {
        return memory;
    }

    @Override
    public int getDisc() {
        return disc;
    }

    public int getScreenSize() {
        return screenSize;
    }
}
