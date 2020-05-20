package manolCar;

public class BMW extends Car {
    private boolean mPower;
    /**
     * Default constructor for class BMW.
     */
    public BMW(){
        super("BMW");
        mPower = false;
    }
    /**
     * Constructor of parameter for class Mercedes.
     * @param String This is the model of a BMW.
     * @param int  This is the price of a BMW.
     * @param String This is the VIN of a BMW.
     * @param boolean This shows whether a BMW has mPower.
     */
    public BMW(String model, int price, String VIN, boolean mPower){
        super("BMW", model, price, VIN);
        this.mPower = mPower;
    }
    /**
     * This method is used to override the toString method of an
     * Object and presents the Audi as a string same as toString method of Car
     * and add " and MPower" if mPower is true.
     * @return String This returns BMW represented as a String.
     * @see "toString method of class Object."
     * @see "toString methos of class Car."
     */
    @Override
    public String toString(){
        if(mPower){
            return super.toString() + " and MPower";
        }
        return super.toString();
    }
    /**
     * This method is used to show that a BMW is driven.
     * @return String This returns a "Driving pleasure...\n"
     * and "You can feel the power of MPower..." if the BMW attribute
     * mPower is true
     */
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
