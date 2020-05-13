package manolEmployee;

import java.util.Comparator;

public class ComparatorOfEmployeesBySoldCars implements Comparator<Employee> {
    @Override
    public int compare(Employee firstEmployee, Employee secondEmployee){
        return Integer.compare(firstEmployee.getSoldCars(),secondEmployee.getSoldCars());
    }
}
