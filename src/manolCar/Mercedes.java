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
    public String toString(){
        if(fourMatic){
            return super.toString() + " and FourMatic";
        }
        return super.toString();
    }
    @Override
    public String drive(){
        String result = new String();
        result += "The best or nothing...\n";
        if(fourMatic){
            result += "You can feel the power of FourMatic";
        }
        return result;
    }
}
