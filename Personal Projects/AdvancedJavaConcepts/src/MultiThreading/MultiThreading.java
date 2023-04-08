package MultiThreading;

// the multi threading means running multiple threads at one time
// a thread is a single unit/ part o/ of a process
// a process can have one or many threads
// to implement a multithreading, the class has to extend from Thread and it has to override the run method

// lets see this example


public class MultiThreading extends Thread {
    @Override
    public void run() {
        // example, we can create a program that prints odd numbers from 1 to 10
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                // to see the changes we can make the system to sleep and print it in one sec renge
                // surround it with try catch block
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        MultiThreading mythread = new MultiThreading();
        MultiThreading mythread2 = new MultiThreading();

        mythread.start();
        mythread2.start();

    }
}
