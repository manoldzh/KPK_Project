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
    public void TestPointsOfTrialCardWithoutParameterInConstructor(){
        Card card = new TrialCard();
        Assertions.assertEquals(5,card.getPoints());
    }
    @Test
    public void TestPointsOfTrialCardWithParameterInRangeInConstructor(){
        Card card = new TrialCard(11);
        Assertions.assertEquals(11,card.getPoints());
    }
    @Test
    public void TestPointsOfTrialCardWithParameterOutOfRangeInConstructor(){
        Card card = new TrialCard(33);
        Assertions.assertEquals(20,card.getPoints());
    }
    @Test
    public void TestPointsOfTrialCardWithNegativeParameterInConstructor(){
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

    @Test
    public void TestPointsOfNormalCardWithoutParameterInConstructor(){
        Card card = new NormalCard();
        Assertions.assertEquals(20,card.getPoints());
    }
    @Test
    public void TestPointsOfNormalCardWithParameterInRangeInConstructor(){
        Card card = new NormalCard(25);
        Assertions.assertEquals(25,card.getPoints());
    }
    @Test
    public void TestPointsOfNormalCardWithParameterOutOfRangeInConstructor(){
        Card card = new NormalCard(45);
        Assertions.assertEquals(40,card.getPoints());
    }
    @Test
    public void TestPointsOfNormalCardWithNegativeParameterInConstructor(){
        Card card = new NormalCard(-3);
        Assertions.assertEquals(20,card.getPoints());
    }
    @Test
    public void TestAddPointsOfNormalCardWithoutPassingTheBoard(){
        Card card = new NormalCard(25);
        ((NormalCard) card).addPoints();
        Assertions.assertEquals(26,card.getPoints());
    }
    @Test
    public void TestAddPointsOfNormalCardWithPassingTheBoard(){
        Card card = new NormalCard(40);
        ((NormalCard) card).addPoints();
        Assertions.assertEquals(40,card.getPoints());
    }

    @Test
    public void TestPointsOfVIPCardWithoutParameterInConstructor(){
        Card card = new VIPCard();
        Assertions.assertEquals(30,card.getPoints());
    }
    @Test
    public void TestPointsOfVIPCardWithParameterInRangeInConstructor(){
        Card card = new VIPCard(65);
        Assertions.assertEquals(65,card.getPoints());
    }
    @Test
    public void TestPointsOfVIPCardWithParameterOutOfRangeInConstructor(){
        Card card = new VIPCard(120);
        Assertions.assertEquals(100,card.getPoints());
    }
    @Test
    public void TestPointsOfVIPCardWithNegativeParameterInConstructor(){
        Card card = new VIPCard(-12);
        Assertions.assertEquals(30,card.getPoints());
    }
    @Test
    public void TestAddPointsOfVIPCardWithoutPassingTheBoard(){
        Card card = new VIPCard(50);
        ((VIPCard) card).addPoints();
        Assertions.assertEquals(52,card.getPoints());
    }
    @Test
    public void TestAddPointsOfVIPCardWithPassingTheBoard(){
        Card card = new VIPCard(99);
        ((VIPCard) card).addPoints();
        Assertions.assertEquals(100,card.getPoints());
    }
}
