package com.madhax.synched;

public class CSynchedThread implements Runnable {
    @Override
    public void run() {

        synchronized (System.out) {
            System.out.print("Synchronized C: ");
            for (int i = 0; i < 25; i++) {
                System.out.print("C");
            }
            System.out.print("\n");
        }

    }
}
