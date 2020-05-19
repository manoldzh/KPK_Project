package manolCard;

import manolCar.Car;

public abstract class Card {
    protected static int ID = 1;
    protected int points;
    public int id;
    abstract public void setPoints(int points);
    public int getPoints(){
        return points;
    }
    public int getId(){
        return id;
    }
    @Override
    public boolean equals(Object c){
        if(c==null){
            return false;
        }
        if(c == this){
            return true;
        }
        if(c.getClass() != this.getClass()) {
            return false;
        }
        if(((Card)c).getId() == this.getId() ) {
            return true;
        }
        return false;
    }
}
