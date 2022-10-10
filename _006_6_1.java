// package Practicle_file;

/*
   Name: Drash Aswani
   ID  : 21ce006
   Pr  : Write a program to create thread which display “Hello World” message.
         A. by extending Thread class
         B. by using Runnable interface.
*/

public class _006_6_1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        Thread t = new Thread(new Thread2());
        t.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        System.out.println("Hello world. " + "thread class is been extended by this thread");
    }
}

class Thread2 implements Runnable {
    public void run() {
        System.out.println("Hello world. " + "runnable interface is been imolemented by this thread");
    }
}