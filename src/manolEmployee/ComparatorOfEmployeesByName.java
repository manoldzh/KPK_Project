package manolEmployee;

import java.util.Comparator;

public class ComparatorOfEmployeesByName implements Comparator<Employee> {
    @Override
    public int compare(Employee firstEmployee, Employee secondEmployee){
        return firstEmployee.toString().compareTo(secondEmployee.toString());
    }
}
