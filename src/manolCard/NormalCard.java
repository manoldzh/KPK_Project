package manolCard;
/** Represents a NormalCard.
 * @author Manol Dzhambazov
 * @version 1.0
 * @since 31.05.2020
 */

public class NormalCard extends Card  {
    private static final int DEFAULT_POINTS = 20;
    private static final int UPPER_BOUND = 40;
    private static final int INCREASING_POINTS = 1;
    /**
     * Default constructor for class NormalCard.
     */
    public NormalCard(){
        id = Card.ID++;
        points = DEFAULT_POINTS;
    }
    /**
     * Constructor with one parameters for class NormalCard, use setPoints().
     * @param points This is the start points of a NormalCard.
     * @see "setPoints() in class NormalCard"
     */
    public NormalCard(int points){
        id = Card.ID++;
        setPoints(points);
    }
    /**
     * Copy constructor for class NormalCard, using setPoints().
     * @param card This is the card from which it is copied.
     * @see "setPoints()"
     */
    public NormalCard(NormalCard card){
        id = Card.ID++;
        points = card.points;
    }
    /**
     * This method is used to add {@value manolCard.NormalCard#INCREASING_POINTS} of points. It use setPoints().
     * @see "setPoints() in class NormalCard"
     */
    @Override
    public void addPoints() {
        int temporaryPoints = points + INCREASING_POINTS;
        setPoints(temporaryPoints);
    }
    /**
     * This method is used to set points of a NormalCard.
     * But if they are more than {@value manolCard.NormalCard#UPPER_BOUND} or less than 0,
     * they are set to {@value manolCard.NormalCard#DEFAULT_POINTS} .
     * @param points This is the number of points.
     */
    @Override
    public void setPoints(int points){
        if(points<0){
            this.points = DEFAULT_POINTS;
        }else {
            if(points>UPPER_BOUND){
                this.points = UPPER_BOUND;
            }else{
                this.points = points;
            }
        }
    }

}
