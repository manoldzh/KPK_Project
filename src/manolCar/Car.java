package manolCar;

public abstract class Car implements Comparable<Car> {
    private String brand;
    private int price;
    private String VIN;
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
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