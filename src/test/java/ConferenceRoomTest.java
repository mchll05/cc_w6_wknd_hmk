import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conference1;

    @Before
    public void before(){
        conference1 = new ConferenceRoom("Redrum", 250.00);
    }

    @Test
    public void hasRoomName(){
        assertEquals("Redrum", conference1.getRoomName());
    }

    @Test
    public void hasDailyRate(){
        assertEquals(250.00, conference1.getDailyRate(), 0.1);
    }
}
