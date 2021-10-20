package com.javaoctoberfest.task.oop_1.book_class;

import java.util.Arrays;

public class Book {
    private final String name;
    private final Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, double price, Author... authors) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, double price, int qty, Author... authors) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Author author : authors)
            stringBuilder.append(author.getName()).append(" ");
        return stringBuilder.toString();
    }
}
