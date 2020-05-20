package manolCard;
/** Represents a TrialCard.
 * @author Manol Dzhambazov
 * @version 1.0
 * @since 31.05.2020
 */
public class TrialCard extends Card  {
    private static final int DEFAULT_POINTS = 5;
    private static final int UPPER_BOUND = 20;
    private static final int INCREASING_POINTS = 1;
    /**
     * Default constructor for class TrialCard.
     */
    public TrialCard(){
        id = Card.ID++;
        points = DEFAULT_POINTS;
    }
    /**
     * Constructor with one parameters for class TrialCard, use setPoints().
     * @param points This is the start points os a TrialCard.
     * @see "setPoints()"
     */
    public TrialCard(int points){
        id = Card.ID++;
        setPoints(points);
    }
    /**
     * Copy constructor for class TrialCard, using setPoints().
     * @param card This is the card from which it is copied.
     * @see "setPoints() in class TrialCard"
     */
    public TrialCard(TrialCard card){
        id = Card.ID++;
        points = card.getPoints();
    }
    /**
     * This method is used to add {@value manolCard.TrialCard#INCREASING_POINTS} of points. It use setPoints().
     * @see "setPoints() in class TrialCard"
     */
    @Override
    public void addPoints(){
        int temporaryPoints = points + INCREASING_POINTS;
        setPoints(temporaryPoints);
    }
    /**
     * This method is used to set points of a TrialCard.
     * But if they are more than {@value manolCard.TrialCard#UPPER_BOUND} or less than 0,
     * they are set to {@value manolCard.TrialCard#DEFAULT_POINTS} .
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