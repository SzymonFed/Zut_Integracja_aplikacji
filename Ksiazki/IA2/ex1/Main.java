/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Szymon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book book1 = new Book("book1","Bardzo pyszna kawa","Jacobs Kronung","1234",2019,"DS Amicus",20);
        Book book2 = new Book("book2","Ale wole sypaną, druga kawa","Tchibo Exclusive","2234",2018,"DS Arkona",110);
        Book book3 = new Book("book3","Ale jak darme to biere","El Rybako","3234",2017,"DS Andro",2000);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        
        BookManager bookManager = new BookManager(books);
        List<Book> searchByTitle = bookManager.searchByTitle("kawa");
        System.out.println(searchByTitle.toString()+"\n");
        List<Book> searchByAuthor = bookManager.searchByAuthor("Rybako");
        System.out.println(searchByAuthor.toString()+"\n");
        Book searchByISBN = bookManager.searchByISBN("2234");
        System.out.println(searchByISBN.toString()+"\n");
    }
    
}
