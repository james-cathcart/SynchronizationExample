package com.madhax.synched;

public class ASynchedThread implements Runnable {
    @Override
    public void run() {

        synchronized (System.out) {
            System.out.print("Synchronized A: ");
            for (int i = 0; i < 25; i++) {
                System.out.print("A");
            }
            System.out.print("\n");
        }

    }
}
