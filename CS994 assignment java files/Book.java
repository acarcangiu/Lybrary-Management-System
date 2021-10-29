import java.util.ArrayList;
/**
 * class that represents a physical book
 */
public class Book extends LibraryResources
{
    
    
    public String libraryMember;// represents a library member
    public String bookDamages;// represents the damages the book received
    public boolean Available;// reperesents the status of the book (available/unavailable
    
    
    public Book(String author, String title, String isbn)
    {
        super(author,title, isbn);
        libraryMember = "";
        bookDamages = "";
        Available = true;

    }

    /**
     * returns the member that has the book
     */
    
    public String getlibraryMember()
    {
        return libraryMember;
    }
    
    
    /**
     * returns the damages the book received
     */
    public String getbookDamages()
    {
        return bookDamages;
    }
    
    /**
     * sets the library member that borrowed the book
     */
    public void addlibraryMember(String librarymember)
    {
        libraryMember = librarymember;
    }
    
    
    /**
     * adds damages to the book
     */
    public void addBookDamages(String bookdamages)
    {
        if (bookDamages != bookdamages)
        {
            bookDamages = bookDamages + ", " + bookdamages;
        }
        else
        {
            bookDamages = bookdamages;
        }
    }
        
    /**
     *sets the book availability to unavailable 
     */
    public void setUnvailability()
    {
        Available = false;
    }
    
    /**
     * checks the availability status of the book
     */
    public void checkAvailability()
    {
        if (Available == true)
        {
            System.out.println("the book is Available");
        }
        else
        {
            System.out.println("the book is currently unavailable");
        }
    }
    
    
    /**
     * prints all the details registered on the book
     */
    @Override
    public void printResourceDetails()
    {
        System.out.println("#################");
        System.out.println("the book of the tile is " + Title);
        System.out.println("the author of the book is " + Author);
        System.out.println("the ISBN code is: " + Isbn);
        System.out.println("the member currently holding the item is: " + libraryMember);
        System.out.println("the reported damages on the items are: ");
        System.out.println("the reported damages are: " + getbookDamages());
        if (Available == true)
        {
            System.out.println("the book is Available");
        }
        else
        {
            System.out.println("the book is currently unavailable");
        }
    }
}