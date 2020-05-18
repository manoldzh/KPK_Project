package Test;

import manolCar.Audi;
import manolCar.BMW;
import manolCar.Car;
import manolClient.Client;
import manolClient.NewClient;
import manolClient.NormalClient;
import manolClient.VIPClient;
import manolEmployee.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
    @Test
    public void testSoldCars(){
        Employee employee = new JuniorSalesAssistant();
        Car car1 = new BMW();
        Car car2 = new Audi();
        Client client = new VIPClient("ivan","ivanov");
        employee.sellCar(car1,client);
        employee.sellCar(car2,client);
        Assertions.assertEquals(2,employee.getSoldCars());
    }
    @Test
    public void testToString(){
        Employee employee = new JuniorSalesAssistant("ivan","ivanov",200);
        Assertions.assertEquals("ivan ivanov", employee.toString());
    }


    @Test
    public void testCalculateAddedPercentsOfJuniorSalesAssistant(){
        Employee employee = new JuniorSalesAssistant();
        Car car = new Audi();
        Client client = new VIPClient("ivan","ivanov");
        employee.sellCar(car,client);
        Assertions.assertEquals(0.0002,employee.calculateAddedPercents());
    }
    @Test
    public void testCalculateCommissionOfJuniorSalesAssistant(){
        Employee employee = new JuniorSalesAssistant();
        Car car = new Audi("a2",10000,"123",true);
        Client client = new VIPClient("ivan","ivanov");
        employee.sellCar(car,client);
        Assertions.assertEquals(46.28,employee.calculateCommission(car,client));
    }

    @Test
    public void testCalculateAddedPercentsOfJuniorSalesManager(){
        Employee employee = new JuniorSalesManager();
        Car car = new Audi();
        Client client = new VIPClient("ivan","ivanov");
        employee.sellCar(car,client);
        Assertions.assertEquals(6.666666666666666E-4,employee.calculateAddedPercents());
    }
    @Test
    public void testCalculateCommissionOfJuniorSalesManager(){
        Employee employee = new JuniorSalesManager();
        Car car = new Audi("a2",10000,"123",true);
        Client client = new VIPClient("ivan","ivanov");
        employee.sellCar(car,client);
        Assertions.assertEquals(94.93333333333334,employee.calculateCommission(car,client));
    }

    @Test
    public void testCalculateAddedPercentsOfSeniorSalesAssistant(){
        Employee employee = new SeniorSalesAssistant();
        Car car = new Audi();
        Client client = new VIPClient("ivan","ivanov");
        employee.sellCar(car,client);
        Assertions.assertEquals(0.0005,employee.calculateAddedPercents());
    }
    @Test
    public void testCalculateCommissionOfSeniorSalesAssistant(){
        Employee employee = new SeniorSalesAssistant();
        Car car = new Audi("a2",10000,"123",true);
        Client client = new NormalClient("ivan","ivanov");
        employee.sellCar(car,client);
        Assertions.assertEquals(69,employee.calculateCommission(car,client));
    }

    @Test
    public void testCalculateAddedPercentsOfSeniorSalesManager(){
        Employee employee = new SeniorSalesManager();
        Car car = new Audi();
        Client client = new NewClient("ivan","ivanov");
        employee.sellCar(car,client);
        Assertions.assertEquals(0.001,employee.calculateAddedPercents());
    }
    @Test
    public void testCalculateCommissionOfSeniorSalesManager(){
        Employee employee = new SeniorSalesManager();
        Car car = new Audi("a2",10000,"123",true);
        Client client = new NewClient("ivan","ivanov");
        employee.sellCar(car,client);
        Assertions.assertEquals(160,employee.calculateCommission(car,client));
    }
}
