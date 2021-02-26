package br.com.abc.javacore.ZZDthreads.test;

public class DeadLockTest {
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        new ThreadExemplo1().start();
        new ThreadExemplo2().start();
    }

    private static class ThreadExemplo1 extends Thread{
        public void run() {
            synchronized (lock1){
                System.out.println("Thread 1: segunrando o lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: esperando o lock2");
                synchronized (lock2){
                    System.out.println("Thread 1: segurando lock 1 e lock 2");
                }
            }
        }
    }
    private static class ThreadExemplo2 extends Thread{
        public void run() {
            synchronized (lock1){
                System.out.println("Thread 2: segunrando o lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: esperando o lock1");
                synchronized (lock2){
                    System.out.println("Thread 2: segurando lock 2 e lock 1");
                }
            }
        }
    }

}
