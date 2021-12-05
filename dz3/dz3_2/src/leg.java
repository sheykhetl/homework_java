public class leg {
    private int size;

    public leg(int size) {
        this.size = size;
    }

    public int getLength() {
        return size;
    }

    public void setLength(int length) {
        this.size = length;
    }

    @Override
    public String toString() {
        return "leg {" +
                "size = " + size +
                '}';
    }
}
