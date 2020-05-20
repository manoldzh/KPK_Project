package manolCar;

import java.util.Comparator;
/** Represents a Comparator of Cars which compare by Price.
 * @author Manol Dzhambazov
 * @version 1.0
 * @since 31.05.2020
 */
public class ComparatorOfCarsByPrice<T extends Car> implements Comparator<T> {
    /**
     * This method is used to compare two cars by price and if they have same price compare their brands.
     * @param firstCar This is the first Car.
     * @param secondCar  This is the second Car
     * @return int This returns number greater than 0 if firstCar is more expensive
     * than secondCar, number smaller than 0 if firstCar is cheaper than secondCar and zero
     * if two Object has same prices and Brands.
     */
    @Override
    public int compare(T firstCar, T secondCar){
        if(Integer.compare(firstCar.getPrice(),secondCar.getPrice())==0){
            return firstCar.getBrand().compareTo(secondCar.getBrand());
        }
        return Integer.compare(firstCar.getPrice(),secondCar.getPrice());
    }
}
