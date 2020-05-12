package manolCard;

public class VIPCard extends Card implements AddablePoints {

    public VIPCard(){
        id = Card.id++;
        points = 30;
    }
    public VIPCard(int points){
        id = Card.id++;
        setPoints(points);
    }
    public VIPCard(VIPCard card){
        id = Card.id++;
        points = card.getPoints();
    }
    @Override
    public void addPoints(){
        int temporaryPoints = points + 2;
        setPoints(temporaryPoints);
    }
    @Override
    public void setPoints(int points){
        if(points<0){
            this.points = 30;
        }else {
            if(points>100){
                this.points = 100;
            }else{
                this.points = points;
            }
        }
    }

}