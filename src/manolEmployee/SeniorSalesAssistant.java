package manolEmployee;

import manolCar.Car;
import manolClient.Client;

public class SeniorSalesAssistant extends Employee {
    final static double PERCENT_OF_COMMISSION = 0.007;
    final static double DIVIDER_OF_SOLD_CARS = 2000;
    public SeniorSalesAssistant(){
        super();
    }
    public SeniorSalesAssistant(String name, String surname, int salary){
        super(name, surname, salary);
    }
    @Override
    double commission(Car car, Client client){
        double addedPercents = getSoldCars()/DIVIDER_OF_SOLD_CARS;
        double valueOfCommission = client.priceForCar(car)*(PERCENT_OF_COMMISSION+addedPercents);
        return valueOfCommission;
    }

}
