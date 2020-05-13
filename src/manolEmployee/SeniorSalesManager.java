package manolEmployee;

import manolCar.Car;
import manolClient.Client;

public class SeniorSalesManager extends  Employee{
    final static double PERCENT_OF_COMMISSION = 0.015;
    final static double DIVIDER_OF_SOLD_CARS = 1000;
    public SeniorSalesManager(){
        super();
    }
    public SeniorSalesManager(String name, String surname, int salary){
        super(name, surname, salary);
    }
    @Override
    double commission(Car car, Client client){
        double addedPercents = getSoldCars()/DIVIDER_OF_SOLD_CARS;
        double valueOfCommission = client.priceForCar(car)*(PERCENT_OF_COMMISSION+addedPercents);
        return valueOfCommission;
    }

}