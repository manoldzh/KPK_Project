package manolClient;

import manolCar.Car;
import manolCard.NormalCard;

public class NormalClient extends Client {
    final static int ADDED_PERCENTAGE_OF_DISCOUNT  = 7;
    final static int  DIVIDER_OF_POINTS = 20;
    final static int ADDED_MINUTES = 15;

    /**
     * Constructor with parameters for class NormalClient. It sets card to a card created by
     * Default Constructor of NormalCard
     * @param name
     * @param surname
     */
    public NormalClient(String name, String surname){
        super(name,surname);
        this.setCard(new NormalCard());
    }

    /**
     * This method calculate the discount which this client has for buying cars
     * by formula: {@value manolClient.NormalClient#ADDED_PERCENTAGE_OF_DISCOUNT} +
     * (points of the client)/ {@value manolClient.NormalClient#DIVIDER_OF_POINTS}
     * @return double This is calculated discount.
     */
    public double calculateDiscount(){
        double discount = ADDED_PERCENTAGE_OF_DISCOUNT + getPoints()/DIVIDER_OF_POINTS;
        return discount;
    }
    /**
     * This method is used to calculate the price of a Car by formula:
     * (car price)*(100-calculated discount)/100;
     * @param car This is the car for which the price is calculated.
     * @return double - This is the price of the car with discount.
     */
    @Override
    public double calculatePriceForCar(Car car){
        double priceForCar = car.getPrice()*( 100 - calculateDiscount())/100;
        return priceForCar;
    }

    /**
     * This methos is used when a Client buy a Car and it adds points to the Client's Card.
     * @param car This is the car which the Client will buy.
     */
    @Override
    public void buyCar(Car car){
        System.out.print( toString() + " buy " + car.toString() + " for " + calculatePriceForCar(car));
        getCard().addPoints();
    }

    /**
     * This method is used to calculate how many minutes can a Client drive by formula
     * points of the client + {@value manolClient.NormalClient#ADDED_MINUTES}.
     * @return int This is the minutes of driving of this client.
     */
    @Override
    public int calculateMinutesOfDriving(){
        int minutesOfDriving = getPoints() + ADDED_MINUTES;
        return minutesOfDriving;
    }

    /**
     * This method is used when a client drive a car it uses drive method of the car parameter.
     * @param car - This is the car which the client will drive.
     * @see "drive() of class Car"
     */
    public void drive(Car car){
        String drivingCar = car.drive();
        System.out.println(drivingCar + toString() + " can drive the car " + car.toString() + " for " + calculateMinutesOfDriving() + " minutes");
    }
}
