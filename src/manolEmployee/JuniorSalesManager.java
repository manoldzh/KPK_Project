package manolEmployee;

import manolCar.Car;
import manolClient.Client;

public class JuniorSalesManager extends Employee {
    final static double PERCENT_OF_COMMISSION = 0.01;
    public JuniorSalesManager(){
        super();
    }
    public JuniorSalesManager(String name, String surname, int salary){
        super(name, surname, salary);
    }
    @Override
    double commission(Car car, Client client){
        double addedPercents = getSoldCars()/1500;
        double valueOfCommission = client.priceForCar(car)*(PERCENT_OF_COMMISSION+addedPercents);
        return valueOfCommission;
    }

}
