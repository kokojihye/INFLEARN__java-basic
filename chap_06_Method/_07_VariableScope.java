package java_basic.chap_06_Method;

public class _07_VariableScope {
    public static void methodA(){
//        System.out.println(num);
    }
    public static void main(String[] args) {
        int num = 3;
        //메소드 내에서 선언된 변수는 해당 메소드 내에서만 사용 가능하다(지역변수)
    }
}
