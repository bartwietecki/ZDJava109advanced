package threads;

import static threads.ThreadColor.ANSI_BLUE;

public class SeperateThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Seperate class thread launched");
        System.out.println(ANSI_BLUE + "Thread name : " + currentThread());

        try{
            sleep(4000);
            System.out.println(ANSI_BLUE + "Sleep is over");
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Somebody broke the sleep");
        }
    }
}
