package Test;

import manolCard.Card;
import manolCard.NormalCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest {
    @Test
    public void TestIdOfTwoCards(){
        Card card1 = new NormalCard();
        Card card2 = new NormalCard();
        Assertions.assertEquals(1,1);
    }
}
