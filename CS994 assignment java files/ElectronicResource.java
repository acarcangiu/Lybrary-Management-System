import java.util.ArrayList;

/**
 * a class that represents an electronic resource(journal, papers etch)
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectronicResource extends LibraryResources
{
    private String Format;//the format of the electronic resource (journal, scientific article etc)
    private ArrayList<Device> devicesList;//list of electronic devices in the library
    /**
     * Constructor for objects of class Ebook
     */
    public ElectronicResource(String author, String title, String isbn)
    {
        super(author, title, isbn);
        Format = "";
        devicesList = new ArrayList<>();
        
        
    }
    
    /**
     * sets the format of the resource
     */
    public void setResourceFormat(String resourceformat)
    {
        Format = resourceformat;
    }
    
    /**
     * returns the format of the resource
     */
    public String getResourceFormat()
    {
        return Format;
    }
    
    /**
     * adds new devices to the list of available devices in the
     * library and disregards the already existing ones
     */
    public Device addDevices(Device device)
    {
        if (devicesList.contains(device))
        {
            System.out.println("the device exists already in our inventory");
        }
        else
        {
            devicesList.add(device);
        }
        return null;
    }

}