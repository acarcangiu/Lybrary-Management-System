
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DeviceTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DeviceTest
{
    /**
     * it tests the SetLocation method by adding a new 
     * location String and calling the getLocation function
     */
    @Test
    public void testSetLocation()
    {
        Device device1 = new Device();
        device1.setLocation("slot1");
        assertEquals("slot1", device1.getLocation());
    }
    
    /**
     * it tests the setDeviceType method by adding a new 
     * string deviceType and calling the getDeviceType method
     */
    @Test
    public void testSetDeviceType()
    {
        Device device1 = new Device();
        device1.setDeviceType("ebook reader");
        assertEquals("ebook reader", device1.getDeviceType());
    }
    
    /**
     * it tests the Availability method by returning its 
     * default value and after calling the setUnavailability method
     */
    @Test
    public void testAvailability()
    {
        Device device1 = new Device();
        device1.setUnvailability();
        assertEquals(false, device1.checkAvailability());
    }
    
    /**
     * it tests the printDetails method by printing the values
     * of all its fields 
     */
    @Test
    public void testPrintDetails()
    {
        Device device1 = new Device();
        device1.setDeviceType("ebook reader");
        device1.setLocation("slot1");
        device1.setUnvailability();
        device1.printDetails();
    }
}


