import java.util.ArrayList;
/**
 * a class that represents the library and handle the the main library features
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    public ArrayList<LibraryResources> catalogue;//list of resources in the library
    public LibraryResources Title;//title of a resource
    public int NumOfResources;//number of resources in the library
    public ArrayList<LibraryMember> listOfMembers;//list of membeers affilated to the library
    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        // initialise instance variables
        catalogue = new ArrayList<>();
        Title = Title;
        NumOfResources = 0;
        listOfMembers = new ArrayList<>();
    }
    
    /**
     *adds resources that don't exist already in the library 
     */
    public void addResources(LibraryResources resource)
    {
        if (catalogue.contains(resource))
        {
            System.out.println("The resource is already in the catalogue, please enter a valid resource");

        }
        else
        {
            catalogue.add(resource);
        }
    }
    
    /**
     * print all the library details
     */
    /**
     * print all the details
     */
    public void printLibraryDetails()
    {
        System.out.println("Strathclyde University Library");;
        System.out.println("The Library is opened everyday 24h a day");
        System.out.println("Our collection is spread over five floors, throughout which you'll find a range of study spaces with wifi access so you can use your own laptop or there are computers for your use. There's also a cafe where you can grab lunch during the day, throughout the week, or a small take-away coffee shop where you can fuel up on caffeine during those long study hours.");
    }
    
    /**
     * returns a boolean to attest if a resource is in the catalogue
     */
    public boolean checkResourcesInCatalogue(Object resource)
    {
        if (catalogue.contains(resource))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

   
    /**
     * Edits the title of a resource in the catalogue
     */
    public void EditTitle(LibraryResources resource, String newTitle)
    {
        if (catalogue.contains(resource))
        {
            resource.Title = newTitle;
        }
    }
    
    /**
     * it searches a resource in the catalogue by its name
     * and returns it, if the resource is not in the 
     * catalogue it returns null
     */
    public Object searchObject(Object resource)
    {
        if (catalogue.contains(resource))
        {
            return resource;
        }
        else
        {
            return null;
        }
    }
    
    /**
     * it searches a resource by its Isbn value and returns
     * how many resources with the said Isbn value
     * were found
     */
    public void searchByIsbn(String isbn)
    {
        for (LibraryResources resource : catalogue)
        {
            if (resource.Isbn == isbn )
            {
                resource.printResourceDetails();
                NumOfResources++;
            }
            System.out.println(NumOfResources);
        } 
        NumOfResources = 0;
    }
    
    /**
     * it searches a resource in the catalogue by author and
     * returns how many resources related to the author
     * are in the catalogue
     */
    public void searchByAuthor(String authorsearch)
    {
        for (LibraryResources resource : catalogue)
        {
            if (resource.Author == authorsearch )
            {
                resource.printResourceDetails();
                NumOfResources++;
            }
            System.out.println(NumOfResources);
        } 
        
    }
    
    /**
     * it detect a resource by its name and removes it from
     * the catalogue, if the resource is not in the catalogue
     * an appropriate message is printed
     */
    public void removeResource(LibraryResources resourceToRemove)
    {
        for (LibraryResources resource : catalogue)
        {
            if (resourceToRemove == resource)
            {
                catalogue.remove(resource);
                NumOfResources--;
            }
            else
            {
                System.out.println("The selected resource is not in the catalogue");
            }
        }
    }
    
    /**
     * it removes the resource that corresponds to the 
     * selected index in the catalogue array
     */
    public void removeIndexedResource(int index)
    {
        if (index <= catalogue.size()) 
        {
            catalogue.remove(index);
        }
    }
    
    /**
     * it prints the details of all the books in the 
     * catalogue
     */
    public void printAllBooks()
    {
        for (LibraryResources resource : catalogue)
        {
            if (resource instanceof Book)
            {
                resource.printResourceDetails();
            }
        }
    }
    /**
     * it prints the details of all the electronic resources
     * in the catalogue
     */
    public int  getNumberOfResources()
    {
        for (LibraryResources resources : catalogue)
        {
            NumOfResources++;
        }
        return NumOfResources;
        
    }
    
    /**
     * it lends a book to a selected library member if
     * the book is in the catalogue, if it is available
     * and if the member has already borrowed less than 5
     * books
     */
    public void bookLending(Book bookobject, LibraryMember memberobject)
    {
        if (catalogue.contains(bookobject) && bookobject.Available == true
        && memberobject.borrowedBooks.size() <= 5) 
        {
            memberobject.addBooks(bookobject);
        }
        if (memberobject.borrowedBooks.size() > 5)
        {
            System.out.println("The selected library member can't borrow any more books");
        }
        if (bookobject.Available == false)
        {
            System.out.println("The book is currently unavailable");
        }
        bookobject.setUnvailability();
    }
    
    /**
     * it displays the act of returning a book, the member value
     * goes back to null and new eventual damages are registered.
     * if the book does not exist an appropriate error
     * message is printed
     */
    public void returnBooks(Book returnedbook, boolean istheredamage, String newDamage)
    {
        if (catalogue.contains(returnedbook) && returnedbook instanceof Book)
        {
            returnedbook.libraryMember = null;
            if (istheredamage == true)
            {
                returnedbook.bookDamages = newDamage;
            }
        }
        else
        {
            System.out.println("the Book does not exists in the library's catalogue. Please enter a valid item");
        }
    }
    
    /**
     * it sends a message to all the members that borrowed
     * a book
     */
    public void sendMessegesToUsers(String message)
    {
        for(LibraryMember member : listOfMembers)
        {
            if (member.getNumberOfBooks() > 0 )
            {
                member.messagesCollection.add(message);
            }
        }

    }
    
    /**
     * it prints all the details of all the books in the
     * catalogue
     */
    public void printAllBooksDetails()
    {
        for (LibraryResources resource : catalogue)
        {
            if (resource instanceof Book)
            {
                resource.printResourceDetails();
            }
        }
    }
    
    /**
     * it prints all the details of all the 
     * electronic resources in the catalogue
     */
    public void printAllElectronicResourcesDetails()
    {
        for (LibraryResources resource : catalogue)
        {
            if (resource instanceof ElectronicResource)
            {
                resource.printResourceDetails();
            }
        } 
    }
}
