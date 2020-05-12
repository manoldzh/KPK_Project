package manolCar;

import java.util.Comparator;

public class ComparatorOfCarsByBrand implements Comparator<Car> {
    @Override
    public int compare(Car firstCar, Car secondCar){
        return firstCar.getBrand().compareTo(secondCar.getBrand());
    }
}
