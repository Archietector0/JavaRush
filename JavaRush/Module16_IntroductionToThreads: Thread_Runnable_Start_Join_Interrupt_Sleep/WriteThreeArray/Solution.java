/*
    * Заданы три целочисленных массива.
    * Записать эти массивы в файл в паралельних потоках.
    * Создать класс SaveAsThread для представления потока,
    * который записывает целочисленный массив в файл.
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {

        Integer[] array1 = {-54, 0, 5, 4, 34, 54};
        Integer[] array2 = {78, 90, 110, 345, 67, 87};
        Integer[] array3 = {5, 2, 6, 1, 54};

        MyThread thread1 = new MyThread(array1, "File_1");
        MyThread thread2 = new MyThread(array2, "File_2");
        MyThread thread3 = new MyThread(array3, "File_3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyThread extends Thread {

    private Integer[]   array;
    private String      title;


    public MyThread (Integer[] array, String title) {
        this.array = array;
        this.title = title + ".txt";
    }

    @Override
    public void         run () {
        try {
            File        file = new File(this.title);
            FileWriter  writer = new FileWriter(file);

            for (int i = 0; i < array.length; ++i)
                writer.write(this.title + "_[" + array[i] + "]\n");
            writer.close();

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    // Setter - methods
    public void         setArray (Integer[] array) {
        this.array = array;
    }

    public void         setTitle (String title) {
        this.title = title;
    }

    // Getter - methods
    public Integer[]    getArray () {
        return this.array;
    }

    public String       getTitle () {
        return this.title;
    }

}