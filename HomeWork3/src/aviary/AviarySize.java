package aviary;

public enum AviarySize {
    SMALL(2),
    MEDIUM(5),
    LARGE(8),
    XXL(10);

    private int size;

    AviarySize(int size){
        this.size=size;
    }

    public int getSize(){
        return size;
    }
}
