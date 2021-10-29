
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LibraryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LibraryTest
{
    /**
     * tests the AddResources method by adding a Book object
     * to a Library object and then calling the getNumberOfResources
     * method expecting the int 1 in return
     */
    @Test
    public void testAddResources()
    {
        Library library1 = new Library();
        Book book1 = new Book("bob", "title", "isbn");
        library1.addResources(book1);
        assertEquals(1, library1.getNumberOfResources());
    }
    
    /**
     * tests the printLibraryDetails method by calling it
     * 
     */
    @Test
    public void testPrintLibraryDetails()
    {
        Library library1 = new Library();
        library1.printLibraryDetails();
    }
    
    /**
     * tests the CheckResourcesInCatalogue method by adding a new Book
     * object to the Library catalogue and by calling it. the method
     * should return true if the catalogue contains at least one 
     * LibraryResources object
     */
    @Test
    public void testCheckResourcesInCatalogue()
    {
        Library library1 = new Library();
        Book book1 = new Book("bob", "title", "isbn");
        library1.addResources(book1);
        assertEquals(true, library1.checkResourcesInCatalogue(book1));
    }
    
    /**
     * tests the EditTitle method by calling it and updating the title
     * of the selected LibraryResources object. it then calls the 
     * getResourceTitle method expecting the new title in return
     */
    @Test
    public void testEditTitle()
    {
        Library library1 = new Library();
        LibraryResources libraryR1 = new LibraryResources("bob", "title", "isbn");
        library1.addResources(libraryR1);
        library1.EditTitle(libraryR1, "new title");
        assertEquals("new title", libraryR1.getResourceTitle());
    }
    
    /**
     * tests the SearchObject method by creating a new LibraryResource
     * object and adding it to the Library catalogue. it then calls the method
     * expecting the added resource in return
     */
    @Test
    public void testSearchObject()
    {
        Library library2 = new Library();
        LibraryResources libraryR3 = new LibraryResources("bob", "title", "isbn");
        library2.addResources(libraryR3);
        assertEquals(libraryR3, library2.searchObject(libraryR3));
    }
    
    /**
     * tests the searchByIsbn method by creating two Book objects
     * (the ElectronicResource objects don't contain Isbn) and 
     * adding them to the Library catalogue. it then calls the searchByIsbn
     * method selecting only one expecting in return the int1 and 
     * the printed details of the resource
     */
    @Test
    public void testSearchByIsbn()
    {
        Library library1 = new Library();
        LibraryResources libraryR1 = new LibraryResources("bob", "title", "isbn");
        LibraryResources libraryR2 = new LibraryResources("alice", "title2", "isbn2");
        library1.addResources(libraryR1);
        library1.addResources(libraryR2);
        library1.searchByIsbn("isbn2");
    }
    
    /**
     * tests the searchByAuthor method by creting two LibraryResource
     * objects and adding them to the Library catalogue. it then calls
     * the searchByAuthor method expecting the int 1 in return and 
     * the printed details of the resource
     */
    @Test
    public void testSearchByAuthor()
    {
        Library library1 = new Library();
        LibraryResources libraryR1 = new LibraryResources("bob", "title", "isbn");
        LibraryResources libraryR2 = new LibraryResources("alice", "title2", "isbn2");
        library1.addResources(libraryR1);
        library1.addResources(libraryR2);
        library1.searchByAuthor("alice");
    }
    
    /**
     * it tests the removeResource method by adding two LibraryResources
     * objects to the Library catalogue and then removing only one.
     * it then calls the printAllBooks method expecting only one
     * resource to be printed
     */
    @Test
    public void testRemoveResource()
    {
        Library library2 = new Library();
        LibraryResources libraryR2 = new LibraryResources("alice", "title2", "isbn2");
        library2.addResources(libraryR2);
        library2.printAllBooks();
        library2.printAllBooks();
    }
    
    /**
     * tests the removeIndexedResource by creating two LibraryResources
     * objects and adding them to the Library cataolgue. it then 
     * calls the removeIndexedResource method and removes the 
     * resource from the catolgue to the selected index in the array.
     * it expects a null value in return
     */
    @Test
    public void testRemoveIndexedResource()
    {
        Library library1 = new Library();
        LibraryResources r1 = new LibraryResources("alice", "title2", "isbn2");
        LibraryResources r2 = new LibraryResources("bob", "title", "isbn");
        library1.addResources(r1);
        library1.addResources(r2);
        library1.removeIndexedResource(1);
        assertEquals(null, library1.searchObject(r2));
    }
    
    /**
     * it tests the printAllBooks method by creating a Book object
     * and an ElectronicResource object. it then calls the printAllBooks
     * method expecting only the book object's details to be printed
     */
    @Test
    public void testPrintAllBooks()
    {
        Library library2 = new Library();
        Book book2 = new Book("bob", "title", "isbn");
        ElectronicResource electron2 = new ElectronicResource("alice", "title2", "");
        library2.addResources(book2);
        library2.addResources(electron2);
        library2.printAllBooks();
    }
    
    /**
     * it creates two LibraryResources objects and adds them to the
     * Library catalogue. It then calls the getNumberOfResources expecting
     * the int 2 in return
     */
    @Test
    public void testGetNumberOfResources()
    {
        Library library1 = new Library();
        LibraryResources r1 = new LibraryResources("bob", "title", "isbn");
        LibraryResources r2 = new LibraryResources("alice", "title2", "");
        library1.addResources(r1);
        library1.addResources(r2);
        assertEquals(2, library1.getNumberOfResources());
    }
    
    /**
     * it tests the process of Lending a book by creating a Book object,
     * a Library object and a LibraryMember object. it adds the Book
     * object to the LibraryCatalogue. It then calls the testBookLending method 
     * and adds the Book object to the list of borrowedBooks of the 
     * selected LibraryMember object. it then calls the getNumberOfBooks
     * method of the LibraryMember object expecting the int 1 in return
     */
    @Test
    public void testBookLending()
    {
        Library library1 = new Library();
        LibraryMember libraryM1 = new LibraryMember();
        Book book1 = new Book("bob", "title", "isbn");
        library1.addResources(book1);
        book1.checkAvailability();
        library1.bookLending(book1, libraryM1);
        assertEquals(1, libraryM1.getNumberOfBooks());
    }
    
    /**
     * it tests the process of returning a book by creating a Book object,
     * a Library object and a and adding it to the Library catalogue.
     * it then adds the libraryMember value to the Book object.
     * it calls the returnBooks method that changes the value of the 
     * libraryMember field to null and checks if new damages are present
     * with a boolean value. if the value is true new damagaes are added.
     * it then calls the getBookDamages method from the Book object 
     * expecting the new damages in return in case they were adding in the return
     * process
     */
    @Test
    public void testReturnBooks()
    {
        Book book1 = new Book("bob", "title", "isbn");
        Library library1 = new Library();
        book1.setUnvailability();
        library1.addResources(book1);
        book1.addlibraryMember("alice");
        library1.returnBooks(book1, true, "the first page is scratched");
        assertEquals(null, book1.getlibraryMember());
        assertEquals("the first page is scratched", book1.getbookDamages());
    }
    
    /**
     * it creates a LibraryMember object, a Book object, a Library object
     * and calls the BookLending method as in the messages are sent only
     * to the members that currently hold a book. it then calls the 
     * sendMessagesToUsers method and sends a message. It then calls
     * the printMessages method in the LibraryMember object
     * expecting to see the list of messages received printed
     */
    @Test
    public void testSendMessagesToUsers()
    {
        LibraryMember libraryM1 = new LibraryMember();
        Book book1 = new Book("bob", "title", "isbn");
        Library library1 = new Library();
        library1.BookLending(book1, libraryM1);
        library1.sendMessegesToUsers("hello");
        libraryM1.printMessages();
    }
    
    /**
     * it tests the PrintAllBooksDetails method by creating a book object
     * and an ElectronicResource object and adding them to the 
     * Library catalogue. it then calls the method PrintAllBookSDetails
     * expecting to print only the Book objects
     */
    @Test
    public void testPrintAllBooksDetails()
    {
        Library library1 = new Library();
        Book book1 = new Book("bob", "title", "isbn");
        ElectronicResource electron1 = new ElectronicResource("alice", "title2", "");
        library1.addResources(book1);
        library1.addResources(electron1);
        library1.printAllBooksDetails();
    }
    
    /**
     * it tests the PrintAllBooksDetails method by creating a book object
     * and an ElectronicResource object and adding them to the 
     * Library catalogue. it then calls the method PrintAllElectronicResources
     * expecting to print only the ElectronicResource objects
     */
    @Test
    public void printAllElectronicResourcesDetails()
    {
        Library library1 = new Library();
        Book book1 = new Book("bob", "title", "isbn");
        ElectronicResource electron1 = new ElectronicResource("alice", "title2", "");
        library1.addResources(book1);
        library1.addResources(electron1);
        library1.printAllElectronicResourcesDetails();
    }
}








