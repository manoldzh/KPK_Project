package manolCar;

import java.util.Comparator;

public class ComparatorOfCarsByPrice implements Comparator<Car> {
    @Override
    public int compare(Car firstCar, Car secondCar){
        return Integer.compare(firstCar.getPrice(),secondCar.getPrice());
    }
}
