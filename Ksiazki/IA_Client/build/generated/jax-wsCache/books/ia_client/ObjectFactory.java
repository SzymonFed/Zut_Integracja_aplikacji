
package ia_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ia_client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchByISBNResponse_QNAME = new QName("http://books/", "searchByISBNResponse");
    private final static QName _Add_QNAME = new QName("http://books/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://books/", "addResponse");
    private final static QName _SearchByAuthor_QNAME = new QName("http://books/", "searchByAuthor");
    private final static QName _SearchByISBN_QNAME = new QName("http://books/", "searchByISBN");
    private final static QName _SearchByTitle_QNAME = new QName("http://books/", "searchByTitle");
    private final static QName _SearchByTitleResponse_QNAME = new QName("http://books/", "searchByTitleResponse");
    private final static QName _SearchByAuthorResponse_QNAME = new QName("http://books/", "searchByAuthorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ia_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link SearchByISBNResponse }
     * 
     */
    public SearchByISBNResponse createSearchByISBNResponse() {
        return new SearchByISBNResponse();
    }

    /**
     * Create an instance of {@link SearchByAuthor }
     * 
     */
    public SearchByAuthor createSearchByAuthor() {
        return new SearchByAuthor();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link SearchByISBN }
     * 
     */
    public SearchByISBN createSearchByISBN() {
        return new SearchByISBN();
    }

    /**
     * Create an instance of {@link SearchByAuthorResponse }
     * 
     */
    public SearchByAuthorResponse createSearchByAuthorResponse() {
        return new SearchByAuthorResponse();
    }

    /**
     * Create an instance of {@link SearchByTitleResponse }
     * 
     */
    public SearchByTitleResponse createSearchByTitleResponse() {
        return new SearchByTitleResponse();
    }

    /**
     * Create an instance of {@link SearchByTitle }
     * 
     */
    public SearchByTitle createSearchByTitle() {
        return new SearchByTitle();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByISBNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books/", name = "searchByISBNResponse")
    public JAXBElement<SearchByISBNResponse> createSearchByISBNResponse(SearchByISBNResponse value) {
        return new JAXBElement<SearchByISBNResponse>(_SearchByISBNResponse_QNAME, SearchByISBNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books/", name = "searchByAuthor")
    public JAXBElement<SearchByAuthor> createSearchByAuthor(SearchByAuthor value) {
        return new JAXBElement<SearchByAuthor>(_SearchByAuthor_QNAME, SearchByAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByISBN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books/", name = "searchByISBN")
    public JAXBElement<SearchByISBN> createSearchByISBN(SearchByISBN value) {
        return new JAXBElement<SearchByISBN>(_SearchByISBN_QNAME, SearchByISBN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books/", name = "searchByTitle")
    public JAXBElement<SearchByTitle> createSearchByTitle(SearchByTitle value) {
        return new JAXBElement<SearchByTitle>(_SearchByTitle_QNAME, SearchByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books/", name = "searchByTitleResponse")
    public JAXBElement<SearchByTitleResponse> createSearchByTitleResponse(SearchByTitleResponse value) {
        return new JAXBElement<SearchByTitleResponse>(_SearchByTitleResponse_QNAME, SearchByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books/", name = "searchByAuthorResponse")
    public JAXBElement<SearchByAuthorResponse> createSearchByAuthorResponse(SearchByAuthorResponse value) {
        return new JAXBElement<SearchByAuthorResponse>(_SearchByAuthorResponse_QNAME, SearchByAuthorResponse.class, null, value);
    }

}
