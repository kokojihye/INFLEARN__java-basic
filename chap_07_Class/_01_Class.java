package java_basic.chap_07_Class;

public class _01_Class {
    public static void main(String[] args) {
        //객체지향 프로그래밍 (OOP : Object-Oriented Programming)
        //장점: 높은 재사용성, 유지보수 용이

        //차량용 블랙박스: 모델명, 해상도, 가격, 색상

        //첫번째 상품
        String modelName = "까망이";
        String resolution ="FHD";
        int price = 200000;
        String color = "블랙";

        //두번째 상품
        String modelName2 ="하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        //세번째 상품
        BlackBox bbox = new BlackBox();
        bbox.modelName = "노랑이";
        bbox.resolution = "FHD";
        bbox.price = 270000;
        bbox.color = "옐로우";
    }
}
