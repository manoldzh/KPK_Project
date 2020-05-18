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
    public double calculateDiscount(){
        double discount = ADDED_PERCENTAGE_OF_DISCOUNT + getPoints()/DIVIDER_OF_POINTS;
        return discount;
    }
    @Override
    public double calculatePriceForCar(Car car){
        double priceForThisClient = car.getPrice() * ( 100 - calculateDiscount())/100;
        return priceForThisClient;
    }
    @Override
    public void buyCar(Car car){
        System.out.print( toString() + " buy " + car.toString() + " for " + calculatePriceForCar(car));
    }
    @Override
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
