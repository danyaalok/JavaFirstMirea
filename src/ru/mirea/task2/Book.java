package ru.mirea.task2;

public class Book {
    private String author, title, style;
    private int year;

    public Book(String a, String t, String s, int y){
        author = a;
        title = t;
        style = s;
        year = y;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getStyle() {
        return style;
    }

    public int getYear() {
        return year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
