package basics;

public class Piece {
    // Fija el numero mayor que puede tener una cara de la pieza (del 0 al 9)
    public static final int MAX_NUM = 9;

    private int upperSide;
    private int rightSide;
    private int downSide;
    private int leftSide;


    private boolean used;
    private int probability;


    public Piece() {
        this.upperSide = -1;
        this.rightSide = -1;
        this.downSide = -1;
        this.leftSide = -1;
        this.used = false;
        this.probability = 0;
    }

    public Piece(int upperSide, int rightSide, int downSide, int leftSide, boolean used) {
        setUpperSide(upperSide);
        setRightSide(rightSide);
        setDownSide(downSide);
        setLeftSide(leftSide);
        this.used = used;
        this.probability = 0;
    }

    public boolean hasMatch(int valueUp, int valueLeft) {
        return ((valueUp == -1 || upperSide == valueUp) && (valueLeft == -1 || leftSide == valueLeft));
    }

    // Si recibe un -1 se le asignara un random, caso contrario se asigna el valor indicado.
    private void setUpperSide(int upperSide) {
        if (upperSide != -1)
            this.upperSide = upperSide;
        else
            this.upperSide = RandGenerator.randInt(0, MAX_NUM);
    }

    // Si recibe un -1 se le asignara un random, caso contrario se asigna el valor indicado.
    private void setRightSide(int rightSide) {
        if (rightSide != -1)
            this.rightSide = rightSide;
        else
            this.rightSide = RandGenerator.randInt(0, MAX_NUM);
    }

    // Si recibe un -1 se le asignara un random, caso contrario se asigna el valor indicado.
    private void setDownSide(int downSide) {
        if (downSide != -1)
            this.downSide = downSide;
        else
            this.downSide = RandGenerator.randInt(0, MAX_NUM);
    }

    // Si recibe un -1 se le asignara un random, caso contrario se asigna el valor indicado.
    private void setLeftSide(int leftSide) {
        if (leftSide != -1)
            this.leftSide = leftSide;
        else
            this.leftSide = RandGenerator.randInt(0, MAX_NUM);
    }

    public void setProbability(int probability) {
        this.probability += probability;
    }

    public void resetProbability() {
        this.probability = 0;
    }

    public int getProbability() {
        return probability;
    }

    //set true used
    public void setUsed(){
        this.used = true;
    }

    //set false used
    public void setUnused(){
        this.used = false;
    }

    public boolean getUsed(){
        return used;
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
