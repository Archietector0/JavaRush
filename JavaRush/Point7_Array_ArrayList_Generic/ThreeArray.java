import java.io.*;
import java.util.ArrayList;


public class ThreeArray {
    final private static int SIZE = 20;

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainArr = new ArrayList<Integer>();
        ArrayList<Integer> del3 = new ArrayList<Integer>();
        ArrayList<Integer> del2 = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();

        for (int i = 0; i < SIZE; ++i) {
            System.out.print("Enter string (" + (i + 1) + "\\" + SIZE + "): ");
            mainArr.add(Integer.parseInt(buff.readLine()));
        }

        for (int i = 0; i < mainArr.size(); ++i) {
            if ((mainArr.get(i) % 2) == 0 && (mainArr.get(i) % 3) == 0) {
                del2.add(mainArr.get(i));
                del3.add(mainArr.get(i));
            } else if ((mainArr.get(i) % 2) == 0) {
                del2.add(mainArr.get(i));
            } else if ((mainArr.get(i) % 3) == 0) {
                del3.add(mainArr.get(i));
            } else
                other.add(mainArr.get(i));
        }
        printHead("Main");
        printList(mainArr);
        printHead("DEL3");
        printList(del3);
        printHead("DEL2");
        printList(del2);
        printHead("OTHER");
        printList(other);


    }

    public static void printList (ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); ++i)
            System.out.println("Index [" + i + "]: " + list.get(i));
    }

    public static void printHead (String head) {
        System.out.println("\n-------------------------------------");
        System.out.println("-------------" + head + "_LIST--------------");
        System.out.println("-------------------------------------\n");
    }
}