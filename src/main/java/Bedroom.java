public class Bedroom extends Room {

    String roomName;
    BedroomType type;
    double rate;

    public Bedroom(String roomName, BedroomType type, double rate){
        super(roomName);
        this.type = type;
        this.rate = rate;
    }

    public BedroomType getRoomType(){
        return this.type;
    }

    public double getRoomRate(){
        return this.rate;
    }

    public int getCapacityFromEnum() {
        return this.type.getCapacity();
    }
}
