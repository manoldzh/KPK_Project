package manolCard;

public class TrialCard extends Card implements AddablePoints {
    private int id;
    public TrialCard(){
        id = Card.id++;
        points = 5;
    }
    public TrialCard(int points){
        id = Card.id++;
        setPoints(points);
    }
    public TrialCard(TrialCard card){
        id = Card.id++;
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