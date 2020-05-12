package manolClient;

import manolCar.Car;
import manolCard.NormalCard;

public class NormalClient extends Client {
    public NormalClient(String name, String surname){
        super(name,surname);
        this.setCard(new NormalCard());
    }
    @Override
    public void buyCar(Car car){
        int PriceForThisClient = car.getPrice()*(95-getPoints()/20)/100;
        System.out.print( toString() + " buy " + car.toString() + " for " + PriceForThisClient);
    }
}
