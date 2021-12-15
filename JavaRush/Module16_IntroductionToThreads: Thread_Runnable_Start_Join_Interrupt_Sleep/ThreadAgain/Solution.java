/*
    Создай нить TestThread.
    В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread  testThread = new TestThread();
        Thread      thread = new Thread(testThread);

        thread.start();
        Thread.sleep(10000);
        thread.interrupt();
    }
}

class TestThread implements Runnable {

    @Override
    public void run() {
        int sec = 500;
        try {
            while (true) {
                System.out.println("Working : " + sec + " ms.");
                Thread.sleep(500);
                sec += 500;
            }

        } catch (InterruptedException e) {
            System.out.println("NOTE: Thread is DIE!");
        }

    }
}