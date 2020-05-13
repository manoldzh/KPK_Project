package manolCar;

public class BMW extends Car {
    private boolean mPower;
    public BMW(){
        super("BMW");
        mPower = false;
    }
    public BMW(String model, int price, String VIN, boolean mPower){
        super("BMW", model, price, VIN);
        this.mPower = mPower;
    }
    @Override
    public void drive(){
        System.out.println("Driving pleasure..");
        if(mPower){
            System.out.println("You can feel the power of MPower...");
        }
    }
}
