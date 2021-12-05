public class pug extends dog {
    int old;
    int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public pug(int old, int weight) {
        this.old = old;
        this.weight = weight;
    }

    @Override
    public void woo() {
    }

    @Override
    public void gav() {

    }
}