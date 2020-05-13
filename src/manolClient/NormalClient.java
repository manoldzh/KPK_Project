package manolClient;

import manolCar.Car;
import manolCard.NormalCard;

public class NormalClient extends Client {
    final static int ADDED_PERCENTAGE_OF_DISCOUNT  = 7;
    final static int  DIVIDER_OF_POINTS = 20;
    final static int ADDED_MINUTES = 15;
    public NormalClient(String name, String surname){
        super(name,surname);
        this.setCard(new NormalCard());
    }
    @Override
    public double priceForCar(Car car){
        double discount = ADDED_PERCENTAGE_OF_DISCOUNT + getPoints()/DIVIDER_OF_POINTS;
        double priceForCar = car.getPrice()*( 100 - discount)/100;
        return priceForCar;
    }
    @Override
    public void buyCar(Car car){
        System.out.print( toString() + " buy " + car.toString() + " for " + priceForCar(car));
    }
    public void drive(Car car){
        String drivingCar = car.drive();
        int minutesOfDriving = getPoints() + ADDED_MINUTES;
        System.out.println(drivingCar + toString() + " can drive the car " + car.toString() + " for " + minutesOfDriving + " minutes");
    }
}
