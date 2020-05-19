package manolShowRoom;

import manolCar.Car;
import manolCar.ComparatorOfCarsByBrand;
import manolCar.ComparatorOfCarsByPrice;
import manolClient.Client;
import manolClient.ComparatorOfClientsByPoints;
import manolEmployee.ComparatorOfEmployeesByName;
import manolEmployee.ComparatorOfEmployeesBySoldCars;
import manolEmployee.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShowRoom {
    private List<Client> clients;
    private List<Car> cars;
    private List<Employee> employees;
    public ShowRoom(){
        clients = new ArrayList<Client>();
        cars = new ArrayList<Car>();
        employees = new ArrayList<Employee>();
    }
    public int getNumberOfCars(){
        return cars.size();
    }
    public int getNumberOfClients(){
        return clients.size();
    }
    public int getNumberOfEmployees(){
        return employees.size();
    }
    public boolean addClient(Client client){
        if(!clients.contains(client)) {
            clients.add(client);
            return true;
        }
        return false;
    }
    public boolean addCar(Car car){
        if(!cars.contains(car)){
            cars.add(car);
            return true;
        }
        return false;
    }
    public boolean addEmployee(Employee employee){
        if(!employees.contains(employee)) {
            employees.add(employee);
            return true;
        }
        return false;
    }
    public boolean removeClient(Client client){
        int indexOfClient = clients.indexOf(client);
        if(indexOfClient != -1){
            clients.remove(indexOfClient);
            return true;
        }
        return  false;
    }
    public boolean removeCar(Car car){
        int indexOfCar = cars.indexOf(car);
        if(indexOfCar != -1){
            cars.remove(indexOfCar);
            return true;
        }
        return false;
    }
    public boolean removeEmployee(Employee employee){
        int indexOfEmployee = employees.indexOf(employee);
        if(indexOfEmployee != -1){
            employees.remove(indexOfEmployee);
            return true;
        }
        return false;
    }
    public void sortClientsByPoint(){
        ComparatorOfClientsByPoints comparator = new ComparatorOfClientsByPoints();
        Collections.sort(clients,comparator);
    }
    public void sortClientsAlphabetacally(){
        Collections.sort(clients);
    }
    public void sortCarsByBrand(){
        ComparatorOfCarsByBrand comparator = new ComparatorOfCarsByBrand();
        Collections.sort(cars,comparator);
    }
    public void sortCarsByPrice(){
        ComparatorOfCarsByPrice comparator = new ComparatorOfCarsByPrice();
        Collections.sort(cars,comparator);
    }
    public void sortEmployeesByName(){
        ComparatorOfEmployeesByName comparator = new ComparatorOfEmployeesByName();
        Collections.sort(employees,comparator);
    }
    public void sortEmployeesBySoldCars(){
        ComparatorOfEmployeesBySoldCars comparator = new ComparatorOfEmployeesBySoldCars();
        Collections.sort(employees,comparator);
    }


    public Client getClientByIndex(int index){
        Client returnedClient;
        try{
            returnedClient = clients.get(index);
        }catch (IndexOutOfBoundsException e){
            returnedClient = null;
        }
        return  returnedClient;
    }
    public Car getCarByIndex(int index){
        Car returnedCar;
        try{
            returnedCar = cars.get(index);
        }catch (IndexOutOfBoundsException e){
            returnedCar = null;
        }
        return returnedCar;
    }
    public Employee getEmlpoyeeByIndex(int index){
        Employee returnedEmployee;
        try{
            returnedEmployee = employees.get(index);
        }catch (IndexOutOfBoundsException e){
            returnedEmployee = null;
        }
        return  returnedEmployee;
    }

    public boolean sellCarToClient(Car car, Client client){
        if(!cars.contains(car) || clients.contains(client)){
            return false;
        }
        client.buyCar(car);

    }
}
