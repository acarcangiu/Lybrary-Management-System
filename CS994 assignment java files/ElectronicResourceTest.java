

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ElectronicResourceTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElectronicResourceTest
{
    

    @Test
    public void testSetResourceFormat()
    {
        ElectronicResource electron1 = new ElectronicResource("bob", "title", "");
        electron1.setResourceFormat("eBook");
        assertEquals("eBook", electron1.getResourceFormat());
    }

    @Test
    public void testAddDevices()
    {
        ElectronicResource electron1 = new ElectronicResource("bob", "title", "");
        Device device1 = new Device();
        assertEquals(null, electron1.addDevices(device1));
    }
}


