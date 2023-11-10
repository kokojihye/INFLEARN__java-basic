package java_basic.chap_07_Class;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        System.out.println("----------------------------");
        b1.record(false, false, 10);
        b1.record(true, false, 3);
        b1.record(true, true,5);
        //메소드명이 같아도 매개변수가 다르므로 다른 메소드를 호출한 것!
        b1.record();
    }
}
