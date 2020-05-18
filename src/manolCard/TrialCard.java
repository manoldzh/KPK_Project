package manolCard;

public class TrialCard extends Card implements AddablePoints {
    private static final int DEFAULT_POINTS = 5;
    private static final int UPPER_BOUND = 20;
    private static final int INCREASING_POINTS = 1;

    public TrialCard(){
        id = Card.ID++;
        points = DEFAULT_POINTS;
    }
    public TrialCard(int points){
        id = Card.ID++;
        setPoints(points);
    }
    public TrialCard(TrialCard card){
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