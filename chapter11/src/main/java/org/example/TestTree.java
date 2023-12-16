package org.example;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    private void go() {
        Book b1 = new Book("how cats work");
        Book b2 = new Book("remix your body");
        Book b3 = new Book("finding emo");
        Book b4 = new Book("finding emo");

        Set<Book> tree = new TreeSet<>((o1,o2) -> o1.title.compareTo(o2.title));
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        tree.add(b4);

        System.out.println(tree);
    }

    class Book /*implements Comparable<Book>*/{
        private String title;


        public Book(String title) {
            this.title = title;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Book book = (Book) o;
//            return year == book.year && Objects.equals(title, book.title);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(title, year);
//        }

//        @Override
//        public int compareTo(Book o) {
//            return this.year - o.year;
//        }

        @Override
        public String toString() {
            return title;
        }
    }
}
