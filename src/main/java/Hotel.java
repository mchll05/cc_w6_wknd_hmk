import java.util.ArrayList;

public class Hotel {

    String hotelName;
    ArrayList <String> guests;

    public Hotel(String hotelName){
        this.hotelName = hotelName;
        this.guests = new ArrayList<>();
    }

    public String getHotelName(){
        return this.hotelName;
    }
}
