package Test;

import manolCar.BMW;
import manolCar.Car;
import manolClient.Client;
import manolClient.NewClient;
import manolClient.NormalClient;
import manolClient.VIPClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
