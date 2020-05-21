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
/** Represents a ShowRoom.
 * @author Manol Dzhambazov
 * @version 1.0
 * @since 31.05.2020
 */
public class ShowRoom {
    private List<Client> clients;
    private List<Car> cars;
    private List<Employee> employees;
    private Map<Employee,Double> commissions;
    private Map<Car,Boolean> availabilityOfCars;
    /**
     * Default constructor for class ShowRoom.
     */
    public ShowRoom(){
        clients = new ArrayList<Client>();
        cars = new ArrayList<Car>();
        employees = new ArrayList<Employee>();
        commissions = new HashMap<Employee,Double>();
        availabilityOfCars = new HashMap<Car, Boolean>();
    }
    /**
     * This method is used to get the numbers of cars in ShowRoom.
     * @return int This is the number of cars in ShowRoom.
     */
    public int getNumberOfCars(){
        return cars.size();
    }
    /**
     * This method is used to get the numbers of clients in ShowRoom.
     * @return int This is the number of client in ShowRoom.
     */
    public int getNumberOfClients(){
        return clients.size();
    }
    /**
     * This method is used to get the numbers of employees in ShowRoom.
     * @return int This is the number of employees in ShowRoom.
     */
    public int getNumberOfEmployees(){
        return employees.size();
    }
    /**
     * This method is used to get the value of all commissions which are not paid in ShowRoom.
     * @return int This is the value of all commissions in ShowRoom.
     */
    public double getAmountOfAllCommissions(){
        double sumOfAllCommissions = 0;
        Iterator iterator = commissions.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry)iterator.next();
            sumOfAllCommissions = sumOfAllCommissions + (double)pair.getValue();
        }
        return sumOfAllCommissions;
    }
    /**
     * This method is used to get the a client in ShowRoom by index.
     * @param index This is the index of a client.
     * @return Client This is the client if index is not out of bound otherwise it is null.
     */
    public Client getClientByIndex(int index){
        Client returnedClient;
        try{
            returnedClient = clients.get(index);
        }catch (IndexOutOfBoundsException e){
            returnedClient = null;
        }
        return  returnedClient;
    }
    /**
     * This method is used to get the a car in ShowRoom by index.
     * @param index This is the index of a car.
     * @return Car This is the car if index is not out of bound otherwise it is null.
     */
    public Car getCarByIndex(int index){
        Car returnedCar;
        try{
            returnedCar = cars.get(index);
        }catch (IndexOutOfBoundsException e){
            returnedCar = null;
        }
        return returnedCar;
    }
    /**
     * This method is used to get the an employee in ShowRoom by index.
     * @param index This is the index of an employee.
     * @return Employee This is the employee if index is not out of bound otherwise it is null.
     */
    public Employee getEmlpoyeeByIndex(int index){
        Employee returnedEmployee;
        try{
            returnedEmployee = employees.get(index);
        }catch (IndexOutOfBoundsException e){
            returnedEmployee = null;
        }
        return  returnedEmployee;
    }

    /**
     * This method is used to get the commission which an employee has maken.
     * @param employee This is the employee of which we get the commission.
     * @return double The value of the commission of the employee.
     */
    public double getEmployeeCommission(Employee employee){
        if(!employees.contains(employee)){
            return -1;
        }
        return commissions.get(employee);
    }

    /**
     * This method is used to get all available cars now in a ShowRoom.
     * @return ArrayList<Car> This is a list of all available cars.
     */
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
    /**
     * This method is used to get the number of all available cars now in a ShowRoom.
     * @return ArrayList<Car> This is the number of all available cars.
     */
    public int getNumberOfAllAvailableCarsForDriving(){
        return getAllAvailableCarsForDriving().size();
    }


    /**
     * This method is used to add new Client in the Showroom if it does not exist already.
     * @param client This is the Client which we try to add.
     * @return boolean This is true if the add is successful and false otherwise
     */
    public boolean addClient(Client client){
        if(!clients.contains(client)) {
            clients.add(client);
            return true;
        }
        return false;
    }
    /**
     * This method is used to add new Car in the Showroom if it does not exist already.
     * @param car This is the Car which we try to add.
     * @return boolean This is true if the add is successful and false otherwise
     */
    public boolean addCar(Car car){
        if(!cars.contains(car)){
            availabilityOfCars.put(car,true);
            cars.add(car);
            return true;
        }
        return false;
    }
    /**
     * This method is used to add new Employee in the Showroom if it does not exist already.
     * @param employee This is the Employee which we try to add.
     * @return boolean This is true if the add is successful and false otherwise
     */
    public boolean addEmployee(Employee employee){
        if(!employees.contains(employee)) {
            employees.add(employee);
            commissions.put(employee,0.0);
            return true;
        }
        return false;
    }

    /**
     * This method is used to remove a Client from the ShowRoom if it exists in it.
     * @param client This is the Client which we try to remove.
     * @return boolean This is true if the remove is successful and false otherwise
     */
    public boolean removeClient(Client client){
        int indexOfClient = clients.indexOf(client);
        if(indexOfClient != -1){
            clients.remove(indexOfClient);
            return true;
        }
        return  false;
    }
    /**
     * This method is used to remove a Car from the ShowRoom if it exists in it.
     * @param car This is the Car which we try to remove.
     * @return boolean This is true if the remove is successful and false otherwise
     */
    public boolean removeCar(Car car){
        int indexOfCar = cars.indexOf(car);
        if(indexOfCar != -1){
            cars.remove(indexOfCar);
            availabilityOfCars.remove(car);
            return true;
        }
        return false;
    }
    /**
     * This method is used to remove an Employee from the ShowRoom if it exists in it.
     * @param employee This is the Employee which we try to remove.
     * @return boolean This is true if the remove is successful and false otherwise
     */
    public boolean removeEmployee(Employee employee){
        int indexOfEmployee = employees.indexOf(employee);
        if(indexOfEmployee != -1){
            employees.remove(indexOfEmployee);
            commissions.remove(employee);
            return true;
        }
        return false;
    }

    /**
     * This method is used to sort the clients by points.
     */
    public void sortClientsByPoint(){
        ComparatorOfClientsByPoints comparator = new ComparatorOfClientsByPoints();
        Collections.sort(clients,comparator);
    }
    /**
     * This method is used to sort the clients by alphabetically.
     */
    public void sortClientsAlphabetically(){
        Collections.sort(clients);
    }
    /**
     * This method is used to sort the cars by brand.
     */
    public void sortCarsByBrand(){
        ComparatorOfCarsByBrand comparator = new ComparatorOfCarsByBrand();
        Collections.sort(cars,comparator);
    }
    /**
     * This method is used to sort the cars by price.
     */
    public void sortCarsByPrice(){
        ComparatorOfCarsByPrice comparator = new ComparatorOfCarsByPrice();
        Collections.sort(cars,comparator);
    }
    /**
     * This method is used to sort the employees by name.
     */
    public void sortEmployeesByName(){
        ComparatorOfEmployeesByName comparator = new ComparatorOfEmployeesByName();
        Collections.sort(employees,comparator);
    }
    /**
     * This method is used to sort the employees by the number of sold cars.
     */
    public void sortEmployeesBySoldCars(){
        ComparatorOfEmployeesBySoldCars comparator = new ComparatorOfEmployeesBySoldCars();
        Collections.sort(employees,comparator);
    }


    /**
     * This method is used to sell a car to a client by an employee if all three exists in the ShowRoom. It also
     * adds commission the the commission of the employee, and remove the car from the cars in ShowRoom and call the
     * buyCar() method of the client
     * @param employee This is the employee which sells the car.
     * @param car This is the car which will be sold.
     * @param client This is the client which will buy the car.
     * @return boolean This is true if the sale is successful and false otherwise.
     */
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

    /**
     * This is a method used to give a car to a client to drive it if both exist in the ShowRoom. It also makes this
     * car unavailable for driving.
     * @param car This is the car which will be given.
     * @param client This is the client which will drive the car.
     * @return boolean This is true if the giving is successful and false otherwise.
     */
    public boolean giveCarToClientToDrive(Car car, Client client){
        if(!cars.contains(car) || !clients.contains(client)){
            return false;
        }
        client.drive(car);
        availabilityOfCars.replace(car, false);
        return true;
    }

    /**
     * This is a method used when a client return a car to the ShowRoom and both client and the car should exist
     * in the ShowRoom. It also makes the car available for driving.
     * @param car This is the car which is returned.
     * @param client This is the client which return it.
     * @return boolean This is true if the return is successful and false otherwise.
     */
    public boolean returnCarFromClient(Car car, Client client){
        if(!cars.contains(car) || !clients.contains(client)){
            return false;
        }
        availabilityOfCars.replace(car,true);
        return true;
    }

    /**
     * This method is used to pay the commission of an Employee. It makes the commission of this employee zero after it
     * is executed.
     * @param employee This is the employee which will get its commission.
     * @return double This is -1 if the employee does not exist and the value of its commission otherwise.
     */
    public double payCommissionOfEmployee(Employee employee){
        if(!employees.contains(employee)){
            return -1;
        }
        double commission = commissions.get(employee);
        commissions.replace(employee,0.0);
        return commission;
    }
    /**
     * This method is used to pay all the commission of the employees. It makes all the commission of the employees zero
     * after it is executed.
     * @return double This is the value of all commissions.
     */
    public double payAllCommisions(){
        double sumOfCommissions = 0;
        Iterator iterator = commissions.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry)iterator.next();
            sumOfCommissions += payCommissionOfEmployee((Employee) pair.getKey());
        }
        return sumOfCommissions;
    }

    /**
     * This method is used to get the value of all salaries of the employees.
     * @return int This is the value of all salaries of the employees.
     */
    public int getValueOfAllSalaries(){
        int sumOfSalaries = 0;
        for(int i =0; i<employees.size();i++){
            sumOfSalaries+=employees.get(i).getSalary();
        }
        return  sumOfSalaries;
    }

    /**
     * This method is used to get the value of all commissions of the employees.
     * @return double This is the value of all commissions.
     */
    public double getValueOfAllCommissions(){
        double sumOfCommissions = 0;
        Iterator iterator = commissions.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry)iterator.next();
            sumOfCommissions += commissions.get((Employee) pair.getKey());
        }
        return sumOfCommissions;
    }

}
