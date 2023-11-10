package java_basic.chap_06_Method;

public class _Quiz_06 {
    //퀴즈6: 개인정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오.
    //조건1. 개인정보를 비공개로 전환하는 메소드 작성
    //조건2. 하나의 메소드에서 모든 동작 처리
    //조건3. 각 정보는 아래 위치부터 비공개 적용
    /*
    * 이름: 2번째 글자(고**)
    * 주민등록번호: 9번째 글자(000429-4******)
    * 전화번호: 10번째 글자(010-3225-****)
    */

    //힌트1. substring(): 문자열의 일부를 자를 수 있다.
    //힌트2. length(): 문자열의 길이를 알 수 있다.

    //내 풀이
    public static String getHiddenData(String value, int num){
        String originalData = value.substring(0, num);
        String hiddenData = value.substring(num, value.length());
        String hiddenString = "";

        for (int i = 0; i < hiddenData.length(); i++) {
            hiddenString += "*";
        }
        return originalData+hiddenString;
    }

    //해설 풀이
    public static String getHiddenData2(String data, int index){
        String hiddenData = data.substring(0, index);
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }
    public static void main(String[] args) {
        String name = "고지혜";
        String id = "000429-4123456";
        String phone = "010-1234-5566";

        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("내 풀이");
        System.out.println("이름: " + getHiddenData(name, 1));
        System.out.println("주민등록번호: " + getHiddenData(id, 8));
        System.out.println("전화번호: " + (getHiddenData(phone, 9)));

        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("");

        System.out.println("해설 풀이");
        System.out.println("이름: " + getHiddenData(name, 1));
        System.out.println("주민등록번호: " + getHiddenData(id, 8));
        System.out.println("전화번호: " + (getHiddenData(phone, 9)));
    }
}
