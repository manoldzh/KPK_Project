package manolCard;

public class NormalCard implements AddablePoints {
    private int points;
    NormalCard(){
        points = 0;
    }
    NormalCard(int points){
        setPoints(points);
    }
    @Override
    public void addPoints() {
        setPoints(++this.points);
    }
    private void setPoints(int points){
        if(points<0){
            this.points = 0;
        }else {
            if(points>40){
                this.points = 40;
            }else{
                this.points = points;
            }
        }
    }
}
