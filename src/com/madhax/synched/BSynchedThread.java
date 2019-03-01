package com.madhax.synched;

public class BSynchedThread implements Runnable {
    @Override
    public void run() {

        synchronized (System.out) {
            System.out.print("Synchronized B: ");
            for (int i = 0; i < 25; i++) {
                System.out.print("B");
            }
            System.out.print("\n");
        }

    }
}
