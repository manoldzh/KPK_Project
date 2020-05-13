package manolClient;

import manolCar.Car;
import manolCard.VIPCard;

public class VIPClient extends Client {
    final static int ADDED_PERCENTAGE_OF_DISCOUNT  = 10;
    final static int  DIVIDER_OF_POINTS = 30;
    final static int ADDED_MINUTES = 20;
    public VIPClient(String name, String surname){
        super(name,surname);
        setCard(new VIPCard());
    }
    @Override
    public void buyCar(Car car){
        double discount = ADDED_PERCENTAGE_OF_DISCOUNT + getPoints()/DIVIDER_OF_POINTS;
        double PriceForThisClient = car.getPrice() * ( 100 - discount)/100;
        System.out.print( toString() + " buy " + car.toString() + " for " + PriceForThisClient);
    }
    @Override
    public void drive(Car car){
        car.drive();
        int minutesOfDriving = getPoints() + ADDED_MINUTES;
        System.out.println(toString() + " can drive the car " + car.toString() + " for " + minutesOfDriving + " minutes");
    }
}
