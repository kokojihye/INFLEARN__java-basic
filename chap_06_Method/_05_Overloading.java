package java_basic.chap_06_Method;

public class _05_Overloading {
    public static int getPower(int num){
        int result = num * num;
        return result;
        //return num * num;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber); //문자열로 받아온 숫자를 정수형으로 변경
        return number * number;
    }

    public static int getPower(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        //메소드 오버로딩: 이름이 같은 메소드를 여러개 만듦
        //전달값의 타입이 다르거나 전달값의 개수가 다를 때 사용할 수 있다.
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3, 4));
    }
}
