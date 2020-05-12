package manolClient;

import manolCar.Car;
import manolCard.TrialCard;

public class NewClient extends  Client {
    public NewClient(String name, String surname){
        super(name,surname);
        setCard(new TrialCard());
    }
    @Override
    public void buyCar(Car car){
        System.out.print( toString() + " buy " + car.toString() + " for " + car.getPrice());
    }
}
