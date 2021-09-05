package basics;

public class Piece {
    private static final int MAX_NUM = 9;

    private int upperSide;
    private int rightSide;
    private int downSide;
    private int leftSide;

    public Piece() {
        this.upperSide = -1;
        this.rightSide = -1;
        this.downSide = -1;
        this.leftSide = -1;
    }

    public Piece(int upperSide, int rightSide, int downSide, int leftSide) {
        setUpperSide(upperSide);
        setRightSide(rightSide);
        setDownSide(downSide);
        setLeftSide(leftSide);
    }

    private void setUpperSide(int upperSide) {
        if (upperSide != -1)
            this.upperSide = upperSide;
        else
            this.upperSide = RandGenerator.randInt(0, MAX_NUM);
    }

    private void setRightSide(int rightSide) {
        if (rightSide != -1)
            this.rightSide = rightSide;
        else
            this.rightSide = RandGenerator.randInt(0, MAX_NUM);
    }

    private void setDownSide(int downSide) {
        if (downSide != -1)
            this.downSide = downSide;
        else
            this.downSide = RandGenerator.randInt(0, MAX_NUM);
    }

    private void setLeftSide(int leftSide) {
        if (leftSide != -1)
            this.leftSide = leftSide;
        else
            this.leftSide = RandGenerator.randInt(0, MAX_NUM);
    }

    public int getUpperSide() {
        return upperSide;
    }

    public int getRightSide() {
        return rightSide;
    }

    public int getDownSide() {
        return downSide;
    }

    public int getLeftSide() {
        return leftSide;
    }

    public int[] getSides(){
        return new int[]{getUpperSide(), getRightSide(), getDownSide(), getLeftSide()};
    }
}
