package manolEmployee;

import manolCar.Car;
import manolClient.Client;

public class JuniorSalesAssistant extends Employee {
    final static double PERCENT_OF_COMMISSION = 0.005;
    public JuniorSalesAssistant(){
        super();
    }
    public JuniorSalesAssistant(String name, String surname, int salary){
        super(name, surname, salary);
    }
    @Override
    double commission(Car car, Client client){
        double addedPercents = getSoldCars()/5000;
        double valueOfCommission = client.priceForCar(car)*(PERCENT_OF_COMMISSION+addedPercents);
        return valueOfCommission;
    }


}
