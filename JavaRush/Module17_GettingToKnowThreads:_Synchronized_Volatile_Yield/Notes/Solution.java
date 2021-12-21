/*
    1. Класс Note будет использоваться нитями.
    2. Создай public static нить NoteThread (Runnable не является нитью), которая в методе run 1000 раз (index = 0-999) сделает следующие действия:
    2.1. используя метод addNote добавит заметку с именем [getName() + "-Note" + index], например, при index=4
    "Thread-0-Note4"
    2.2. используя метод removeNote удалит заметку
    2.3. в качестве первого параметра в removeNote передай имя нити - метод getName()
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        NoteThread thread1 = new NoteThread();
//        NoteThread thread2 = new NoteThread();
        Note note = new Note();

        thread1.start();
        thread1.join();

        System.out.println(note);
    }

    public static class Note {
        private static final List<String> notes = new ArrayList<>();

        public static void addNote (String note) {
            notes.add(0, note);
            System.out.println("Note: " + note + " - is successfully added!");
        }

        public static void removeNote (String paramName) {
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("Other thread deleted our note");
            } else if (!note.startsWith(paramName)) {
                System.out.println("Thread [" + paramName + "] deleted other note [" + note + "]");
            }
        }
    }

    public static class NoteThread extends Thread {
        @Override
        public void run () {
            for (int i = 0; i < 1000; ++i) {
                Note.addNote(getName() + "-Note_" + i);
                Note.removeNote(getName());
            }
        }
    }

}