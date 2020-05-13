package manolCar;

import java.util.Comparator;

public class ComparatorOfCarsByBrand implements Comparator<Car> {
    @Override
    public int compare(Car firstCar, Car secondCar){
        if(firstCar.getBrand().compareTo(secondCar.getBrand())==0){
            return firstCar.getModel().compareTo(secondCar.getModel());
        }
        return firstCar.getBrand().compareTo(secondCar.getBrand());
    }
}
