package org.example;

public class TestBook {
    public static void main(String[] args){
        Author author1 = new Author("Fyodor","male", "dostoevskiy1881@gmail.com");
        Author author2 = new Author("Marina","female", "cvetaeva1892@gmail.com");

        Book book1 = new Book(author1, 1869);
        Book book2 = new Book(author2, 1922);

        Author testAuthor = book1.getAuthor();
        String testName = testAuthor.getName();
        String testGender = testAuthor.getGender();
        String testEmail = testAuthor.getEmail();
        int testYear = book1.getYear();
        System.out.println("=========================");
        System.out.println(testName);
        System.out.println(testGender);
        System.out.println(testEmail);
        System.out.println(testYear);

        Author testAuthor2 = book2.getAuthor();
        String testName2 = testAuthor2.getName();
        String testGender2 = testAuthor2.getGender();
        String testEmail2 = testAuthor2.getEmail();
        int testYear2 = book2.getYear();
        System.out.println("=========================");
        System.out.println(testName2);
        System.out.println(testGender2);
        System.out.println(testEmail2);
        System.out.println(testYear2);

        Author author3 = new Author("NaN","NaN", "NaN@gmail.com");
        Book book3 = new Book(author3, 0);

        book3.myToString();

        book3.setYear(1909);
        author3.setName("Vladimir");
        author3.setGender("male");
        author3.setEmail("vvlenin1918@gmail.com");
        book3.setAuthor(author3);


        book3.myToString():
    }
}
