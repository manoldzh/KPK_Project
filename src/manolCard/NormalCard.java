package manolCard;

public class NormalCard extends Card implements AddablePoints {

    NormalCard(){
        points = 20;
    }
    NormalCard(int points){
        setPoints(points);
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
