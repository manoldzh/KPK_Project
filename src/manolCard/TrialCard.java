package manolCard;

public class TrialCard extends Card implements AddablePoints {
    TrialCard(){
        points = 5;
    }
    TrialCard(int points){
        setPoints(points);
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