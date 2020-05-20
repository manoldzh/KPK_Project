package manolCar;

import java.util.Comparator;
/** Represents a Comparator of Cars which compare by Brand.
 * @author Manol Dzhambazov
 * @version 1.0
 * @since 31.05.2020
 */
public class ComparatorOfCarsByBrand<T extends Car> implements Comparator<T> {
    /**
     * This method is used to compare two cars by brand and if they have same brand compare their models.
     * @param firstCar This is the first Car.
     * @param secondCar  This is the second Car.
     * @return int This returns the result of comparing two Strings(brands of two cars) with method compareTo
     * and if returns zero it returns the result of comparing Strings - the model of the firstCar and the
     * model of the secondCar.
     * @see "compareTo() of String"
     */
    @Override
    public int compare(T firstCar, T secondCar){
        if(firstCar.getBrand().compareTo(secondCar.getBrand())==0){
            return firstCar.getModel().compareTo(secondCar.getModel());
        }
        return firstCar.getBrand().compareTo(secondCar.getBrand());
    }
}
