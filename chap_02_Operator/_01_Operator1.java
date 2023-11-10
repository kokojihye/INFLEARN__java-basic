package java_basic.chap_02_Operator;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술연산자

        //일반 연산
        System.out.println(4 + 2); //result: 6
        System.out.println(4 - 2); //result: 2
        System.out.println(4 * 2); //result: 8
        System.out.println(4 / 2); //result: 2, 나눗셈 연산자
        System.out.println(4 % 2); //result: 0, 나머지 연산자

        System.out.println(5 / 2); //result: 2(2.5) -> 정수 간 나눗셈이라 소숫점은 버려짐
        System.out.println(2 / 4); //result: 0(0.5) -> 동일
        System.out.println(5 % 2); //result: 1

        //우선 순위 연산
        System.out.println(2 + 2 * 2); //result: 6
        System.out.println((2 + 2)* 2); //result: 8

        //변수를 이용한 연산

        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);
        c = a % b;
        System.out.println(c);

        //증감연산자 (++, --)
        int val;
        val=10;
        System.out.println(val);
        System.out.println(++val);
        System.out.println(val);
            //result: 10, 11, 11

        val = 10;
        System.out.println(val);
        System.out.println(val++);
        System.out.println(val);
            //result: 10, 10, 11

        val=10;
        System.out.println(val);
        System.out.println(--val);
        System.out.println(val);
        //result: 10, 9, 9

        val = 10;
        System.out.println(val);
        System.out.println(val--);
        System.out.println(val);
        //result: 10, 10, 9


        //은행대기번호 표
        int waiting = 0;
        System.out.println("대기 인원: "+ waiting++ +"명");
        System.out.println("대기 인원: "+ waiting++ +"명");
    }
}
