package manolCar;

public class Mercedes extends Car {
    private boolean fourMatic;
    /**
     * Default constructor for class Mercedes.
     */
    public Mercedes(){
        super("Mercedes");
        fourMatic = false;
    }

    /**
     * Constructor of parameter for class Mercedes.
     * @param String This is the model of a BMW.
     * @param int  This is the price of a BMW.
     * @param String This is the VIN of a BMW.
     * @param boolean This shows whether a Mercedes has FourMatic.
     */
    public Mercedes(String model, int price, String VIN, boolean fourMatic){
        super("Mercedes", model, price, VIN);
        this.fourMatic = fourMatic;
    }
    /**
     * This method is used to override the toString method of an
     * Object and presents the Mercedes as a string same as toString method of Car
     * and add " and FourMatic" if mPower is true.
     * @return String This returns Mercedes represented as a String.
     * @see "toString method of class Object."
     * @see "toString methos of class Car."
     */
    @Override
    public String toString(){
        if(fourMatic){
            return super.toString() + " and FourMatic";
        }
        return super.toString();
    }
    /**
     * This method is used to show that a Mercedes is driven.
     * @return String This returns a "The best or nothing...\n"
     * and "You can feel the power of FourMatic..." if the Mercedes attribute
     * allRoad is true
     */
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
