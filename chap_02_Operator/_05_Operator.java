package java_basic.chap_02_Operator;

public class _05_Operator {
    public static void main(String[] args) {
        //삼항 연산자: (조건) ? (조건=true) : (조건=false)
        int x = 12;
        int y = 10;
        int max = (x > y)? x : y;
        System.out.println(max);

        boolean b = (x == y) ? true : false;
        System.out.println(b); //false
    }
}
