package Test;

public class Second_test {
    /*쇼핑몰에서 주문이 들어왔씁니다.
            주문 번호 : 201907210001
            주문자 아이디 : abc123
            주문자 날짜 : 2019년 7월 21일
            주문자 이름: 홍길순
            주문 상품 번호 : PD0345-12
            배송 주소 : 서울시 영등포구 여의도동 20번지
        *

        */
    String order_num;
    String order_id;
    String date;
    String name;
    String order_productno;
    String address;
    public void showOrderInfo(){

        System.out.println("주문 번호: " + order_num );
        System.out.println("주문자 아이디: " + order_id );
        System.out.println("주문자 날짜" + date);
        System.out.println("이름 : " + name);
        System.out.println("주문 상품 번호" + order_productno);
        System.out.println("배송 주소" + address);

    }

    public static void main(String[] args) {
        Second_test shop = new Second_test();

        shop.order_num = "201907210001";
        shop.order_id = "abc123";
        shop.date = "2019년 7월 21일";
        shop.name = "홀길순";
        shop.order_productno = "PD0345-12";
        shop.address = "서울시 영등포구 여의도동 20번지";

        shop.showOrderInfo();



    }
}
