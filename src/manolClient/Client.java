package manolClient;

import manolCar.Car;
import manolCard.Card;

public class Client implements Comparable<Client>  {
    private String name;
    private String surname;
    private Card card;
    void drive(Car car){
        System.out.println(this.toString()+ " can drive " + car.toString() + "for " + card.getPoints() + " minutes" );
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
