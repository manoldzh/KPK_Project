package manolEmployee;

import manolCar.Car;
import manolClient.Client;

public abstract class Employee {
    private String name;
    private String surname;
    private int salary;
    private int soldCars;
    public Employee() {
        name = "default";
        surname = "default";
        salary = 0;
        soldCars = 0;
    }

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        soldCars = 0;
    }
    public int getSoldCars(){
        return soldCars;
    }
    @Override public String toString(){
        return name + " " + surname;
    }
    public void sellCar(Car car, Client client) {
        System.out.println(toString() + " sold " + car.toString() + " to " + client.toString() + " for " + client.calculatePriceForCar(car) +
                " and get commission " + calculateCommission(car, client));
        soldCars ++;
    }

    abstract public double calculateCommission(Car car, Client client);
}
