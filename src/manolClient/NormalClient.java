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
        double discount = 7 + getPoints()/20;
        double PriceForThisClient = car.getPrice()*( 100 - discount)/100;
        System.out.print( toString() + " buy " + car.toString() + " for " + PriceForThisClient);
    }
    public void drive(Car car){
        car.drive();
        int minutesOfDriving = getPoints() + 15;
        System.out.println(toString() + " can drive the car " + car.toString() + " for " + minutesOfDriving + " minutes");
    }
}
