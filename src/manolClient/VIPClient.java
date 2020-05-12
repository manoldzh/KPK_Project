package manolClient;

import manolCar.Car;
import manolCard.VIPCard;

public class VIPClient extends Client {
    public VIPClient(String name, String surname){
        super(name,surname);
        setCard(new VIPCard());
    }
    @Override
    public void buyCar(Car car){
        int PriceForThisClient = car.getPrice() * ( 90 - getPoints()/40)/100;
        System.out.print( toString() + " buy " + car.toString() + " for " + PriceForThisClient);
    }
    @Override
    public void drive(Car car){
        car.drive();
        int minutesDriving = getPoints() + 20;
        System.out.println(toString() + " can drive the car " + car.toString() + "for " + minutesDriving + " minutes");
    }
}
