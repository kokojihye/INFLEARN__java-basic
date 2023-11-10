package java_basic.chap_02_Operator;

public class _06_Quiz_02 {
    public static void main(String[] args) {
        //퀴즈2: 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.
        //조건1. 키가 120cm 이상인 경우에만 탑승 가능
        //조건2. 삼항 연산자 이용

        int height1 = 115;
        int height2 = 120;

        String result = (height1 >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가 "+height1+"cm이므로" + result);

        result = (height2 >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가 "+height2+"cm이므로" + result);

    }
}
