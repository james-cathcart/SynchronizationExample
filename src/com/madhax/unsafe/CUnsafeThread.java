package com.madhax.unsafe;

public class CUnsafeThread implements Runnable {
    @Override
    public void run() {
        System.out.print("Unsafe C: ");
        for (int i = 0; i < 25; i++) {
            System.out.print("C");
        }
        System.out.print("\n");
    }
}
