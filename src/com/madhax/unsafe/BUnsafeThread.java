package com.madhax.unsafe;

public class BUnsafeThread implements Runnable {
    @Override
    public void run() {
        System.out.print("Unsafe B: ");
        for (int i = 0; i < 25; i++) {
            System.out.print("B");
        }
        System.out.print("\n");
    }
}
