package manolCard;
/** Represents a Card.
 * @author Manol Dzhambazov
 * @version 1.0
 * @since 31.05.2020
 */
public abstract class Card  {
    protected static int ID = 1;
    protected int points;
    public int id;
    abstract public void setPoints(int points);
    abstract public void addPoints();
    /**
     * This method is used to get the points of a Card.
     * @return int This returns the points of a Card.
     */
    public int getPoints(){
        return points;
    }
    /**
     * This method is used to get the id of a Card which is unique for every card.
     * @return int This returns the id of a Card.
     */
    public int getId(){
        return id;
    }
    @Override
    public boolean equals(Object c){
        if(c==null){
            return false;
        }
        if(c == this){
            return true;
        }
        if(c.getClass() != this.getClass()) {
            return false;
        }
        if(((Card)c).getId() == this.getId() ) {
            return true;
        }
        return false;
    }
}
