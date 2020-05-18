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

    public double calculateDiscount(){
        double discount = ADDED_PERCENTAGE_OF_DISCOUNT + getPoints()/DIVIDER_OF_POINTS;
        return discount;
    }
    @Override
    public double calculatePriceForCar(Car car){
        double priceForCar = car.getPrice()*( 100 - calculateDiscount())/100;
        return priceForCar;
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
    public void drive(Car car){
        String drivingCar = car.drive();
        System.out.println(drivingCar + toString() + " can drive the car " + car.toString() + " for " + calculateMinutesOfDriving() + " minutes");
    }
}
