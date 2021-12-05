public class hand {
    private int length;

    public hand(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "hand {" +
                "length = " + length +
                '}';
    }
}
