package Test;

import manolCar.Audi;
import manolCar.BMW;
import manolCar.Car;
import manolCar.Mercedes;
import manolClient.Client;
import manolClient.NewClient;
import manolClient.NormalClient;
import manolClient.VIPClient;
import manolEmployee.Employee;
import manolEmployee.JuniorSalesManager;
import manolEmployee.SeniorSalesAssistant;
import manolEmployee.SeniorSalesManager;
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
    public void testGetClientByIndexWhenItExists(){
        ShowRoom showRoom = new ShowRoom();
        Client client1 = new NormalClient("ivan","ivanov");
        Client client2 = new VIPClient("georgi","georgiev");
        showRoom.addClient(client1);
        showRoom.addClient(client2);
        Client indexedClient = showRoom.getClientByIndex(1);
        Assertions.assertEquals("georgi georgiev",indexedClient.toString());
    }
    @Test
    public void testGetClientByIndexWhenItNotExists(){
        ShowRoom showRoom = new ShowRoom();
        Client client1 = new NormalClient("ivan","ivanov");
        Client client2 = new VIPClient("georgi","georgiev");
        showRoom.addClient(client1);
        showRoom.addClient(client2);
        Client indexedClient = showRoom.getClientByIndex(2);
        Assertions.assertEquals(null,indexedClient);
    }
    @Test
    public void testGetCarByIndexWhenItExists(){
        ShowRoom showRoom = new ShowRoom();
        Car car1 = new Audi();
        Car car2 = new Mercedes();
        showRoom.addCar(car1);
        showRoom.addCar(car2);
        Car indexedCar = showRoom.getCarByIndex(0);
        Assertions.assertEquals(car1,indexedCar);
    }
    @Test
    public void testGetCarByIndexWhenItNotExists(){
        ShowRoom showRoom = new ShowRoom();
        Car car1 = new Audi();
        Car car2 = new Mercedes();
        showRoom.addCar(car1);
        showRoom.addCar(car2);
        Car indexedCar = showRoom.getCarByIndex(5);
        Assertions.assertEquals(null,indexedCar);
    }
    @Test
    public void testGetEmployeeByIndexWhenItExists(){
        ShowRoom showRoom = new ShowRoom();
        Employee employee1 = new JuniorSalesManager("ivan", "ivanov",200);
        Employee employee2 = new SeniorSalesAssistant("georgi","georgiev",300);
        showRoom.addEmployee(employee1);
        showRoom.addEmployee(employee2);
        Employee indexedEmployee = showRoom.getEmlpoyeeByIndex(1);
        Assertions.assertEquals(employee2,indexedEmployee);
    }
    @Test
    public void testGetEmployeeByIndexWhenItNotExists(){
        ShowRoom showRoom = new ShowRoom();
        Employee employee1 = new JuniorSalesManager("ivan", "ivanov",200);
        Employee employee2 = new SeniorSalesAssistant("georgi","georgiev",300);
        showRoom.addEmployee(employee1);
        showRoom.addEmployee(employee2);
        Employee indexedEmployee = showRoom.getEmlpoyeeByIndex(-1);
        Assertions.assertEquals(null,indexedEmployee);
    }
    @Test
    public void testGetEmployeeCommissionWhenItIsNotZero(){
        ShowRoom showRoom = new ShowRoom();
        Employee employee1 = new JuniorSalesManager();
        showRoom.addEmployee(employee1);
        Car car1 = new BMW("m5",10000,"123",true);
        Car car2 = new Audi("a3",20000,"1234",false);
        showRoom.addCar(car1);
        showRoom.addCar(car2);
        Client client1 = new VIPClient("ivan","ivanov");
        showRoom.addClient(client1);
        showRoom.sellCarToClient(employee1,car1,client1);
        showRoom.sellCarToClient(employee1,car2,client1);
        Assertions.assertEquals(296.6666666666667,showRoom.getEmployeeCommission(employee1));
    }
    @Test
    public void testGetEmployeeCommissionWhenEmployeeNotExists(){
        ShowRoom showRoom = new ShowRoom();
        Employee employee1 = new JuniorSalesManager();
        Employee employee2 = new SeniorSalesAssistant();
        showRoom.addEmployee(employee1);
        Car car1 = new BMW("m5",10000,"123",true);
        Car car2 = new Audi("a3",20000,"1234",false);
        showRoom.addCar(car1);
        showRoom.addCar(car2);
        Client client1 = new VIPClient("ivan","ivanov");
        showRoom.addClient(client1);
        showRoom.sellCarToClient(employee1,car1,client1);
        showRoom.sellCarToClient(employee1,car2,client1);
        Assertions.assertEquals(-1,showRoom.getEmployeeCommission(employee2));
    }
    @Test
    public void testGetEmployeeCommissionWhenItIsZero(){
        ShowRoom showRoom = new ShowRoom();
        Employee employee1 = new JuniorSalesManager();
        showRoom.addEmployee(employee1);
        Assertions.assertEquals(0,showRoom.getEmployeeCommission(employee1));
    }

    @Test
    public void testGetAllAvailableCars(){
            ShowRoom showRoom = new ShowRoom();
            Car car1 = new BMW("m5",10000,"123",true);
            Car car2 = new Audi("a3",20000,"1234",false);
            showRoom.addCar(car1);
            showRoom.addCar(car2);
            Client client1 = new VIPClient("ivan","ivanov");
            showRoom.addClient(client1);
            showRoom.giveCarToClientToDrive(car1,client1);
            Assertions.assertEquals(1,showRoom.getAllAvailableCarsForDriving().size());
    }
    @Test
    public void testGetNumberOfAllAvailableCars(){
        ShowRoom showRoom = new ShowRoom();
        Car car1 = new BMW("m5",10000,"123",true);
        Car car2 = new Audi("a3",20000,"1234",false);
        Car car3 = new Mercedes("e220", 20000, "12", true);
        showRoom.addCar(car1);
        showRoom.addCar(car2);
        showRoom.addCar(car3);
        Client client1 = new VIPClient("ivan","ivanov");
        showRoom.addClient(client1);
        showRoom.giveCarToClientToDrive(car1,client1);
        Assertions.assertEquals(2,showRoom.getNumberOfAllAvailableCarsForDriving());
    }
    @Test
    public void testSortClientsByPoints(){
        ShowRoom showRoom = new ShowRoom();
        Client client1 = new VIPClient("ivan", "ivanov");
        Client client2 = new NormalClient("georgi", "georgiev");
        showRoom.addClient(client1);
        showRoom.addClient(client2);
        showRoom.sortClientsByPoint();
        Assertions.assertEquals("ivan ivanov", showRoom.getClientByIndex(1).toString());
    }
    @Test
    public void testSortClientsAlphabetically(){
        ShowRoom showRoom = new ShowRoom();
        Client client1 = new VIPClient("ivan", "ivanov");
        Client client2 = new NormalClient("georgi", "georgiev");
        showRoom.addClient(client1);
        showRoom.addClient(client2);
        showRoom.sortClientsAlphabetacally();
        Assertions.assertEquals("ivan ivanov", showRoom.getClientByIndex(1).toString());
    }
    @Test
    public void testSortCarsByBrand(){
        ShowRoom showRoom = new ShowRoom();
        Car car1 = new BMW();
        Car car2 = new Audi();
        Car car3 = new Mercedes();
        showRoom.addCar(car1);
        showRoom.addCar(car2);
        showRoom.addCar(car3);
        showRoom.sortCarsByBrand();
        Assertions.assertEquals("Audi",showRoom.getCarByIndex(0).getBrand());
    }
    @Test
    public void testSortCarsByPrice(){
        ShowRoom showRoom = new ShowRoom();
        Car car1 = new BMW("m5",10000,"123",true);
        Car car2 = new Audi("a2", 8000, "12", false);
        Car car3 = new Mercedes("e220", 5000, "1", true);
        showRoom.addCar(car1);
        showRoom.addCar(car2);
        showRoom.addCar(car3);
        showRoom.sortCarsByPrice();
        Assertions.assertEquals("Audi",showRoom.getCarByIndex(1).getBrand());
    }
    @Test
    public void testSortEmployeesByName(){
        ShowRoom showRoom = new ShowRoom();
        Employee employee1 = new SeniorSalesAssistant("ivan","ivanov",200);
        Employee employee2 = new JuniorSalesManager("georgi", "georgiev",500);
        showRoom.addEmployee(employee1);
        showRoom.addEmployee(employee2);
        showRoom.sortEmployeesByName();
        Assertions.assertEquals("georgi georgiev",showRoom.getEmlpoyeeByIndex(0).toString());
    }
    @Test
    public void testSortEmployeesBySoldCars(){
        ShowRoom showRoom = new ShowRoom();
        Employee employee1 = new SeniorSalesAssistant("ivan","ivanov",200);
        Employee employee2 = new JuniorSalesManager("georgi", "georgiev",500);
        Client client1 = new VIPClient("ivan", "ivanov");
        Client client2 = new NormalClient("georgi", "georgiev");
        Car car1 = new BMW("m5",10000,"123",true);
        Car car2 = new Audi("a2", 8000, "12", false);
        Car car3 = new Mercedes("e220", 5000, "1", true);
        showRoom.addCar(car1);
        showRoom.addCar(car2);
        showRoom.addCar(car3);
        showRoom.addClient(client1);
        showRoom.addClient(client2);
        showRoom.addEmployee(employee1);
        showRoom.addEmployee(employee2);
        showRoom.sellCarToClient(employee1,car1,client1);
        showRoom.sellCarToClient(employee1,car2,client2);
        showRoom.sellCarToClient(employee2,car3,client1);
        showRoom.sortEmployeesBySoldCars();
        Assertions.assertEquals("georgi georgiev",showRoom.getEmlpoyeeByIndex(0).toString());
    }

    @Test
    public void testSellCarToClientWhenEmployeeIsNotAdded(){
        ShowRoom showRoom = new ShowRoom();
        Client client = new VIPClient("ivan","ivanov");
        Car car = new BMW();
        Employee employee = new SeniorSalesAssistant("ivan", "ivanov",200);
        showRoom.addClient(client);
        showRoom.addCar(car);
        Assertions.assertEquals(false,showRoom.sellCarToClient(employee,car,client));
    }
    @Test
    public void testSellCarToClient(){
        ShowRoom showRoom = new ShowRoom();
        Client client = new VIPClient("ivan","ivanov");
        Car car = new BMW();
        Employee employee = new SeniorSalesAssistant("ivan", "ivanov",200);
        showRoom.addClient(client);
        showRoom.addCar(car);
        showRoom.addEmployee(employee);
        Assertions.assertEquals(true,showRoom.sellCarToClient(employee,car,client));
    }
    @Test
    public void testReturnCarFromClient(){
        ShowRoom showRoom = new ShowRoom();
        Client client = new VIPClient("ivan","ivanov");
        Car car = new BMW();
        showRoom.addCar(car);
        showRoom.addClient(client);
        showRoom.giveCarToClientToDrive(car,client);
        showRoom.returnCarFromClient(car,client);
        Assertions.assertEquals(1,showRoom.getNumberOfAllAvailableCarsForDriving());
    }
    @Test
    public void testPayCommissionOfEmployeeTheAmountOfCommission(){
        ShowRoom showRoom = new ShowRoom();
        Client client = new VIPClient("ivan","ivanov");
        Car car1 = new BMW("m5",10000,"12",true);
        Car car2 = new Audi("a5",20000,"123",false);
        Employee employee = new SeniorSalesManager("ivan", "ivanov", 200);
        showRoom.addCar(car1);
        showRoom.addCar(car2);
        showRoom.addClient(client);
        showRoom.addEmployee(employee);
        showRoom.sellCarToClient(employee,car1,client);
        showRoom.sellCarToClient(employee,car2,client);
        Assertions.assertEquals(445,showRoom.payCommissionOfEmployee(employee));
    }
    @Test
    public void testPayCommissionOfEmployeeProcess(){
        ShowRoom showRoom = new ShowRoom();
        Client client = new VIPClient("ivan","ivanov");
        Car car1 = new BMW("m5",10000,"12",true);
        Car car2 = new Audi("a5",20000,"123",false);
        Employee employee = new SeniorSalesManager("ivan", "ivanov", 200);
        showRoom.addCar(car1);
        showRoom.addCar(car2);
        showRoom.addClient(client);
        showRoom.addEmployee(employee);
        showRoom.sellCarToClient(employee,car1,client);
        showRoom.sellCarToClient(employee,car2,client);
        showRoom.payCommissionOfEmployee(employee);
        Assertions.assertEquals(0,showRoom.getEmployeeCommission(employee));
    }
    @Test
    public void testPayAllCommissions(){
        ShowRoom showRoom = new ShowRoom();
        Client client = new VIPClient("ivan","ivanov");
        Car car1 = new BMW("m5",10000,"12",true);
        Car car2 = new Audi("a5",20000,"123",false);
        Employee employee1 = new SeniorSalesManager("ivan", "ivanov", 200);
        Employee employee2 = new JuniorSalesManager("georgi", "georgiev",100);
        showRoom.addCar(car1);
        showRoom.addCar(car2);
        showRoom.addClient(client);
        showRoom.addEmployee(employee1);
        showRoom.addEmployee(employee2);
        showRoom.sellCarToClient(employee1,car1,client);
        showRoom.sellCarToClient(employee2,car2,client);
        showRoom.payAllCommisions();
        Assertions.assertEquals(0,showRoom.getEmployeeCommission(employee1));
    }
    @Test
    public void testPayAllCommissionsSecond(){
        ShowRoom showRoom = new ShowRoom();
        Client client = new VIPClient("ivan","ivanov");
        Car car1 = new BMW("m5",10000,"12",true);
        Car car2 = new Audi("a5",20000,"123",false);
        Employee employee1 = new SeniorSalesManager("ivan", "ivanov", 200);
        Employee employee2 = new JuniorSalesManager("georgi", "georgiev",100);
        showRoom.addCar(car1);
        showRoom.addCar(car2);
        showRoom.addClient(client);
        showRoom.addEmployee(employee1);
        showRoom.addEmployee(employee2);
        showRoom.sellCarToClient(employee1,car1,client);
        showRoom.sellCarToClient(employee2,car2,client);
        showRoom.payAllCommisions();
        Assertions.assertEquals(0,showRoom.getEmployeeCommission(employee2));
    }
    @Test
    public void testGetValueOfAllSalaries(){
        ShowRoom showRoom = new ShowRoom();
        Employee employee1 = new SeniorSalesManager("ivan", "ivanov", 200);
        Employee employee2 = new JuniorSalesManager("georgi", "georgiev",100);
        showRoom.addEmployee(employee1);
        showRoom.addEmployee(employee2);
        Assertions.assertEquals(300,showRoom.getValueOfAllSalaries());
    }
}
