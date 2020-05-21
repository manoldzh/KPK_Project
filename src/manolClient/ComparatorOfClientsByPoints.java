package manolClient;

import java.util.Comparator;
/** Represents a Comparator of Clients which compare by Points.
 * @author Manol Dzhambazov
 * @version 1.0
 * @since 31.05.2020
 */
public class ComparatorOfClientsByPoints <T extends Client>implements Comparator<T> {
    /**
     * This method is used to compare two clients by points and if they have same number of points compare
     * String which toString method returns of the two clients.
     * @param firstClient This is the first Client.
     * @param secondClient  This is the second Client.
     * @return int This returns the result of comparing two ints(Points of the clients) with method compareTo
     * and if returns zero it returns the result of comparing Strings - the toString() of the firstCar and the
     * toString() of the secondCar.
     * @see "compare() of Integer"
     */
    @Override
    public int compare(T firstClient, T secondClient){
        if(firstClient.getPoints() == secondClient.getPoints()){
            return firstClient.toString().compareTo(secondClient.toString());
        }
        return Integer.compare(firstClient.getPoints(),secondClient.getPoints());
    }
}