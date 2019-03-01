package com.madhax.unsafe;

public class AUnsafeThread implements Runnable {
    @Override
    public void run() {
        System.out.print("Unsafe A: ");
        for (int i = 0; i < 25; i++) {
            System.out.print("A");
        }
        System.out.print("\n");
    }
}
