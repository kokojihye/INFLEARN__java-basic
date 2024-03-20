package java_basic.chap_09_Generics;

import java_basic.chap_09_Generics.coffee.*;
import java_basic.chap_09_Generics.user.User;
import java_basic.chap_09_Generics.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("지혜");
        c2.ready();

        System.out.println("=================================");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("=================================");

        System.out.println("자료형 미정의");
        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        System.out.println("=================================");

        System.out.println("자료형 정의");
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();

        int c5Name = c5.name; // 형변환 불필요
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("유재석");
        c6.ready();

        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("=================================");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        System.out.println("=================================");

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();

        orderCoffee("이수근");
        orderCoffee(36);

        System.out.println("=================================");
        orderCoffee("김희철", "라떼");
        orderCoffee("유재석", "아메리카노");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
