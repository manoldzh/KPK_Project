package manolClient;

import manolCar.Car;
import manolCard.TrialCard;

public class NewClient extends  Client {
    final static int ADDED_MINUTES = 5;
    public NewClient(String name, String surname){
        super(name,surname);
        setCard(new TrialCard());
    }
    @Override
    public double priceForCar(Car car){
        return car.getPrice();
    }
    @Override
    public void buyCar(Car car){
        System.out.print( toString() + " buy " + car.toString() + " for " + priceForCar(car));
    }
    @Override
    public void drive(Car car){
        car.drive();
        int minutesOfDriving = getPoints() + ADDED_MINUTES;
        System.out.println(toString() + " can drive the car " + car.toString() + " for " + minutesOfDriving + " minutes");
    }
}
