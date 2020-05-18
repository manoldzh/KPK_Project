package Test;

import manolCar.BMW;
import manolCar.Car;
import manolClient.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientTest {
    @Test
    public void testToStringMethodOfClient(){
        Client client = new VIPClient("ivan", "ivanov");
        Assertions.assertEquals("ivan ivanov", client.toString());
    }

    @Test
    public void testCalculatePriceForCarOfNewClient(){
        Client client = new NewClient("Ivan", "Ivanov");
        Car car = new BMW("m5" , 20000, "123", true);
        Assertions.assertEquals(20000,client.calculatePriceForCar(car));
    }
    @Test
    public void testCalculateMinutesOfDrivingOfNewClient(){
        Client client = new NewClient("Ivan", "Ivanov");
        Assertions.assertEquals(10,((NewClient) client).calculateMinutesOfDriving());
    }


    @Test
    public void testCalculateDiscountOfNormalClient(){
        Client client = new NormalClient("Ivan", "Ivanov");
        Assertions.assertEquals(8,((NormalClient) client).calculateDiscount());
    }
    @Test
    public void testCalculatePriceForCarOfNormalClient(){
        Client client = new NormalClient("Ivan", "Ivanov");
        Car car = new BMW("m5" , 20000, "123", true);
        Assertions.assertEquals(18400,client.calculatePriceForCar(car));
    }
    @Test
    public void testCalculateMinutesOfDrivingOfNormalClient(){
        Client client = new NormalClient("Ivan", "Ivanov");
        Assertions.assertEquals(35,((NormalClient) client).calculateMinutesOfDriving());
    }

    @Test
    public void testCalculateDiscountOfVIPClient(){
        Client client = new VIPClient("Ivan", "Ivanov");
        Assertions.assertEquals(11,((VIPClient) client).calculateDiscount());
    }
    @Test
    public void testCalculatePriceForCarOfVIPClient(){
        Client client = new VIPClient("Ivan", "Ivanov");
        Car car = new BMW("m5" , 20000, "123", true);
        Assertions.assertEquals(17800,client.calculatePriceForCar(car));
    }
    @Test
    public void testCalculateMinutesOfDrivingOfVIPClient(){
        Client client = new VIPClient("Ivan", "Ivanov");
        Assertions.assertEquals(50,((VIPClient) client).calculateMinutesOfDriving());
    }

    @Test
    public void testComparatorOfClientsByPoints(){
        List<Client> clients = new ArrayList<Client>();
        clients.add(new VIPClient("georgi", "georgiev"));
        clients.add(new NormalClient("ivan" , "ivanov"));
        ComparatorOfClientsByPoints comparator = new ComparatorOfClientsByPoints();
        Collections.sort(clients, comparator);
        Assertions.assertEquals("ivan ivanov", clients.get(0).toString());
    }
    @Test
    public void testCompareToOfClient(){
        List<Client> clients = new ArrayList<Client>();
        clients.add(new NormalClient("ivan" , "ivanov"));
        clients.add(new VIPClient("georgi", "georgiev"));
        Collections.sort(clients);
        Assertions.assertEquals("georgi georgiev", clients.get(0).toString());
    }
}
