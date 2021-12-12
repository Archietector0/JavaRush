/*
    * 1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain]. Параметр конструктора - имя книги.
    2. В классе MarkTwainBook реализуйте все абстрактные методы.
    3. Для метода getBook расширьте тип возвращаемого результата.
    4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
    5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
        5.1. agathaChristieOutput для книг Агаты Кристи;
        5.2. markTwainOutput для книг Марка Твена.
*/

public class Solution {
    public static void main(String[] args) {
        Book agatha = new AgathaChristieBook("Agatha Christie");
        Book mark = new MarkTwainBook("Mark Twain");

        System.out.println(agatha.getOutputByBookType());
        System.out.println(mark.getOutputByBookType());

    }

    public static class MarkTwainBook extends Book {
        private String bookName;

        public MarkTwainBook (String bookName) {
            super("Mark Twain");
            this.bookName = bookName;
        }
        @Override
        public MarkTwainBook getBook() {
            return this;
        }
        @Override
        public String getName() {
            return this.bookName;
        }
    }

    public static class AgathaChristieBook extends Book {
        private String bookName;

        public AgathaChristieBook (String bookName) {
            super("Agatha Christie");
            this.bookName = bookName;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getName() {
            return this.bookName;
        }
    }

    public static abstract class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getName();

        private String getOutputByBookType() {
            String agathaChristieOutput = this.author + " wrote fantastic detective.";
            String markTwainOutput = "Many books was written by " + this.author;
            String output = "None";

            if (this instanceof AgathaChristieBook) {
                output = agathaChristieOutput;
            } else if (this instanceof MarkTwainBook)
                output = markTwainOutput;

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}