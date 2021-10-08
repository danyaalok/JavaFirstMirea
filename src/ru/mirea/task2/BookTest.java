package ru.mirea.task2;

public class BookTest {

    public static void main(String[] args) {
        Book book = new Book("John Tolkien", "The Lord of the Rings","adventure", 1954);

        book.setAuthor("John Tolkien");
        book.setTitle("The Lord of the Rings");
        book.setStyle("adventure");
        book.setYear(1954);

        System.out.println("Author of the book: " + book.getAuthor());
        System.out.println("Title of the book: " + book.getTitle());
        System.out.println("Style: " + book.getStyle());
        System.out.println("Publication date: " + book.getYear());
    }
}
