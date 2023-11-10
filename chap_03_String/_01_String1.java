package java_basic.chap_03_String;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase()); //소문자 -> 대문자 변환
        System.out.println(s.toLowerCase()); //대문자 -> 소문자 변환

        //포함 관계
        System.out.println(s.contains("Java"));// 변수명.contains("찾는 문자")가 포함되면 true를 return
        System.out.println(s.contains("C#")); // 변수명.contains("찾는 문자")가 포함되지 않으면 false를 return
        System.out.println(s.indexOf("Java")); //"Java"라는 문자열의 위치 return
    }
}
