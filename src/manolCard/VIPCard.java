package manolCard;

public class VIPCard extends Card  {
    private static final int DEFAULT_POINTS = 30;
    private static final int UPPER_BOUND = 100;
    private static final int INCREASING_POINTS = 2;

    public VIPCard(){
        id = Card.ID++;
        points = DEFAULT_POINTS;
    }
    public VIPCard(int points){
        id = Card.ID++;
        setPoints(points);
    }
    public VIPCard(VIPCard card){
        id = Card.ID++;
        points = card.getPoints();
    }
    @Override
    public void addPoints(){
        int temporaryPoints = points + INCREASING_POINTS;
        setPoints(temporaryPoints);
    }
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
