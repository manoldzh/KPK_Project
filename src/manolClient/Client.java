package manolClient;

import manolCar.Car;
import manolCard.Card;

public abstract class Client implements Comparable<Client>  {
    private String name;
    private String surname;
    private Card card;
    public Client(){
        name = "default";
        surname = "default";
    }
    public Client(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public abstract void buyCar(Car car);
    public abstract void drive (Car car);
    public abstract double makePriceForCar(Car car);
    public void setCard(Card card) {
        this.card = card;
    }
    @Override
    public String toString(){
        return name + " " + surname;
    }
    @Override
    public int compareTo(Client otherClient){
        return this.toString().compareTo(otherClient.toString());
    }
    public int getPoints(){
        return card.getPoints();
    }
}
