package manolCard;

public class VIPCard implements AddablePoints {
    private int points;
    VIPCard(){
        points = 0;
    }
    VIPCard(int points){
        setPoints(points);
    }
    @Override
    public void addPoints(){
        int temporaryPoints = points + 2;
        setPoints(temporaryPoints);
    }
    private void setPoints(int points){
        if(points<0){
            this.points = 0;
        }else {
            if(points>100){
                this.points = 100;
            }else{
                this.points = points;
            }
        }
    }
}
