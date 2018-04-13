import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Jack Torrance");
    }

    @Test
    public void hasGuestName(){
        assertEquals("Jack Torrance", guest1.getName());
    }
}
