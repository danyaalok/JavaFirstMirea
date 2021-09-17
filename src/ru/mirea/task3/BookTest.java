package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Joanne Rowling", "Harry Potter","fantasy", 1997);

        book.setAuthor("Joanne Rowling");
        book.setTitle("Harry Potter");
        book.setStyle("fantasy");
        book.setYear(1997);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Style: " + book.getStyle());
        System.out.println("Year: " + book.getYear());
    }
}
