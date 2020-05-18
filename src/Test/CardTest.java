package Test;

import manolCard.Card;
import manolCard.NormalCard;
import manolCard.TrialCard;
import manolCard.VIPCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest {
    //This test should be run alone
    @Test
    public void TestTheValueOfIdOfTheFirstCard(){
        Card card1 = new TrialCard();
        Assertions.assertEquals(1,card1.getId());
    }
    //This test should be run alone
    @Test
    public void TestTheValueOfIdOfTheSecondCard(){
        Card card1 = new TrialCard();
        Card card2 = new VIPCard();

        Assertions.assertEquals(2,card2.getId());
    }
    @Test
    public void TestIdOfTwoCardsOfTheSameType(){
        Card card1 = new NormalCard();
        Card card2 = new NormalCard();
        Assertions.assertNotEquals(card1.getId(),card2.getId());
    }
    @Test
    public void TestIdOfTwoCardsOfDifferentType(){
        Card card1 = new NormalCard();
        Card card2 = new VIPCard();
        Assertions.assertNotEquals(card1.getId(),card2.getId());
    }
    @Test
    public void TestPointsOfTrialCardWithoutParametersInConstructor(){
        Card card = new TrialCard();
        Assertions.assertEquals(5,card.getPoints());
    }
    @Test
    public void TestPointsOfTrialCardWithParametersInRangeInConstructor(){
        Card card = new TrialCard(11);
        Assertions.assertEquals(11,card.getPoints());
    }
    @Test
    public void TestPointsOfTrialCardWithParametersOutOfRangeInConstructor(){
        Card card = new TrialCard(33);
        Assertions.assertEquals(20,card.getPoints());
    }
    @Test
    public void TestPointsOfTrialCardWithNegativeParametersInConstructor(){
        Card card = new TrialCard(-2);
        Assertions.assertEquals(5,card.getPoints());
    }
    @Test
    public void TestAddPointsOfTrialCardWithoutPassingTheBoard(){
        Card card = new TrialCard(10);
        ((TrialCard) card).addPoints();
        Assertions.assertEquals(11,card.getPoints());
    }
    @Test
    public void TestAddPointsOfTrialCardWithPassingTheBoard(){
        Card card = new TrialCard(20);
        ((TrialCard) card).addPoints();
        Assertions.assertEquals(20,card.getPoints());
    }
}
