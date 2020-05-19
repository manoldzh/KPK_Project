package manolCard;

public class NormalCard extends Card  {
    private static final int DEFAULT_POINTS = 20;
    private static final int UPPER_BOUND = 40;
    private static final int INCREASING_POINTS = 1;

    public NormalCard(){
        id = Card.ID++;
        points = DEFAULT_POINTS;
    }
    public NormalCard(int points){
        id = Card.ID++;
        setPoints(points);
    }
    public NormalCard(NormalCard card){
        id = Card.ID++;
        points = card.points;
    }
    @Override
    public void addPoints() {
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
