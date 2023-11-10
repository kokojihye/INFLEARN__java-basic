package java_basic.chap_02_Operator;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리연산자
        boolean pasta = true;
        boolean steak = true;
        boolean risotto = false;

        //OR연산자(||): 비교하는 값들 중 하나라도 True이면 결과도 True
        System.out.println(pasta | steak | risotto);

        //AND연산자(&&): 비교하는 값들이 모두 True여야 결과가 True
        System.out.println(pasta && steak && risotto);

    }
}
