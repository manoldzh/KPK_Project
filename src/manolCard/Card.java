package manolCard;

public abstract class Card {
    protected int points;
    abstract public void setPoints(int points);
    public int getPoints(){
        return points;
    };
}
