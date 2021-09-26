package basics;

public class Probability {
    private Side side;
    private int value;
    private int prob;

    public Probability(Side side, int value, int prob) {
        this.side = side;
        this.value = value;
        this.prob = prob;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getProb() {
        return prob;
    }

    public void setProb(int prob) {
        this.prob = prob;
    }
}
