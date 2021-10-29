
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LibraryMemberTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LibraryMemberTest
{
    
    /**
     * tests the setMemberName method by setting a string
     * value for the fullName field and by calling the 
     * getMemberName method
     */
    @Test
    public void testSetMemberName()
    {
        LibraryMember libraryM2 = new LibraryMember();
        libraryM2.setMemberName("bob");
        assertEquals("bob", libraryM2.getMemberName());
    }
    
    /**
     * tests the setMemberUsername method by setting a string
     * value for the userName field and by calling the 
     * getMemberUserName method
     */
    @Test
    public void testSetMemberUsername()
    {
        LibraryMember libraryM1 = new LibraryMember();
        libraryM1.setMemberUserName("bob123");
        assertEquals("bob123", libraryM1.getMemberUserName());
    }
    
    /**
     * tests the PrintMemberDetails method by setting the
     * LibraryMember fields to new values and printing them
     */
    @Test
    public void testPrintMemberDetails()
    {
        LibraryMember libraryM1 = new LibraryMember();
        libraryM1.setMemberName("bob");
        libraryM1.setMemberUserName("bob123");
        libraryM1.printMemberDetails();
    }
    
    /**
     * test the PrintMessages method by creating a new 
     * Library object, a new Book object and a new LibraryMember 
     * object. it adds the Book to the list of borrowed books
     * by the member and sends a message from the Library 
     * Objects to the LibraryMember object. Then calls the
     * PirntMessages method
     */
    @Test
    public void testPrintMessages()
    {
        Library library1 = new Library();
        LibraryMember libraryM1 = new LibraryMember();
        Book book1 = new Book("bob", "title", "isbn");
        libraryM1.addBooks(book1);
        library1.sendMessegesToUsers("new message");
        libraryM1.printMessages();
    }
    
    /**
     * tests the getNumberOfBooks method by adding a book
     * object to the list of borrowed books. then calls the
     * getNumberOfBooks method expecting to see the int 1
     */
    @Test
    public void testGetNumberOfBooks()
    {
        Book book1 = new Book("bob", "title", "isbn");
        LibraryMember libraryM1 = new LibraryMember();
        libraryM1.addBooks(book1);
        assertEquals(1, libraryM1.getNumberOfBooks());
    }
}



