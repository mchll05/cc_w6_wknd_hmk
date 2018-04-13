import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;

    @Before
    public void before() {
        bedroom1 = new Bedroom("237", 2, BedroomType.DOUBLE, 100.00);
        bedroom2 = new Bedroom("1408", 4, BedroomType.FAMILY, 120.00);
        bedroom3 = new Bedroom("666", 1, BedroomType.SINGLE, 80.00);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals("237", bedroom1.getRoomName());
    }

    @Test
    public void hasRoomType(){
        assertEquals(BedroomType.DOUBLE, bedroom1.getRoomType());
    }

    @Test
    public void hasRoomRate(){
        assertEquals(100.00, bedroom1.getRoomRate(), 0.1);
    }

    @Test
    public void doubleHasCapacity2(){
        bedroom1 = new Bedroom("237", 2, BedroomType.DOUBLE, 100.00);
        assertEquals(2, bedroom1.getCapacityFromEnum());
    }

    @Test
    public void hasOccupancy(){
        assertEquals(100, bedroom1.getOccupancy());
    }
}