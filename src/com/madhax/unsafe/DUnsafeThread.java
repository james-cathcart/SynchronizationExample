package com.madhax.unsafe;

public class DUnsafeThread implements Runnable {
    @Override
    public void run() {
        System.out.print("Unsafe D: ");
        for (int i = 0; i < 25; i++) {
            System.out.print("D");
        }
        System.out.print("\n");
    }
}
