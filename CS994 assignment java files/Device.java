
/**
 * a class that represents the library devices (ebook readers, computers, tablets etc)
 * @author (your name)
 * @version (a version number or a date)
 */
public class Device
{
    private String deviceType;//the device type: ebook reader, computer, tablet ecc
    private String Location;//the location of the device in the library
    private boolean availableDevice;//the availability of the device

    public Device()
    {
        deviceType = "";
        Location = "";
        availableDevice = true;
    }
    
    /**
     * returns the location where the device is stored
     */
    public String getLocation()
    {
        return Location;
    }
    
    /**
     * returns the availability status of the device
     */
    public boolean getAvailableDevice()
    {
        return availableDevice;
    }
    
    /**
     * returns the type of device instantiated
     */
    public String getDeviceType()
    {
        return deviceType;
    }
    
    /**
     * sets the location of the device
     */
    public void setLocation(String location)
    {
        Location = location;
    }
    
    /**
     * sets the device type
     */
    public void setDeviceType(String devicetype)
    {
        deviceType = devicetype;
    }
    
    /**
     * sets the availability status of the device
     */
    public void setUnvailability()
    {
        availableDevice = false;
    }
    
    
    /**
     * prints all the registered details of the device
     */
    public void printDetails()
    {
        System.out.println("The selected device is a: " + deviceType);
        System.out.println("The device is located in the slot: " + Location);
        if (availableDevice == true)
        {
            System.out.println("The device is currently avilable");
        }
        else
        {
            System.out.println("The device is currently unavailable");
        }
    }
    
    /**
     * checks the availability of the device
     */
    public boolean checkAvailability()
    {
        return availableDevice;
    }
}
