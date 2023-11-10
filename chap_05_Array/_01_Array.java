package java_basic.chap_05_Array;

public class _01_Array {
    public static void main(String[] args) {
        //배열: 같은 자료형의 값 여러개를 저장하는 연속된 공간

        //배열 사용 X
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페라떼";
        String coffeeChandler = "카페모카";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println("주세요");

        //배열 사용 #1: 자료형[] 배열명 = new 자료형[배열의 크기];
        String[] coffees1 = new String[4];

        coffees1[0] = "아메리카노";
        coffees1[1] = "카페라뗴";
        coffees1[2] = "카페모카";
        coffees1[3] = "카푸치노";

        //배열 사용 #2: 자료형 배열명[] = new 자료형[배열의 크기];
        String coffees2[] = new String[4];
        coffees2[0] = "아메리카노";
        coffees2[1] = "카페라뗴";
        coffees2[2] = "카페모카";
        coffees2[3] = "카푸치노";

        //배열 사용#3: 자료형[] 배열명 = new 자료형[] {a, b, c, d} -> 배열의 크기를 선언하지 않고 대괄호({})안에 값을 넣어 그 크기만큼 배열을 잡는다
        String[] coffees3 = new String[] {"아메리카노", "카페라떼", "카페모카", "카푸치노"};

        //배열 사용 #4: 자료형[] 배열명 = {} -> 배열의 크기를 선언하지 않고 대괄호({})안에 값을 넣어 그 크기만큼 배열을 잡는다
        String[] coffees4 = {"아메리카노", "카페라떼", "카페모카", "카푸치노"};

        //커피주문
        System.out.println(coffees1[0]+" 하나");
        System.out.println(coffees1[1]+" 하나");
        coffees1[2]="에시프레소"; //값 변경
        System.out.println(coffees1[2]+" 하나");
        System.out.println(coffees1[3]+" 하나");
        System.out.println("주세요.");

    }
}
