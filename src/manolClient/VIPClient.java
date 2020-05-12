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
        double discount = 10 + getPoints()/30;
        double PriceForThisClient = car.getPrice() * ( 100 - discount)/100;
        System.out.print( toString() + " buy " + car.toString() + " for " + PriceForThisClient);
    }
    @Override
    public void drive(Car car){
        car.drive();
        int minutesOfDriving = getPoints() + 20;
        System.out.println(toString() + " can drive the car " + car.toString() + " for " + minutesOfDriving + " minutes");
    }
}
