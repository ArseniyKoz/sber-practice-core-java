package org.example;

public class Book {
    Author author;
    int year;

    public Book(Author author, int year){
        this.author = author;
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public Author getAuthor(){
        return author;
    }
    public void setAuthor(Author author){
        this.author = author;
    }

    public void myToString(){
        System.out.println("=========================");
        System.out.println("Имя автора: " + author.getName());
        System.out.println("Год издания книги: " + year);
        System.out.println("Связь с автором: " + author.getEmail());
        System.out.println("=========================");
    }
}
