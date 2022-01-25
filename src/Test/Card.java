package Test;

public class Card {

    private static int CardNum = 1000;

    public Card() {
        CardNum ++;
    }


    public int getCardNumber() {
        return CardNum;
    }
}
