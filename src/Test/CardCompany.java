package Test;

public class CardCompany {

    private static CardCompany instance = new CardCompany();

    private  CardCompany() {}



    public static CardCompany getInstance(){

        if(instance == null){
            instance = new CardCompany();
        }

        return instance;
    };
        //// 2-16 문제 다시 보기
    public Card createCard() {
        Card card = new Card();

        return card;

    }


}
