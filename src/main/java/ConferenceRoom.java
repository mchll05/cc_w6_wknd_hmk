public class ConferenceRoom extends Room{

    String roomName;
    int occupancy;
    double dailyRate;


    public ConferenceRoom(String roomName, int occupancy, double dailyRate){
        super(roomName, occupancy);
        this.dailyRate = dailyRate;
    }

    public double getDailyRate(){
        return this.dailyRate;
    }
}
