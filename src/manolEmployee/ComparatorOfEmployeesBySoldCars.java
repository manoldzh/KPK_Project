package manolEmployee;

import java.util.Comparator;
/** Represents a Comparator of Employee which compare by the number of sold cars.
 * @author Manol Dzhambazov
 * @version 1.0
 * @since 31.05.2020
 */
public class ComparatorOfEmployeesBySoldCars<T extends Employee> implements Comparator<T> {
    /**
     * This method is used to compare two employees by the number of sold cars.
     * @param firstEmployee This is the first Employee.
     * @param secondEmployee  This is the second Employee.
     * @return int This returns the result of comparing two integers - the number of sold cars of the firstEmployee
     * and the number of sold cars of the secondEmployee using compare method of Integer.
     * @see "compare() of Integer"
     */
    @Override
    public int compare(T firstEmployee, T secondEmployee){
        return Integer.compare(firstEmployee.getSoldCars(),secondEmployee.getSoldCars());
    }
}
