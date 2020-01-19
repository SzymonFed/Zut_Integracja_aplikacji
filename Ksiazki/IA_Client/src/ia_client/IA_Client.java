/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia_client;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Szymon
 */
public class IA_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Szymon Federkiewicz");
        book.setId("1");
        book.setIsbn("isbn");
        book.setPages(20);
        book.setPublisher("ZUT");
        book.setTitle("Pisanie klientów webowych na kolanie");
        book.setYear(2019);
        BookManagerService service = new BookManagerService();
        BookManager port = service.getBookManagerPort();
        port.add(book);
        
        List<Book> books = port.searchByAuthor("Szymon");
        for(Book b:books)
        {
        System.out.println("Tytuł: "+b.getTitle()+" Autor: "+b.getAuthor()+" Wydawca: "+b.getPublisher());
        }
        
        
    }

    
    
}
