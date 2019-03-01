package com.madhax;

import com.madhax.synched.ASynchedThread;
import com.madhax.synched.BSynchedThread;
import com.madhax.synched.CSynchedThread;
import com.madhax.synched.DSynchedThread;
import com.madhax.unsafe.AUnsafeThread;
import com.madhax.unsafe.BUnsafeThread;
import com.madhax.unsafe.CUnsafeThread;
import com.madhax.unsafe.DUnsafeThread;

public class Main {

    public static void unsafeExample() {
        
        // No thread safety

        Thread unsafeAThread = new Thread(new AUnsafeThread());
        Thread unsafeBThread = new Thread(new BUnsafeThread());
        Thread unsafeCThread = new Thread(new CUnsafeThread());
        Thread unsafeDThread = new Thread(new DUnsafeThread());
        // Run the threads
        unsafeAThread.start();
        unsafeBThread.start();
        unsafeCThread.start();
        unsafeDThread.start();
    }

    public static void synchronizedExample() {

        // Synchronized for thread safety

        // Load the threads:
        Thread synchedAThread = new Thread(new ASynchedThread());
        Thread synchedBThread = new Thread(new BSynchedThread());
        Thread synchedCThread = new Thread(new CSynchedThread());
        Thread synchedDThread = new Thread(new DSynchedThread());
        // Run the threads
        synchedAThread.start();
        synchedBThread.start();
        synchedCThread.start();
        synchedDThread.start();
    }

    public static void main(String[] args) {

        System.out.println("\n"); // blank lines for formatting

        // No thread safety
        unsafeExample();

        // Synchronized threads
        synchronizedExample();

    }
}
