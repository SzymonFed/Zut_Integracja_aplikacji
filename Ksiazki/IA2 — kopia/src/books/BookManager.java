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
public class BookManager {
    private List<Book> books;

    public BookManager(List<Book> books) {
        this.books=books;
    }
    
    public void add(Book book)
    {
        this.books.add(book);
    }
    public List<Book> searchByTitle(String title)
    {
        List<Book> result = new ArrayList<>();
        for (Book b: books)
        {
            if(b.getTitle().contains(title))
            {
                result.add(b);
            }
        }
        return result;
    }
   /* public List<Book> searchByAuthor (String author)
    {
        List<Book> result = new ArrayList<>();
        for (Book b: books)
        {
            if(b.getAuthor().contains(author))
            {
                result.add(b);
            }
        }
        return result;
    }*/
    public Book searchByISBN(String isbn)
    {
        Book result = new Book();
        for (Book b: books)
        {
            if(b.getIsbn().contains(isbn))
            {
                result=b;
                break;
            }
        }
        return result;
    }
    
}
