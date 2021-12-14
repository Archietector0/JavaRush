/*
    В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            list.add(new Thread(new SpecialThread()));
            System.out.println(list.get(i));
        }
    }

    public static class SpecialThread implements Runnable {

        @Override
        public void run() {
            System.out.println("Wow, I'm in Function");
        }
    }
}