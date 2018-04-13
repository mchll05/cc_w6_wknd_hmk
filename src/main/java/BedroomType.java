public enum BedroomType {
    PRESIDENTIAL(6),
    FAMILY(5),
    DOUBLE(2),
    SINGLE(1);

    private final int capacity;

    BedroomType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}


