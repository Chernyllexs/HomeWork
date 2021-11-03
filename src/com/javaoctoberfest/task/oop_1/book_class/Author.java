package com.javaoctoberfest.task.oop_1.book_class;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (gender != author.gender) return false;
        if (!getName().equals(author.getName())) return false;
        return email != null ? email.equals(author.email) : author.email == null;
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (int) gender;
        return result;
    }
}
