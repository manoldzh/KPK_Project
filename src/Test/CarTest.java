package Test;

import manolCar.Audi;
import manolCar.BMW;
import manolCar.Car;
import manolCar.Mercedes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void TestTwoCarsAreEqual(){
        BMW bmw = new BMW("e565",10000, "123" , true);
        BMW bmw2 = new BMW("e565",10000, "123" , true);
        boolean isEqual = bmw.equals(bmw2);
        Assertions.assertEquals(true,isEqual);
    }
    @Test
    public void TestTwoCarsAreUnequal(){
        BMW bmw = new BMW("e565",10000, "123" , true);
        BMW bmw2 = new BMW("e565",10000, "1234" , true);
        boolean isEqual = bmw.equals(bmw2);
        Assertions.assertEquals(false,isEqual);
    }
    @Test
    public void TestNewCreatedBMWHasBrandBMW(){
        BMW bmw = new BMW("e565",10000, "123" , true);
        Assertions.assertEquals("BMW", bmw.getBrand());
    }
    @Test
    public void TestNewCreatedAudiHasBrandAudi(){
        Audi audi = new Audi("a5",10000, "123" , true);
        Assertions.assertEquals("Audi", audi.getBrand());
    }
    @Test
    public void TestNewCreatedMercedesHasBrandMercedes(){
        Mercedes mercedes = new Mercedes("e220",10000, "123" , true);
        Assertions.assertEquals("Mercedes", mercedes.getBrand());
    }
    @Test
    public void TestMercedesToStringMethodWithFourMatic(){
        Mercedes mercedes = new Mercedes("e220",10000, "123" , true);
        Assertions.assertEquals("Mercedes e220 with VIN: 123 and price: 10000 and FourMatic", mercedes.toString());
    }
    @Test
    public void TestMercedesToStringMethodWithoutFourMatic(){
        Mercedes mercedes = new Mercedes("e220",10000, "123" , false);
        Assertions.assertEquals("Mercedes e220 with VIN: 123 and price: 10000", mercedes.toString());
    }
    @Test
    public void TestBMWToStringMethodWithMPower(){
        BMW bmw = new BMW("e220",10000, "123" , true);
        Assertions.assertEquals("BMW e220 with VIN: 123 and price: 10000 and MPower", bmw.toString());
    }
    @Test
    public void TestBMWToStringMethodWithoutMPower(){
        Car bmw = new BMW("e220",10000, "123" , false);
        Assertions.assertEquals("BMW e220 with VIN: 123 and price: 10000", bmw.toString());
    }
    @Test
    public void TestAudiToStringMethodWithAllRoad(){
        Audi audi = new Audi("e220",10000, "123" , true);
        Assertions.assertEquals("Audi e220 with VIN: 123 and price: 10000 and AllRoad", audi.toString());
    }
    @Test
    public void TestAudiToStringMethodWithoutAllRoad(){
        Car audi= new Audi("e220",10000, "123" , false);
        Assertions.assertEquals("Audi e220 with VIN: 123 and price: 10000", audi.toString());
    }
    @Test
    public void TestDriveMethodOfBMWWithMPower(){
        BMW bmw = new BMW("e220",10000, "123" , true);
        Assertions.assertEquals("Driving pleasure...\nYou can feel the power of MPower...", bmw.drive());
    }
    @Test
    public void TestDriveMethodOfBMWWithoutMPower(){
        BMW bmw = new BMW("e220",10000, "123" , false);
        Assertions.assertEquals("Driving pleasure...\n", bmw.drive());
    }
    @Test
    public void TestDriveMethodOfAudiWithAllRoad(){
        Audi audi = new Audi("e220",10000, "123" , true);
        Assertions.assertEquals("Lead by technology...\nYou can feel the power of allRoad...", audi.drive());
    }
    @Test
    public void TestDriveMethodOfAudiWithoutAllRoad(){
        Car audi = new Audi("e220",10000, "123" , false);
        Assertions.assertEquals("Lead by technology...\n", audi.drive());
    }
    @Test
    public void TestDriveMethodOfMercedesWithFourMatic(){
        Mercedes mercedes = new Mercedes("e220",10000, "123" , true);
        Assertions.assertEquals("The best or nothing...\nYou can feel the power of FourMatic", mercedes.drive());
    }
    @Test
    public void TestDriveMethodOfMercedesWithoutFourMatic(){
        Car mercedes = new Mercedes("e220",10000, "123" , false);
        Assertions.assertEquals("The best or nothing...\n", mercedes.drive());
    }

}

