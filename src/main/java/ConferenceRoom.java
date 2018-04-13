public class ConferenceRoom extends Room{

    String roomName;
    double dailyRate;

    public ConferenceRoom(String roomName, double dailyRate){
        super(roomName);
        this.dailyRate = dailyRate;
    }

    public double getDailyRate(){
        return this.dailyRate;
    }
}
