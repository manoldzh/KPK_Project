package manolShowRoom;

import manolCar.Car;
import manolClient.Client;
import manolEmployee.Employee;

import java.util.ArrayList;
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
    public void addClient(Client client){
        clients.add(client);
    }
    public void addCar(Car car){
        cars.add(car);
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void removeClient(Client client){

    }
}
