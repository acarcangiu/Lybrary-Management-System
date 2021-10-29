import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BookTest
{
    /**
     * it adds a new library member String and returns 
     * the added value when calling the getLibraryMember method
     */
    @Test
    public void testAddLibraryMember()
    {
        Book book2 = new Book("book1", "title1", "code123");
        book2.addlibraryMember("bob");
        assertEquals("bob", book2.getlibraryMember());
    }
    
    /**
     * it adds a new damage String and returns 
     * the added value when calling the getBookDamages method
     */
    @Test
    public void testAddDamages()
    {
        Book book1 = new Book("book1", "title1", "code123");
        book1.addBookDamages("the first page is scratched");
        assertEquals(",the first page is scratched", book1.getbookDamages());
    }
    
    /**
     * it checks the availability default value and its
     * value after using the setUnavailability method
     */
    @Test
    public void testCheckAvailability()
    {
        Book book1 = new Book("book1", "title1", "code123");
        book1.checkAvailability();
        book1.setUnvailability();
        book1.checkAvailability();
    }
}


