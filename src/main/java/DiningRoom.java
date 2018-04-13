public class DiningRoom extends Room{

    String roomName;
    int dinerLimit;

    public DiningRoom(String roomName, int dinerLimit){
        super(roomName);
        this.dinerLimit = dinerLimit;
    }

    public int getDinerLimit(){
        return this.dinerLimit;
    }
}
