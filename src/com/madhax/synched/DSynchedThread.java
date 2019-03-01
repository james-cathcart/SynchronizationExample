package com.madhax.synched;

public class DSynchedThread implements Runnable {
    @Override
    public void run() {

        synchronized (System.out) {
            System.out.print("Synchronized D: ");
            for (int i = 0; i < 25; i++) {
                System.out.print("D");
            }
            System.out.print("\n");
        }
        
    }
}
