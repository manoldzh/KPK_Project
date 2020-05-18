package manolCar;

import java.util.Comparator;

public class ComparatorOfCarsByPrice<T extends Car> implements Comparator<T> {
    @Override
    public int compare(T firstCar, T secondCar){
        return Integer.compare(firstCar.getPrice(),secondCar.getPrice());
    }
}
