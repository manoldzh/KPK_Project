package manolCard;

public abstract class Card {
    protected static int id = 1;
    protected int points;
    abstract public void setPoints(int points);
    public int getPoints(){
        return points;
    }
}
