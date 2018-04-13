public class Bedroom {

    int roomNum;
    String type;
    double rate;

    public Bedroom(int roomNum, String type, double rate){
        this.roomNum = roomNum;
        this.type = type;
        this.rate = rate;
    }

    public int getRoomNumber(){
        return this.roomNum;
    }

    public String getRoomType(){
        return this.type;
    }

    public double getRoomRate(){
        return this.rate;
    }

    public int getCapacityFromEnum() {
        return this.type.getCapacity();
    }
}
