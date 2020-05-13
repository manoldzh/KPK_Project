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
    public String toString(){
        if(mPower){
            return super.toString() + " and MPower";
        }
        return super.toString();
    }
    @Override
    public String drive(){
        String result = new String();
        result += "Driving pleasure...\n";
        if(mPower){
            result += "You can feel the power of MPower...";
        }
        return result;
    }
}
