public abstract class Room {

    String roomName;
    int occupancy;

    public Room(String roomName, int occupancy) {
        this.roomName = roomName;
        this.occupancy = occupancy;

    }

    public String getRoomName() {
        return roomName;
    }

    public int getOccupancy() {
        return occupancy;
    }
}

