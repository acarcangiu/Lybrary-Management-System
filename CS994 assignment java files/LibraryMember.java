import java.util.ArrayList;
/**
 * a class that represents a member of the library
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibraryMember
{
    private String memberFullName;//full name of the member
    private String memberUserName;//member's username
    public ArrayList<Book> borrowedBooks;//list of books borrowed by the member
    public ArrayList<String> messagesCollection;//list of messages received from the library
    private Book books;//book objects
    private int booksnum;//number of books borrowed by the member
    /**
     * Constructor for objects of class LibraryMember
     */
    public LibraryMember()
    {
        memberFullName = "";
        memberUserName = "";
        borrowedBooks = new ArrayList<>();
        messagesCollection = new ArrayList<>();
        books = books;
        booksnum = 0;
    }
    
    /**
     * returns the member's full name
     */
    public String getMemberName()
    {
        return memberFullName;
    }
    
    /**
     * returns the member's username 
     */
    public String getMemberUserName()
    {
        return memberUserName;
    }
    
    /**
     * sets the member's full name
     */
    public void setMemberName(String memberfullname)
    {
        memberFullName = memberfullname;
    }
    
    /**
     * sets the member's username
     */
    public void setMemberUserName(String memberusername)
    {
        memberUserName = memberusername;
    }
    
    /**
     * prints the member's details
     */
    public void printMemberDetails()
    {
        System.out.println("The member " + memberFullName + "'s username is: " + memberUserName);
    }
    
    /**
     * prints all the messages the member has received from the library
     */
    public void printMessages()
    {
        for (String messages : messagesCollection) 
        {
            System.out.println(messages);
        }
    }
    
    /**
     * adds books to the list of borrowed books by the member
     */
    public void addBooks(Book books)
    {
        borrowedBooks.add(books);
    }

    /**
     * prints the details of all the borrowed books by the member
     */
    public void printAllBooks()
    {
        for (Book book : borrowedBooks)
        {
            book.printResourceDetails();
        }
    }
    
    /**
     * returns the number of books borrowed by the member
     */
    public int getNumberOfBooks()
    {
        for (Book book : borrowedBooks) 
        {
            booksnum++;

        }
        return booksnum;
    }

}

