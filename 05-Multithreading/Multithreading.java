public class Multithreading {

    // Thread 1
    static class MyThread extends Thread {

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
            }
        }
    }

    // Thread 2
    static class MyRunnable implements Runnable {

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
            }
        }
    }

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        MyRunnable task = new MyRunnable();
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
