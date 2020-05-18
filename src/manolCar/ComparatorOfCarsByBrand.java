package manolCar;

import java.util.Comparator;

public class ComparatorOfCarsByBrand<T extends Car> implements Comparator<T> {
    @Override
    public int compare(T firstCar, T secondCar){
        if(firstCar.getBrand().compareTo(secondCar.getBrand())==0){
            return firstCar.getModel().compareTo(secondCar.getModel());
        }
        return firstCar.getBrand().compareTo(secondCar.getBrand());
    }
}
