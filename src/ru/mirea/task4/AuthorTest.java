package ru.mirea.task4;

public class AuthorTest {
    public static void main(String[] args) {
        Author author = new Author("Daria Dontsova", "dontsova@mail.ru", 'F');
        author.setEmail("dontsova@mail.ru");
        System.out.println(author);
    }
}
