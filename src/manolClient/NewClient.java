package manolClient;

import manolCar.Car;
import manolCard.TrialCard;

public class NewClient extends Client {
    final static int ADDED_MINUTES = 5;
    public NewClient(String name, String surname){
        super(name,surname);
        setCard(new TrialCard());
    }
    @Override
    public double calculatePriceForCar(Car car){
        return car.getPrice();
    }
    @Override
    public void buyCar(Car car){
        System.out.print( toString() + " buy " + car.toString() + " for " + calculatePriceForCar(car));
    }
    public int calculateMinutesOfDriving(){
        int minutesOfDriving = getPoints() + ADDED_MINUTES;
        return minutesOfDriving;
    }
    @Override
    public void drive(Car car){
        String drivingCar = car.drive();
        System.out.println(drivingCar + toString() + " can drive the car " + car.toString() + " for " + calculateMinutesOfDriving() + " minutes");
    }
}
