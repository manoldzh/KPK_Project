package manolShowRoom;

import manolCar.Car;
import manolCar.ComparatorOfCarsByBrand;
import manolCar.ComparatorOfCarsByPrice;
import manolClient.Client;
import manolClient.ComparatorOfClientsByPoints;
import manolEmployee.ComparatorOfEmployeesByName;
import manolEmployee.ComparatorOfEmployeesBySoldCars;
import manolEmployee.Employee;

import java.util.*;

public class ShowRoom {
    private List<Client> clients;
    private List<Car> cars;
    private List<Employee> employees;
    private Map<Employee,Double> commissions;
    private Map<Car,Boolean> availabilityOfCars;
    public ShowRoom(){
        clients = new ArrayList<Client>();
        cars = new ArrayList<Car>();
        employees = new ArrayList<Employee>();
        commissions = new HashMap<Employee,Double>();
        availabilityOfCars = new HashMap<Car, Boolean>();
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
    public double getAmountOfAllCommissions(){
        double sumOfAllCommissions = 0;
        Iterator iterator = commissions.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry)iterator.next();
            sumOfAllCommissions = sumOfAllCommissions + (double)pair.getValue();
        }
        return sumOfAllCommissions;
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
    public double getEmployeeCommission(Employee employee){
        if(!employees.contains(employee)){
            return -1;
        }
        return commissions.get(employee);
    }
    public ArrayList<Car> getAllAvailableCarsForDriving(){
        ArrayList<Car> availableCars = new ArrayList<>();
        Iterator iterator = availabilityOfCars.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry)iterator.next();
            if((boolean)pair.getValue()) {
                availableCars.add((Car)pair.getKey());
            }
        }
        return availableCars;
    }
    public int getNumberOfAllAvailableCarsForDriving(){
        return getAllAvailableCarsForDriving().size();
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
            availabilityOfCars.put(car,true);
            cars.add(car);
            return true;
        }
        return false;
    }
    public boolean addEmployee(Employee employee){
        if(!employees.contains(employee)) {
            employees.add(employee);
            commissions.put(employee,0.0);
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
            availabilityOfCars.remove(car);
            return true;
        }
        return false;
    }
    public boolean removeEmployee(Employee employee){
        int indexOfEmployee = employees.indexOf(employee);
        if(indexOfEmployee != -1){
            employees.remove(indexOfEmployee);
            commissions.remove(employee);
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



    public boolean sellCarToClient(Employee employee,Car car, Client client){
        if(!cars.contains(car) || !clients.contains(client) || !employees.contains(employee)){
            return false;
        }
        employee.sellCar(car,client);
        double commissionUntilNow = commissions.get(employee);
        double addedCommission = employee.calculateCommission(car, client);
        commissions.replace(employee,commissionUntilNow + addedCommission);
        client.buyCar(car);
        removeCar(car);
        return true;
    }
    public boolean giveCarToClientToDrive(Car car, Client client){
        if(!cars.contains(car) || !clients.contains(client)){
            return false;
        }
        client.drive(car);
        availabilityOfCars.replace(car, false);
        return true;
    }
    public boolean returnCarFromClient(Car car, Client client){
        if(!cars.contains(car) || !clients.contains(client)){
            return false;
        }
        availabilityOfCars.replace(car,true);
        return true;
    }


    public double payCommissionOfEmployee(Employee employee){
        double commission = commissions.get(employee);
        commissions.replace(employee,0.0);
        return commission;
    }
    public double payAllCommisions(){
        double sumOfCommissions = 0;
        Iterator iterator = commissions.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry)iterator.next();
            sumOfCommissions += payCommissionOfEmployee((Employee) pair.getKey());
        }
        return sumOfCommissions;
    }

}
