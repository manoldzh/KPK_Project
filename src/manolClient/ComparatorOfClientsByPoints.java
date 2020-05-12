package manolClient;

import java.util.Comparator;

public class ComparatorOfClientsByPoints implements Comparator<Client> {
    @Override
    public int compare(Client firstClient, Client secondClient){
        if(firstClient.getPoints() == secondClient.getPoints()){
            return firstClient.toString().compareTo(secondClient.toString());
        }
        return Integer.compare(firstClient.getPoints(),secondClient.getPoints());
    }
}