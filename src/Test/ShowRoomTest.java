package Test;

import manolCar.Audi;
import manolCar.BMW;
import manolCar.Car;
import manolClient.Client;
import manolClient.NewClient;
import manolClient.NormalClient;
import manolClient.VIPClient;
import manolEmployee.Employee;
import manolEmployee.JuniorSalesManager;
import manolEmployee.SeniorSalesAssistant;
import manolShowRoom.ShowRoom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShowRoomTest {
    @Test
    public void testGetNumberOfCars(){
        ShowRoom showRoom = new ShowRoom();
        Car car = new BMW();
        Car car2 = new Audi();
        showRoom.addCar(car);
        showRoom.addCar(car2);
        Assertions.assertEquals(2,showRoom.getNumberOfCars());
    }
    @Test
    public void testGetNumberOfClients(){
        ShowRoom showRoom = new ShowRoom();
        showRoom.addClient(new NewClient("ivan","ivanov"));
        showRoom.addClient(new VIPClient("georgi","georgiev"));
        showRoom.addClient(new NormalClient("ivan","georgiev"));
        Assertions.assertEquals(3,showRoom.getNumberOfClients());
    }
    @Test
    public void testGetNumberOfEmployees(){
        ShowRoom showRoom = new ShowRoom();
        showRoom.addEmployee(new SeniorSalesAssistant());
        showRoom.addEmployee(new JuniorSalesManager());
        Assertions.assertEquals(2,showRoom.getNumberOfEmployees());
    }
    @Test
    public void testGetTheAmountOfAllCommissionsWhenItIsZero(){
        ShowRoom showRoom = new ShowRoom();
        Employee employee1 = new JuniorSalesManager();
        Employee employee2 = new SeniorSalesAssistant();
        showRoom.addEmployee(employee1);
        showRoom.addEmployee(employee2);
        Assertions.assertEquals(0,showRoom.getAmountOfAllCommissions());
    }
    @Test
    public void testGetTheAmountOfAllCommissions(){
        ShowRoom showRoom = new ShowRoom();
        Employee employee1 = new JuniorSalesManager();
        Employee employee2 = new SeniorSalesAssistant();
        showRoom.addEmployee(employee1);
        showRoom.addEmployee(employee2);
        Car car1 = new BMW("m5",10000,"123",true);
        Car car2 = new Audi("a3",20000,"1234",false);
        showRoom.addCar(car1);
        showRoom.addCar(car2);
        Client client1 = new VIPClient("ivan","ivanov");
        showRoom.addClient(client1);
        showRoom.sellCarToClient(employee1,car1,client1);
        showRoom.sellCarToClient(employee2,car2,client1);
        Assertions.assertEquals(228.43333333333334,showRoom.getAmountOfAllCommissions());
    }
    @Test
    public void testGetClientByIndex(){
        ShowRoom showRoom = new ShowRoom();
        
    }

}
