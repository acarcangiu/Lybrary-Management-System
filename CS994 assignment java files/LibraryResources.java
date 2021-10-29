
/**
 * A class that represents a resource that is in the library (physical books, 
 * journals, papers etc)
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibraryResources
{
    // instance variables - replace the example below with your own
    public String Title;
    public String Author;
    public String Isbn;


    /**
     * Constructor for objects of class LibraryResources
     */
    public LibraryResources(String author, String title, String isbn)
    {
        // initialise instance variables
        Author = author;//author of the resource
        Title = title;//title of the resource
        Isbn = isbn;//the isbn code related to the resource
       
    }
    
    /**
     * sets the title of the resource
     */
    public void setResourceName(String title)
    {
        Title = title;
    }
    
    /**
     * sets the name of the author of the resource
     */
    public void setResourceAuthor(String author)
    {
        Author = author;
    }
    
    /**
     * sets the isbn code related to the resource
     */
    public void setIsbn(String isbn)
    {
        Isbn = isbn;
    }
    
    /**
     * returns the resource title
     */
    public String getResourceTitle()
    {
        return Title;
    }
    
    /**
     * returns the name of the author of the resource
     */
    public String getResourceAuthor()
    {
        return Author;
    }
    
    /**
     * returns the isbn code of the resource
     */
    public String getResourceIsbn()
    {
        return Isbn;
    }
   
    
    /**
     * prints all the details related to the resource
     * distinguishing between physical books and
     * electronici resources based on the isbn code
     */
    public void printResourceDetails()
    {
        System.out.println("Title: " + Title );
        System.out.println("Author: " + Author );
        if (getResourceIsbn() == "")
        {
            System.out.println("this resource is an electronic resource and does not have an ISBN code");
        }
        else
        {
            System.out.println("ISBN code: " + Isbn);
        }
    }
    
    /**
     * edit the title of the resource
     */
    public void editTitle(String newTitle)
    {
        Title = newTitle;
    }

    
}
