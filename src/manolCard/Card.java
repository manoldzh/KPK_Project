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


    /**
     * This method is used to check whether two cards are equal.
     * It overrides the equals method of Object and returns true only if
     * two cards have the same id.
     * @param c This is the object with which we check whether this is equal.
     * @return boolean This returns whether the two Cards are equal.
     * @see "equals methos in the class Object."
     */
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
