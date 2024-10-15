package popo2;


class TaskA extends Thread {
    @Override
    public void run() {
        System.out.println("Task A is running.");
        // Simulate some work
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println("Task A interrupted");
        }
        System.out.println("Task A completed.");
    }
}

class TaskB extends Thread {
    @Override
    public void run() {
        System.out.println("Task B is running.");
        // Simulate some work
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println("Task B interrupted");
        }
        System.out.println("Task B completed.");
    }
}

class TaskC extends Thread {
    @Override
    public void run() {
        System.out.println("Task C is running.");
        // Simulate some work
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println("Task C interrupted");
        }
        System.out.println("Task C completed.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating threads for tasks A, B, and C
        TaskA threadA = new TaskA();
        TaskB threadB = new TaskB();
        TaskC threadC = new TaskC();

        // Starting the threads
        threadA.start();
        threadB.start();
        threadC.start();

        // Main thread's task
        System.out.println("Main thread is running.");

        // Optionally, wait for threads to complete
        try {
            threadA.join();
            threadB.join();
            threadC.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("All tasks completed.");
    }
}
