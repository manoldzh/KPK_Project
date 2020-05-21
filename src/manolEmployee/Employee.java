package manolEmployee;

import manolCar.Car;
import manolClient.Client;
/** Represents an Employee.
 * @author Manol Dzhambazov
 * @version 1.0
 * @since 31.05.2020
 */
public abstract class Employee {
    private String name;
    private String surname;
    private int salary;
    private int soldCars;
    /**
     * Default constructor for class Employee.
     */
    public Employee() {
        name = "default";
        surname = "default";
        salary = 0;
        soldCars = 0;
    }
    /**
     * Constructor for class Employee with only three parameter.
     * @param name This is the name of an Employee.
     * @param surname This is the surname of an Employee.
     * @param salary This is the salary of an Employee.
     */
    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        soldCars = 0;
    }
    /**
     * This method is used to get the salary of an Employee.
     * @return int This is the salary of an Employee.
     */
    public int getSalary(){
        return salary;
    }
    /**
     * This method is used to get the number of sold cars of an Employee.
     * @return int This is the number of sold cars of an Employee.
     */
    public int getSoldCars(){
        return soldCars;
    }
    /**
     * This method is used to override the toString method of an
     * Object and presents the Employee as a string which contains
     * the name, space, the surname.
     * @return String This returns Employee represented as a String.
     * @see "toString method of class Object."
     */
    @Override public String toString(){
        return name + " " + surname;
    }

    /**
     * This methos is used to sell a car to a client. It increase the number of sold cars by one.
     * @param car This is the car which will be sold.
     * @param client This is the client which will buy the car.
     */
    public void sellCar(Car car, Client client) {
        System.out.println(toString() + " sold " + car.toString() + " to " + client.toString() + " for " + client.calculatePriceForCar(car) +
                " and get commission " + calculateCommission(car, client));
        soldCars ++;
    }

    abstract public double calculateCommission(Car car, Client client);
    abstract public double calculateAddedPercents();
    /**
     * This method is used to check whether two Employees are equal.
     * It overrides the equals method of Object and returns true only if
     * two Employees have same name and surname.
     * @param c This is the object with which we check whether this is equal.
     * @return boolean This returns whether the two Employees are equal.
     * @see "equals methos in the class Object."
     */
    @Override
    public boolean equals(Object c){
        if(c==null){
            return false;
        }
        if(c == this){
            return true;
        }
        if(c.getClass() != this.getClass()) {
            return false;
        }
        if(((Employee)c).toString().equals(this.toString()) ) {
            return true;
        }
        return false;
    }
}
