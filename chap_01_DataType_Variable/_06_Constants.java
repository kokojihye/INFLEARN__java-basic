package java_basic.chap_01_DataType_Variable;

public class _06_Constants {
    public static void main(String[] args) {
        String KR_COUNTRY_CODE ="+82"; //국가번호
        KR_COUNTRY_CODE = "+8282"; //바뀌지 않아야 하는 국가번호가 변경됨 -> 상수로 만들어주어야 함
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592; //원주율
        final String DATE_OF_BIRTH = "2000-04-29"; //생일, 상수는 변수명 단어를 _를 이용해 띄어준다(가독성)
    }
}
