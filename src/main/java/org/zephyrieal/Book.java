package org.zephyrieal;

public class Book {
    String title;
    String author;
    int year;
    String publisher;
    String genre;

    public Book(String title, String author, int year, String publisher, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return genre;
    }

    public void setCategory(String category) {
        this.genre = category;
    }

    public String toString() {
        return title + " by " + author + ", Published in" + year + ", Published by: " + publisher + ", Genre: " + genre + "\n";
    }
}
