package main.java;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Running via extending Thread class.");
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Running via implementing Runnable interface.");
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ThreadCreationDemo {
    public static void main(String[] args) throws InterruptedException {

//        MyThread t1 = new MyThread();
//        t1.start();

        MyRunnable runnable = new MyRunnable();
        Thread t2 = new Thread(runnable);
        t2.setName("Runnable Thread");
        t2.start();
//
        Thread t3 = new Thread(() -> {
            System.out.println("Running via Runnable(Lambda): Much cleaner!");
        });
        t3.start();

        //t1.join();
        Thread[] threads = new Thread[Thread.activeCount()];
        Thread.enumerate(threads);

        System.out.println("\nAll active threads in this app:");
        for (Thread t : threads) {
            if (t != null) {
                System.out.println("ID: " + t.getId() + " | Name: " + t.getName() + " | Priority: " + t.getPriority());
            }
        }
    }
}