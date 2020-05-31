package manolCard;
/** Represents a VIPCard.
 * @author Manol Dzhambazov
 * @version 1.0
 * @since 31.05.2020
 */
public class VIPCard extends Card  {
    private static final int DEFAULT_POINTS = 30;
    private static final int UPPER_BOUND = 100;
    private static final int INCREASING_POINTS = 2;

    /**
     * Default constructor for class VIPCard.
     */
    public VIPCard(){
        id = Card.ID++;
        points = DEFAULT_POINTS;
    }
    /**
     * Constructor with one parameters for class VIPCard, use setPoints().
     * @param points This is the start points of a VIPCard.
     * @see "setPoints()"
     */
    public VIPCard(int points){
        id = Card.ID++;
        setPoints(points);
    }
    /**
     * Copy constructor for class VIPCard, using setPoints().
     * @param card This is the card from which it is copied.
     * @see "setPoints() in class VIPCard"
     */
    public VIPCard(VIPCard card){
        id = Card.ID++;
        points = card.getPoints();
    }

    /**
     * This method is used to set points of a VIPCard.
     * But if they are more than {@value manolCard.VIPCard#UPPER_BOUND} or less than 0,
     * they are set to {@value manolCard.VIPCard#DEFAULT_POINTS} .
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

    /**
     * This method is used to add {@value manolCard.VIPCard#INCREASING_POINTS} of points. It use setPoints().
     * @see "setPoints() in class VIPCard"
     */
    @Override
    public void addPoints(){
        int temporaryPoints = points + INCREASING_POINTS;
        setPoints(temporaryPoints);
    }
}
