package io.codeforall.bootcamp;

public class Book {

    private String title;
    private String author;
    private int pages;
    private String publisher;
    private String isbn;

    public Book(String someTitle, String someAuthor, String somePublisher, int somePages, String someIsbn){
        this.title = someTitle;
        this.author = someAuthor;
        this.publisher = somePublisher;
        this.pages = somePages;
        this.isbn = someIsbn;
    }
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public int getPages() {
        return this.pages;
    }

    public String getIsbn() {
        return this.isbn;
    }
}
