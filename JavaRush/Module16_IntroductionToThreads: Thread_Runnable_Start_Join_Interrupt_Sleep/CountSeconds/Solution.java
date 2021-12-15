/*
    1. Напиши реализацию метода run в нити Stopwatch (секундомер).
    2. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
    3. Выведи количество секунд в консоль.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        System.out.print("Enter string pls: ");
        buff.readLine();
        stopWatch.interrupt();
        buff.close();
    }
}

class StopWatch extends Thread {

    @Override
    public void run() {
        int sec = 0;
        try {
            while (true) {
                Thread.sleep(1000);
                ++sec;
            }
        } catch (InterruptedException e) {
            System.out.println("Result in ms: " + sec);
        }
    }
}