/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Szymon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        /* Book book1 = new Book("book1","Bardzo pyszna kawa","Jacobs Kronung","1234",2019,"DS Amicus",20);
        Book book2 = new Book("book2","Ale wole sypaną, druga kawa","Tchibo Exclusive","2234",2018,"DS Arkona",110);
        Book book3 = new Book("book3","Ale jak darme to biere","El Rybako","3234",2017,"DS Andro",2000);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);*/
        
        try{
            JAXBContext context = JAXBContext.newInstance(BookList.class);
            Unmarshaller um = context.createUnmarshaller();

            FileReader fr = new FileReader("D:\\NetBeansProjects\\IA2 — kopia\\src\\XML\\books.2.xml");
            BookList books = (BookList) um.unmarshal(fr);
            fr.close();
            BookManager bookManager = new BookManager(books.getBooks());
            List<Book> searchByTitle = bookManager.searchByTitle("Java");
            System.out.println(searchByTitle.toString()+"\n");
            
            List<String> myBookAuthors = new ArrayList<>();
            myBookAuthors.add("Szymon Federkiewicz");
            myBookAuthors.add("Mateusz Federkiewicz");
            
            
            Book myBook = new Book("book2","Laboratorium: Java i XML",myBookAuthors,"2234",2018,"DS Amicus",110);
            bookManager.add(myBook);
            
            BookList myBooks = new BookList();
            myBooks.setBooks(bookManager.searchByTitle("Java"));
            
            Marshaller marsh = context.createMarshaller();
            OutputStream os = new FileOutputStream("D:\\NetBeansProjects\\IA2 — kopia\\src\\XML\\lab3.xml");
            marsh.marshal(myBooks,os );
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    
}
