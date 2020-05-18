package manolEmployee;

import java.util.Comparator;

public class ComparatorOfEmployeesBySoldCars<T extends Employee> implements Comparator<T> {
    @Override
    public int compare(T firstEmployee, T secondEmployee){
        return Integer.compare(firstEmployee.getSoldCars(),secondEmployee.getSoldCars());
    }
}
