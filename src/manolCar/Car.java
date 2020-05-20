package manolCar;

public abstract class Car {
    private String brand;
    private String model;
    private int price;
    private String VIN; // VIN is unique for every car
    /**
     * This method is used to override the toString method of an
     * Object and presents the car as a string which contains
     * the brand, space, the model, " with VIN: ", the VIN, " and price: ", the price.
     * @return String This returns car represented as a String.
     * @see "toString method of class Object."
     */
    @Override
    public String toString(){
        return brand + " " + model + " with VIN: " + VIN + " and price: " + price;
    }
    /**
     * This method is used to get the brand of a Car.
     * @return String This returns the brand of a Car.
     */
    public String getBrand(){
        return brand;
    }
    /**
     * This method is used to get the price of a Car.
     * @return int This returns the price of a Car.
     */
    public int getPrice(){
        return price;
    }
    /**
     * This method is used to get the model of a Car.
     * @return String This returns model of a Car.
     */
    public String getModel(){
        return  model;
    }
    /**
     * Default constructor for class Car.
     */
    public Car(){
        brand = "default";
        model = "default";
        price = 0;
        VIN = "default";
    }
    /**
     * Constructor for class Car with only one parameter.
     * @param String This is the brand of a Car.
     */
    public Car(String brand){
        this.brand = brand;
        model = "default";
        price = 0;
        VIN = "default";
    }
    /**
     * Constructor with parameters for class Car.
     * @param String This is the brand of a Car.
     * @param String This is the model of a Cat.
     * @param int This is the price of a Car.
     * @param String This is the VIN of a Car.
     */
    public Car(String brand, String model, int price, String VIN){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.VIN = VIN;
    }
    public abstract String drive();
    /**
     * This method is used to get the VIN of a Car.
     * @return String This returns the VIN of a Car..
     */
    public String getVIN(){
        return  VIN;
    }
    /**
     * This method is used to check whether two cars are equal.
     * It overrides the equals method of Object and returns true only if
     * two cars have the same VIN.
     * @param Object This is the object with which we check whether this is equal.
     * @return boolean This returns whether the two Cars are equal.
     * @see "equals methos in the class Object."
     */
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