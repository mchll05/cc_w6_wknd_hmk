import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom("Hell's Kitchen", 25, 75);
    }

    @Test
    public void hasroomName(){
        assertEquals("Hell's Kitchen", diningRoom.getRoomName());
    }

    @Test
    public void hasDinerLimit(){
        assertEquals(75, diningRoom.getDinerLimit());
    }

    @Test
    public void hasOccupancy(){
        assertEquals(25, diningRoom.getOccupancy());
    }
}


