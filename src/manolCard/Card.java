package manolCard;

public abstract class Card {
    protected static int ID = 1;
    protected int points;
    public int id;
    abstract public void setPoints(int points);
    public int getPoints(){
        return points;
    }
    public int getId(){
        return id;
    }
}
