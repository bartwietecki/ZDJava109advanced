package threads;

// 2 sposób na zakładanie wątku
import static threads.ThreadColor.ANSI_RED;

public class RunnableSample implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED + "RunnableSample class warking");
    }
}
