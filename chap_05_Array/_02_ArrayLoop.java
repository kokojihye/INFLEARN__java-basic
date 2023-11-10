package java_basic.chap_05_Array;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열의 순회
        String[] coffees = {"아메리카노", "카페라떼", "카페모카", "카푸치노"};

        //for반복문 이용한 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요.");
        System.out.println("---------------------------------------");

        //배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요.");
        System.out.println("---------------------------------------");

        //enhanced for(for-each) 반복문
        //배열 coffees에 있는 요소를 coffee라는 변수를 통해 받겠다는 의미(인덱스 사용하지 않아도 됨)
        for (String coffee : coffees){
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요.");
        System.out.println("---------------------------------------");
    }
}
