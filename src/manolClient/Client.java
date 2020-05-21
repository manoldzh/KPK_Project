package manolClient;

import manolCar.Car;
import manolCard.Card;
/** Represents a Client.
 * @author Manol Dzhambazov
 * @version 1.0
 * @since 31.05.2020
 */
public abstract class Client implements Comparable<Client>  {
    private String name;
    private String surname;
    private Card card;
    /**
     * Default constructor for class Client.
     */
    public Client(){
        name = "default";
        surname = "default";
    }
    /**
     * Constructor for class Car with only two parameter.
     * @param name This is the name of a Client.
     * @param surname This is the surname of a Client
     */
    public Client(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public abstract void buyCar(Car car);
    public abstract void drive (Car car);
    public abstract double calculatePriceForCar(Car car);
    public abstract int calculateMinutesOfDriving();

    /**
     * This method is used to set the Cars of this Client to another Card.
     * @param card This is the car which we set.
     */
    public void setCard(Card card) {
        this.card = card;
    }
    /**
     * This method is used to get the Card of a Client.
     * @return Card This returns the Card of a Client.
     */
    public Card getCard(){
        return card;
    }
    /**
     * This method is used to get the id of a Card of a Car.
     * @return int This returns the id of a Card of a Client.
     */
    public int getIdOfCard(){
        return this.card.getId();
    }
    /**
     * This method is used to override the toString method of an
     * Object and presents the Client as a string which contains
     * the name, space, the surname.
     * @return String This returns Client represented as a String.
     * @see "toString method of class Object."
     */
    @Override
    public String toString(){
        return name + " " + surname;
    }
    /**
     * This method is used to override the compareTo method of an
     * Object and use compareTo method of String for toString method of
     * the two Clients
     * @param otherClient This is the other client with which we compare this.
     * @return int This returns what return the compareTo methos of Strings.
     * @see "compareTo method of class String."
     */
    @Override
    public int compareTo(Client otherClient){
        return this.toString().compareTo(otherClient.toString());
    }
    /**
     * This method is used to get the points of a Card of a Car.
     * @return int This returns the points of a Card of a Car..
     */
    public int getPoints(){
        return card.getPoints();
    }
    /**
     * This method is used to check whether two Clients are equal.
     * It overrides the equals method of Object and returns true only if
     * two Clients have same name and surname.
     * @param c This is the object with which we check whether this is equal.
     * @return boolean This returns whether the two Clients are equal.
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
        if(((Client)c).getIdOfCard() == this.getIdOfCard() ) {
            return true;
        }
        return false;
    }
}
