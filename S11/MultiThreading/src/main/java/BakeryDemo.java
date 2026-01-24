package main.java;

class CakeShop {
    private int cakeCount = 0;
    private final int CAPACITY = 3;

    // Baker bakes a full batch of 3
    public synchronized void bakeBatch() {
        while(cakeCount > 0) { // Wait until shelf is completely empty
            try {
                wait();
            } catch(InterruptedException e) {
            }
        }

        System.out.println("Baker: Starting to bake a batch...");
        while(cakeCount < CAPACITY) {
            cakeCount++;
            System.out.println("Baker: Added cake #" + cakeCount);
        }

        System.out.println("Baker: Batch ready! Going to rest.");
        notifyAll(); // Wake up all customers
    }

    // Consumers eat until shelf is empty
    public synchronized void eatCake(String customerName) {
        while(cakeCount == 0) { // Wait if no cakes are available
            try {
                wait();
            } catch(InterruptedException e) {
            }
        }

        System.out.println(customerName + ": Ate cake #" + cakeCount);
        cakeCount--;

        if(cakeCount == 0) {
            System.out.println("--- Shelf is empty! ---");
            notifyAll(); // Wake up the baker to start a new batch
        }
    }
}

public class BakeryDemo {
    public static void main(String[] args) {
        CakeShop shop = new CakeShop();

        // The Baker: Bakes 2 batches total
        Thread baker = new Thread(() -> {
            for(int i = 0; i < 2; i++) shop.bakeBatch();
        });

        // The Customers: Shared goal to eat the cakes
        Thread customer1 = new Thread(() -> {
            for(int i = 0; i < 3; i++) {
                shop.eatCake("Customer 1");
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread customer2 = new Thread(() -> {
            for(int i = 0; i < 3; i++) {
                shop.eatCake("Customer 2");
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        baker.start();
        customer1.start();
        customer2.start();
    }
}