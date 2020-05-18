package Test;

import manolCar.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarTest {
    @Test
    public void testIfTwoCarsAreEqual(){
        BMW bmw = new BMW("e565",10000, "123" , true);
        BMW bmw2 = new BMW("e565",10000, "123" , true);
        boolean isEqual = bmw.equals(bmw2);
        Assertions.assertEquals(true,isEqual);
    }
    @Test
    public void testIfTwoCarsAreUnequal(){
        BMW bmw = new BMW("e565",10000, "123" , true);
        BMW bmw2 = new BMW("e565",10000, "1234" , true);
        boolean isEqual = bmw.equals(bmw2);
        Assertions.assertEquals(false,isEqual);
    }
    @Test
    public void testIfNewCreatedBMWHasBrandBMW(){
        BMW bmw = new BMW("e565",10000, "123" , true);
        Assertions.assertEquals("BMW", bmw.getBrand());
    }
    @Test
    public void testIfNewCreatedAudiHasBrandAudi(){
        Audi audi = new Audi("a5",10000, "123" , true);
        Assertions.assertEquals("Audi", audi.getBrand());
    }
    @Test
    public void testIfNewCreatedMercedesHasBrandMercedes(){
        Mercedes mercedes = new Mercedes("e220",10000, "123" , true);
        Assertions.assertEquals("Mercedes", mercedes.getBrand());
    }
    @Test
    public void testMercedesToStringMethodWithFourMatic(){
        Mercedes mercedes = new Mercedes("e220",10000, "123" , true);
        Assertions.assertEquals("Mercedes e220 with VIN: 123 and price: 10000 and FourMatic", mercedes.toString());
    }
    @Test
    public void testMercedesToStringMethodWithoutFourMatic(){
        Mercedes mercedes = new Mercedes("e220",10000, "123" , false);
        Assertions.assertEquals("Mercedes e220 with VIN: 123 and price: 10000", mercedes.toString());
    }
    @Test
    public void testBMWToStringMethodWithMPower(){
        BMW bmw = new BMW("e220",10000, "123" , true);
        Assertions.assertEquals("BMW e220 with VIN: 123 and price: 10000 and MPower", bmw.toString());
    }
    @Test
    public void testBMWToStringMethodWithoutMPower(){
        Car bmw = new BMW("e220",10000, "123" , false);
        Assertions.assertEquals("BMW e220 with VIN: 123 and price: 10000", bmw.toString());
    }
    @Test
    public void testAudiToStringMethodWithAllRoad(){
        Audi audi = new Audi("e220",10000, "123" , true);
        Assertions.assertEquals("Audi e220 with VIN: 123 and price: 10000 and AllRoad", audi.toString());
    }
    @Test
    public void testAudiToStringMethodWithoutAllRoad(){
        Car audi= new Audi("e220",10000, "123" , false);
        Assertions.assertEquals("Audi e220 with VIN: 123 and price: 10000", audi.toString());
    }
    @Test
    public void testDriveMethodOfBMWWithMPower(){
        BMW bmw = new BMW("e220",10000, "123" , true);
        Assertions.assertEquals("Driving pleasure...\nYou can feel the power of MPower...", bmw.drive());
    }
    @Test
    public void testDriveMethodOfBMWWithoutMPower(){
        BMW bmw = new BMW("e220",10000, "123" , false);
        Assertions.assertEquals("Driving pleasure...\n", bmw.drive());
    }
    @Test
    public void testDriveMethodOfAudiWithAllRoad(){
        Audi audi = new Audi("e220",10000, "123" , true);
        Assertions.assertEquals("Lead by technology...\nYou can feel the power of allRoad...", audi.drive());
    }
    @Test
    public void testDriveMethodOfAudiWithoutAllRoad(){
        Car audi = new Audi("e220",10000, "123" , false);
        Assertions.assertEquals("Lead by technology...\n", audi.drive());
    }
    @Test
    public void testDriveMethodOfMercedesWithFourMatic(){
        Mercedes mercedes = new Mercedes("e220",10000, "123" , true);
        Assertions.assertEquals("The best or nothing...\nYou can feel the power of FourMatic", mercedes.drive());
    }
    @Test
    public void testDriveMethodOfMercedesWithoutFourMatic(){
        Car mercedes = new Mercedes("e220",10000, "123" , false);
        Assertions.assertEquals("The best or nothing...\n", mercedes.drive());
    }

    @Test
    public void testComparatorOfCarsByBrand(){
        Audi audi = new Audi("e220",10000, "123" , false);
        Car mercedes = new Mercedes("e220",10000, "123" , false);
        List<Car> cars = new ArrayList<>();
        cars.add(mercedes);
        cars.add(audi);
        ComparatorOfCarsByBrand comparator = new ComparatorOfCarsByBrand();
        Collections.sort(cars,comparator);
        Assertions.assertEquals("Lead by technology...\n", cars.get(0).drive());
    }
    @Test
    public void testComparatorOfCarsByPrice(){
        Audi audi = new Audi("e220",10000, "123" , false);
        Car mercedes = new Mercedes("e220",12000, "123" , false);
        List<Car> cars = new ArrayList<>();
        cars.add(mercedes);
        cars.add(audi);
        ComparatorOfCarsByBrand comparator = new ComparatorOfCarsByBrand();
        Collections.sort(cars,comparator);
        Assertions.assertEquals("Lead by technology...\n", cars.get(0).drive());
    }
}

