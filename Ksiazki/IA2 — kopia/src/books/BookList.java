/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Szymon
 */
@XmlRootElement(name = "books")
public class BookList {
    private List<Book> books;
    @XmlElement(name = "book")
    public List<Book> getBooks(){
        return books;
    }
    public void setBooks (List<Book> books)
    {
        this.books = books;
    }
}
