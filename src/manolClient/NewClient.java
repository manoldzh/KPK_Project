package manolClient;

import manolCar.Car;
import manolCard.TrialCard;

public class NewClient extends  Client {
    public NewClient(String name, String surname){
        super(name,surname);
        setCard(new TrialCard());
    }
    @Override
    public void buyCar(Car car){
        System.out.print( toString() + " buy " + car.toString() + " for " + car.getPrice());
    }
    @Override
    public void drive(Car car){
        car.drive();
        int minutesDriving = getPoints() +5;
        System.out.println(toString() + " can drive the car " + car.toString() + "for " + minutesDriving + " minutes");
    }
}
