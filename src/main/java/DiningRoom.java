public class DiningRoom extends Room{

    String roomName;
    int occupancy;
    int dinerLimit;

    public DiningRoom(String roomName, int occupancy, int dinerLimit){
        super(roomName, occupancy);
        this.dinerLimit = dinerLimit;
    }

    public int getDinerLimit(){
        return this.dinerLimit;
    }
}
