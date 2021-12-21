/*
    * Пользователь вводит с клавиатуры значение в массив.
    * После чего запускаются два потока.
    * Первый поток находит максимум в массиве, второй — минимум.
    * Результаты вычислений возвращаются в метод main().
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    final private static int SIZE = 5;
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader  buff = new BufferedReader(new InputStreamReader(System.in));
        ThreadMax       tMax = new ThreadMax();
        ThreadMin       tMin = new ThreadMin();
        List<Integer>   array = new ArrayList<Integer>();

        System.out.println("\n----------------------------------------");
        System.out.println("-------------START_PROGRAMM-------------");
        System.out.println("----------------------------------------\n");

        for (int i = 0; i < SIZE; ++i) {
            System.out.print("Enter number (" + (i + 1) + "/" + SIZE + "): ");
            array.add(Integer.parseInt(buff.readLine()));
        }
        System.out.println("\nArray is full ...");

        tMax.setArray(array);
        tMin.setArray(array);

        tMax.start();
        tMin.start();

        Thread.sleep(2000);


        System.out.println("Min: " + tMin.getMin());
        System.out.println("Max: " + tMax.getMax());
    }
}

class ThreadMax extends Thread {
    private int             max;
    private List<Integer>   array = null;

    @Override
    public void run () {
        this.max = array.get(0);
        for (int i = 0; i < array.size(); ++i)
            if (max < array.get(i))
                max = array.get(i);
    }

    public void setMax ( int max ) {
        this.max = max;
    }

    public int  getMax () {
        return this.max;
    }

    public void setArray (List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getArray () {
        return this.array;
    }
}

class ThreadMin extends Thread {
    private int             min ;
    private List<Integer>   array = null;

    @Override
    public void run () {
        this.min = array.get(0);
        for (int i = 0; i < array.size(); ++i)
            if (min > array.get(i))
                min = array.get(i);
    }

    public void setMin ( int min ) {
        this.min = min;
    }

    public int  getMin () {
        return this.min;
    }

    public void setArray (List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getArray () {
        return this.array;
    }
}
