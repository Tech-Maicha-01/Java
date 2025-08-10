// ThreadA: displays even numbers from 50 to 100
class ThreadA implements Runnable {
    public void run() {
        System.out.println("Even numbers from 50 to 100:");
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

// ThreadB: displays odd numbers from 100 to 200
class ThreadB implements Runnable {
    public void run() {
        System.out.println("Odd numbers from 100 to 200:");
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

// Main class
public class lab12 {
    public static void main(String[] args) {
        // Create Runnable objects
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        // Create Thread objects from Runnables
        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);

        // Start threads
        thread1.start();
        thread2.start();
    }
}
