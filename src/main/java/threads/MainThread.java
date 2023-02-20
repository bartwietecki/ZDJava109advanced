package threads;

import static threads.ThreadColor.*;

public class MainThread {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE + "MAIN thread starts");

        SeperateThread seperateThread = new SeperateThread();
        seperateThread.setName("Osobny zajefajny wątek");
        /**
         * kod wykonawczy wątku umieszczemy w metodzie run()
         * ale żeby wątek się utworzył to uruchamiamy go start()
         * bo uruchomienie bezpośrednio run() powoduje wykonanie
         * kodu w pojedynczym, głównym wątku, bez tworzenia kolejnego
         */
        seperateThread.start();
//        seperateThread.run();

        Thread runnableSample = new Thread(new RunnableSample());
        //2 sposób na uruchamianie wątku
        runnableSample.start();

        /**
         * jak mamy bardzo jednorazowe zadanka to możemy je odpalić
         * w klasie anonimowej
         */

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Anonymous class thread launched");
            }
        }.start();

        runnableSample = new Thread(new RunnableSample() {
            @Override
            public void run() {
                System.out.println(ANSI_CYAN + "Overwritten RunnableSample");
                try {
                    seperateThread.join();
                    System.out.println(ANSI_CYAN + "SeperateThread finished, I can continue");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_CYAN + "Overwritten RunnableSample interrupted");
                }
            }
        });
        runnableSample.start();

        try {
            Thread.sleep(1500);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        seperateThread.interrupt();
        runnableSample.interrupt();

        System.out.println(ANSI_PURPLE + "MAIN ends work");
    }
}
