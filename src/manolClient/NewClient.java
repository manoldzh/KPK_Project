package manolClient;

import manolCar.Car;
import manolCard.TrialCard;

public class NewClient extends Client {
    final static int ADDED_MINUTES = 5;

    /**
     * Constructor with parameters for class NewClient. It sets card to a card created by
     * Default Constructor of TrialCard
     * @param name
     * @param surname
     */
    public NewClient(String name, String surname){
        super(name,surname);
        setCard(new TrialCard());
    }

    /**
     * This method is used to get the price of a Car.
     * @param car
     * @return double - The price of the car
     */
    @Override
    public double calculatePriceForCar(Car car){
        return car.getPrice();
    }

    /**
     * This methos is used when a Client buy a Car and it adds points to the Client's Card.
     * @param car This is the car which the client will buy.
     */
    @Override
    public void buyCar(Car car){
        System.out.print( toString() + " buy " + car.toString() + " for " + calculatePriceForCar(car));
        getCard().addPoints();
    }

    /**
     * This method is used to calculate how many minutes can a Client drive by formula
     * points of the client + {@value manolClient.NewClient#ADDED_MINUTES}.
     * @return int This is the minutes of driving of this client.
     */
    public int calculateMinutesOfDriving(){
        int minutesOfDriving = getPoints() + ADDED_MINUTES;
        return minutesOfDriving;
    }

    /**
     * This method is used when a client drive a car it uses drive method of the car parameter.
     * @param car - This is the car which the client will drive.
     * @see "drive() of class Car"
     */
    @Override
    public void drive(Car car){
        String drivingCar = car.drive();
        System.out.println(drivingCar + toString() + " can drive the car " + car.toString() + " for " + calculateMinutesOfDriving() + " minutes");
    }
}
