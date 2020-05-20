package manolCar;

public class Audi extends Car{
    private boolean allRoad;
    /**
     * Default constructor for class Audi.
     */
    public Audi(){
        super("Audi");
        allRoad = false;
    }
    /**
     * Constructor of parameter for class Audi.
     * @param String This is the model of an Audi.
     * @param int  This is the price of an Audi.
     * @param String This is the VIN of an Audi.
     * @param boolean This shows whether an Audi is allroad.
     */
    public Audi(String model, int price, String VIN, boolean allRoad){
        super("Audi",model,price,VIN);
        this.allRoad = allRoad;
    }
    /**
     * This method is used to override the toString method of an
     * Object and presents the Audi as a string same as toString method of Car
     * and add " and AllRoad" if allroad is true.
     * @return String This returns Audi represented as a String.
     * @see "toString method of class Object."
     * @see "toString methos of class Car."
     */
    @Override
    public String toString(){
        if(allRoad){
            return super.toString() + " and AllRoad";
        }
        return super.toString();
    }
    /**
     * This method is used to show that an Audi is driven.
     * @return String This returns a "Lead by technology...\n"
     * and "You can feel the power of allRoad..." if the Audi attribute
     * allRoad is true
     */
    @Override
    public String drive(){
        String result = new String();
        result += "Lead by technology...\n";
        if(allRoad){
            result += "You can feel the power of allRoad...";
        }
        return result;
    }
}
