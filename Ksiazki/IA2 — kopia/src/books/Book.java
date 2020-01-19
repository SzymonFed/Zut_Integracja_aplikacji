/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;


import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Szymon
 */
@XmlType(name = "book")
public class Book {
    private String id;
    private String title;

    private List<String> authors;
    private String isbn;
    private int year;
    private String publisher;
    private int pages;
    public Book(){}
    public Book (String id, String title, List<String> authors, String isbn, int year,String publisher, int pages)
    {
        this.id=id;
        this.title=title;
        this.authors=authors;
        this.isbn = isbn;
        this.year = year;
        this.publisher=publisher;
        this.pages = pages;
    }
    @Override
    public String toString()
    {
        return this.title+", " + this.authors+", "+ this.isbn;
    }
    @XmlAttribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    @XmlElementWrapper(name="authors")
    @XmlElement(name="author")
    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
