package manolEmployee;

import java.util.Comparator;

public class ComparatorOfEmployeesByName <T extends Employee>implements Comparator<T> {
    @Override
    public int compare(T firstEmployee, T secondEmployee){
        return firstEmployee.toString().compareTo(secondEmployee.toString());
    }
}
