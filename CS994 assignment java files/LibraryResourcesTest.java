
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LibraryResourcesTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LibraryResourcesTest
{   
    /**
     * tests the setAuthor method by calling the getResourceAuthor
     * method 
     */
    @Test
    public void testSetAuthor()
    {
        LibraryResources libraryR1 = new LibraryResources("bob", "title", "isbn");
        assertEquals("bob", libraryR1.getResourceAuthor());
    }
    
    /**tests the setResourceName method by calling the 
     * getResourceName method 
     */
    @Test
    public void testSetResourceName()
    {
        LibraryResources libraryR1 = new LibraryResources("bob", "title", "isbn");
        assertEquals("title", libraryR1.getResourceTitle());
    }
    
    /**
     * tests the setResourceIsbn method by calling the 
     * getResourceIsbn method
     */
    @Test
    public void testSetIsbn()
    {
        LibraryResources libraryR1 = new LibraryResources("bob", "title", "isbn");
        assertEquals("isbn", libraryR1.getResourceIsbn());
    }
    
    /**
     * tests the PirntResourceDetails by calling the function
     * on a new LibraryResource object
     */
    @Test
    public void testPrintResourceDetails()
    {
        LibraryResources libraryR1 = new LibraryResources("bob", "title", "isbn");
        LibraryResources libraryR2 = new LibraryResources("alice", "title2", "");
        libraryR1.printResourceDetails();
        libraryR2.printResourceDetails();
    }
    
    /**
     * tests the EditTitle method by calling the editTitle
     * method and then calling the getTitle method
     * expecting the new title in return
     */
    @Test
    public void testEditTitle()
    {
        LibraryResources libraryR1 = new LibraryResources("bob", "title", "isbn");
        libraryR1.editTitle("newtitle");
        assertEquals("newtitle", libraryR1.getResourceTitle());
    }
}



