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
    public void testTheValueOfIdOfTheFirstCard(){
        Card card1 = new TrialCard();
        Assertions.assertEquals(1,card1.getId());
    }
    //This test should be run alone
    @Test
    public void testTheValueOfIdOfTheSecondCard(){
        Card card1 = new TrialCard();
        Card card2 = new VIPCard();
        Assertions.assertEquals(2,card2.getId());
    }
    @Test
    public void testIdOfTwoCardsOfTheSameType(){
        Card card1 = new NormalCard();
        Card card2 = new NormalCard();
        Assertions.assertNotEquals(card1.getId(),card2.getId());
    }
    @Test
    public void testIdOfTwoCardsOfDifferentType(){
        Card card1 = new NormalCard();
        Card card2 = new VIPCard();
        Assertions.assertNotEquals(card1.getId(),card2.getId());
    }
    @Test
    public void testPointsOfTrialCardWithoutParameterInConstructor(){
        Card card = new TrialCard();
        Assertions.assertEquals(5,card.getPoints());
    }
    @Test
    public void testPointsOfTrialCardWithParameterInRangeInConstructor(){
        Card card = new TrialCard(11);
        Assertions.assertEquals(11,card.getPoints());
    }
    @Test
    public void testPointsOfTrialCardWithParameterOutOfRangeInConstructor(){
        Card card = new TrialCard(33);
        Assertions.assertEquals(20,card.getPoints());
    }
    @Test
    public void testPointsOfTrialCardWithNegativeParameterInConstructor(){
        Card card = new TrialCard(-2);
        Assertions.assertEquals(5,card.getPoints());
    }
    @Test
    public void testAddPointsOfTrialCardWithoutPassingTheBoard(){
        Card card = new TrialCard(10);
        ((TrialCard) card).addPoints();
        Assertions.assertEquals(11,card.getPoints());
    }
    @Test
    public void testAddPointsOfTrialCardWithPassingTheBoard(){
        Card card = new TrialCard(20);
        ((TrialCard) card).addPoints();
        Assertions.assertEquals(20,card.getPoints());
    }

    @Test
    public void testPointsOfNormalCardWithoutParameterInConstructor(){
        Card card = new NormalCard();
        Assertions.assertEquals(20,card.getPoints());
    }
    @Test
    public void testPointsOfNormalCardWithParameterInRangeInConstructor(){
        Card card = new NormalCard(25);
        Assertions.assertEquals(25,card.getPoints());
    }
    @Test
    public void testPointsOfNormalCardWithParameterOutOfRangeInConstructor(){
        Card card = new NormalCard(45);
        Assertions.assertEquals(40,card.getPoints());
    }
    @Test
    public void testPointsOfNormalCardWithNegativeParameterInConstructor(){
        Card card = new NormalCard(-3);
        Assertions.assertEquals(20,card.getPoints());
    }
    @Test
    public void testAddPointsOfNormalCardWithoutPassingTheBoard(){
        Card card = new NormalCard(25);
        ((NormalCard) card).addPoints();
        Assertions.assertEquals(26,card.getPoints());
    }
    @Test
    public void testAddPointsOfNormalCardWithPassingTheBoard(){
        Card card = new NormalCard(40);
        ((NormalCard) card).addPoints();
        Assertions.assertEquals(40,card.getPoints());
    }

    @Test
    public void testPointsOfVIPCardWithoutParameterInConstructor(){
        Card card = new VIPCard();
        Assertions.assertEquals(30,card.getPoints());
    }
    @Test
    public void testPointsOfVIPCardWithParameterInRangeInConstructor(){
        Card card = new VIPCard(65);
        Assertions.assertEquals(65,card.getPoints());
    }
    @Test
    public void testPointsOfVIPCardWithParameterOutOfRangeInConstructor(){
        Card card = new VIPCard(120);
        Assertions.assertEquals(100,card.getPoints());
    }
    @Test
    public void testPointsOfVIPCardWithNegativeParameterInConstructor(){
        Card card = new VIPCard(-12);
        Assertions.assertEquals(30,card.getPoints());
    }
    @Test
    public void testAddPointsOfVIPCardWithoutPassingTheBoard(){
        Card card = new VIPCard(50);
        ((VIPCard) card).addPoints();
        Assertions.assertEquals(52,card.getPoints());
    }
    @Test
    public void testAddPointsOfVIPCardWithPassingTheBoard(){
        Card card = new VIPCard(99);
        ((VIPCard) card).addPoints();
        Assertions.assertEquals(100,card.getPoints());
    }
}
