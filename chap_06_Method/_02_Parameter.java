package java_basic.chap_06_Method;

public class _02_Parameter {
    public static void power(int num){
        int result = num * num;
        System.out.println(num + "의 2승은 " + result);
    }

    public static void powerByExp(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        System.out.println(num + "의 "+ exponent + "승은 " + result);

    }

    public static void main(String[] args) {
        //전달값, Parameter
        //제곱값을 출력하는 프로그램 만들기
        power(2);
        power(3);
        power(4);
        System.out.println();
        powerByExp(2, 3);
        powerByExp(2, 4);
        powerByExp(3, 3);
        powerByExp(3, 4);
    }
}
