package manolEmployee;

import manolCar.Car;
import manolClient.Client;
/** Represents a JuniorSalesManager.
 * @author Manol Dzhambazov
 * @version 1.0
 * @since 31.05.2020
 */
public class JuniorSalesManager extends Employee {
    final static double PERCENT_OF_COMMISSION = 0.01;
    final static double DIVIDER_OF_SOLD_CARS = 1500;

    /**
     * Default constructor for class JuniorSalesManager which call the default constructor of class Employee.
     * @see "Employee() of class Employee"
     */
    public JuniorSalesManager(){
        super();
    }
    /**
     * Constructor for class JuniorSalesManager with only three parameter.
     * @param name This is the name of a JuniorSalesManager.
     * @param surname This is the surname of a JuniorSalesManager.
     * @param salary This is the salary of a JuniorSalesManager.
     */
    public JuniorSalesManager(String name, String surname, int salary){
        super(name, surname, salary);
    }

    /**
     * This method is used to calculate the added percents to the percents of the commission
     * by formula (number of sold cars)/ {@value manolEmployee.JuniorSalesManager#DIVIDER_OF_SOLD_CARS}.
     * @return double This is added percents.
     */
    @Override
    public double calculateAddedPercents(){
        double addedPercents = getSoldCars()/DIVIDER_OF_SOLD_CARS;
        return  addedPercents;
    }

    /**
     * This method is used to calculate the value of the commission when the JuniorSalesAssistant sell a car
     * to a client by the formula
     * (the price of the car for this client)*({@value manolEmployee.JuniorSalesManager#PERCENT_OF_COMMISSION} + added percents)
     * @param car This is the car which will be sold.
     * @param client This is the client to which will be sold the car.
     * @return double This is the value of the commission.
     */
    @Override
    public double calculateCommission(Car car, Client client){
        double valueOfCommission = client.calculatePriceForCar(car)*(PERCENT_OF_COMMISSION + calculateAddedPercents());
        return valueOfCommission;
    }

}
