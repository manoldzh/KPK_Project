package manolCar;

public abstract class Car {
    private String brand;
    private String model;
    private int price;
    private String VIN;
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
    public String getModel(){
        return  model;
    }
    public Car(){
        brand = "default";
        model = "default";
        price = 0;
        VIN = "default";
    }
    public Car(String brand){
        this.brand = brand;
        model = "default";
        price = 0;
        VIN = "default";
    }
    public Car(String brand, String model, int price, String VIN){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.VIN = VIN;
    }
    public abstract void drive();
    public String getVIN(){
        return  VIN;
    }
    @Override
    public boolean equals(Object c){
        if(c==null){
            return false;
        }
        if(c == this){
            return true;
        }
        if(c.getClass() != this.getClass()) {
            return false;
        }
        if(((Car)c).getVIN() == this.getVIN() ) {
            return true;
        }
        return false;
    }
}