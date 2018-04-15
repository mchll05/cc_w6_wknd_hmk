import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class HotelTest {

        Hotel hotel;

        @Before
        public void before() {
            hotel = new Hotel("The Overlook Hotel");
        }

        @Test
        public void hasHotelName() {
            assertEquals("The Overlook Hotel", hotel.getHotelName());
        }

    }
