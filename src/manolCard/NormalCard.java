package manolCard;

public class NormalCard extends Card implements AddablePoints {

    public NormalCard(){
        id = Card.id++;
        points = 20;
    }
    public NormalCard(int points){
        id = Card.id++;
        setPoints(points);
    }
    public NormalCard(NormalCard card){
        id = Card.id++;
        points = card.points;
    }
    @Override
    public void addPoints() {
        setPoints(++this.points);
    }
    @Override
    public void setPoints(int points){
        if(points<0){
            this.points = 20;
        }else {
            if(points>40){
                this.points = 40;
            }else{
                this.points = points;
            }
        }
    }

}
