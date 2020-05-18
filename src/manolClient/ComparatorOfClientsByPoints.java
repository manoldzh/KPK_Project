package manolClient;

import java.util.Comparator;

public class ComparatorOfClientsByPoints <T extends Client>implements Comparator<T> {
    @Override
    public int compare(T firstClient, T secondClient){
        if(firstClient.getPoints() == secondClient.getPoints()){
            return firstClient.toString().compareTo(secondClient.toString());
        }
        return Integer.compare(firstClient.getPoints(),secondClient.getPoints());
    }
}