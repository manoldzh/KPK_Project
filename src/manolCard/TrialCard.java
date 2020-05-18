package manolCard;

public class TrialCard extends Card implements AddablePoints {
    public TrialCard(){
        id = Card.ID++;
        points = 5;
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
        setPoints(++points);
    }
    @Override
    public void setPoints(int points){
        if(points<0){
            this.points = 5;
        }else {
            if(points>20){
                this.points = 20;
            }else{
                this.points = points;
            }
        }
    }

}