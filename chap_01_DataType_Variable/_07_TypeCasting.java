package java_basic.chap_01_DataType_Variable;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형번환 TypeCasting

        //정수형 -> 실수형
        int score =93;
        System.out.println(score); //result: 93
        System.out.println((float)score); //result: 93.0
        System.out.println((double)score); //result: 93.0

        //실수형 -> 정수형
        float score_f=93.3f;
        double score_d = 98.8;
        System.out.println((int)score_f); //result: 93
        System.out.println((int)score_d); //result: 98

        //정수 + 실수 연산
        score = 93 + (int)98.8; //result: 93+98
        System.out.println(score); //result: 191

        score_d = 93+98.8; //result: 93.0+98.8
        System.out.println(score_d); //reuslt: 191.8

        //변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; //191 -> 191.0
        // int -> long -> float -> double (묵시적 형변환)

        int convertedScoreDouble2 = (int)score_d; //191.8 -> 191
        // double -> float -> long -> int (명시적 형변환)

        System.out.println(score);
        System.out.println(score_d);

        //숫자를 문자열로 형변환하기
        String s1 = String.valueOf(93);
        System.out.println(s1);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        System.out.println(s2);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        //문자열을 숫자로 형변환하기
        int i = Integer.parseInt("93"); //문자열을 파싱한다고 표현
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);

        int error = Integer.parseInt("자바"); //값이 정수가 아니라서 에러 발생
    }
}
