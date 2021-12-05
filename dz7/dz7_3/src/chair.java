public class chair extends furniture {
    int CountOfLegs;
    int costs;

    @Override
    public void DoorClose() {
    }

    @Override
    public void DoorOpen() {
    }

    public chair(int CountOfLegs, int costs){
        this.CountOfLegs = CountOfLegs;
        this.costs = costs;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public int getCountOfLegs() {
        return CountOfLegs;
    }

    public void setCountOfLegs(int countOfLegs) {
        CountOfLegs = countOfLegs;
    }
}