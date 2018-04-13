import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom1;

    @Before
    public void before() {
        bedroom1 = new Bedroom(237, BedroomType.DOUBLE, 100.00);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(237, bedroom1.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals("double", bedroom1.getRoomType());
    }

    @Test
    public void hasRoomRate(){
        assertEquals(100.00, bedroom1.getRoomRate(), 0.1);
    }

    @Test
    public void doubleHasCapacity2(){
        bedroom1 = new Bedroom(BedroomType.DOUBLE);
        assertEquals(2, bedroom1.getCapacityFromEnum());
    }
}