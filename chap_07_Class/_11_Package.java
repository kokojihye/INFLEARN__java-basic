package java_basic.chap_07_Class;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        //패키지 (랜덤클래스)
        Random random = new Random();
        System.out.println("랜덤 정수: " + random.nextInt()); //int의 범위 내에서 정수형 랜덤값 반환
        System.out.println("랜덤 정수 (0 - 9): " + random.nextInt(10)); //0이상 10미만의 정수형 랜덤값 반환
        System.out.println("랜덤 실수: " + random.nextDouble()); //0.0이상 1.0미만의 랜덤값 반환
        //random.nextDouble의 경우 직접적으로 범위 지정이 불가능하다!
        //만약 5.0이상, 10.0미만의 실수를 뽑으려면
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수(5.0 - 10.0): " + (min + (max - min) * random.nextDouble()));
        System.out.println("랜덤 boolean: " + random.nextBoolean());

        //로또 번호를 랜덤으로 뽑으려면? (1 ~ 45)
        System.out.println("로또 번호: " + (random.nextInt(45)+1));

        //Math, Scanner, StringBuilder, StringTokenizer
        //BigInteger, BigDecimal
        //LocalDate, LocalTime, LocalDateTime, DateTimeFormatter, ...
    }
}
