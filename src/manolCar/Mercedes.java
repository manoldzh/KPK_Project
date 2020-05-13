package manolCar;

public class Mercedes extends Car {
    private boolean fourMatic;
    public Mercedes(){
        super("Mercedes");
        fourMatic = false;
    }
    public Mercedes(String model, int price, String VIN, boolean fourMatic){
        super("Mercedes", model, price, VIN);
        this.fourMatic = fourMatic;
    }
    @Override
    public void drive(){
        System.out.println("The best or nothing...");
        if(fourMatic){
            System.out.println("You can feel the power of FourMatic");
        }
    }
}
