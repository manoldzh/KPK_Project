package manolEmployee;

import java.util.Comparator;
/** Represents a Comparator of Employee which compare by Name.
 * @author Manol Dzhambazov
 * @version 1.0
 * @since 31.05.2020
 */
public class ComparatorOfEmployeesByName <T extends Employee>implements Comparator<T> {
    /**
     * This method is used to compare two employees by name.
     * @param firstEmployee This is the first Employee.
     * @param secondEmployee  This is the second Employee.
     * @return int This returns the result of comparing two Strings - the String which is returned by
     * toString method of firstEmployee and the String which returns the toString method of secondClient.
     * @see "toString() of String"
     */
    @Override
    public int compare(T firstEmployee, T secondEmployee){
        return firstEmployee.toString().compareTo(secondEmployee.toString());
    }
}
