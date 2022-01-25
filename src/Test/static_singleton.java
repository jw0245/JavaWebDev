package Test;

public class static_singleton {

    /* 카드 회사가 있습니다. 카드 회사는 유일한 객체이고, 이회사 에서는 카드를 발급하면
    항상 고유번호가 자동으로 생성됩니다.
    10001부터 시작하여 카드가 생성될 때마다 10002, 10003으로 증가 됩니다.
    다음 코드가 수행되도록 Card 클래스와 CardCompany 클래스를 구현하세요.
     */
    public static void main(String[] args) {

        CardCompany company = CardCompany.getInstance();

        Card myCard = company.createCard();
        Card yourcard = company.createCard();

        System.out.println(myCard.getCardNumber());
        System.out.println(yourcard.getCardNumber());

    }
}
