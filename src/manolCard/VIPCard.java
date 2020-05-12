package manolCard;

public class VIPCard extends Card implements AddablePoints {

    VIPCard(){
        points = 30;
    }
    VIPCard(int points){
        setPoints(points);
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
