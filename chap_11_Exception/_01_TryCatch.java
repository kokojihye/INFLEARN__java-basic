package java_basic.chap_11_Exception;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류: 컴파일 오류 or 런타임 오류

        try {
            // 여기에 시도할 소스 코드
            // System.out.println(3 / 0); : ERROR: / by zero

            Object obj = "test";
            System.out.println((int) obj); // ClassCastException
        } catch (Exception e){
            System.out.println("이런 문제가 발생했어요 -> " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}

class S {
    public void methodA() {
        this.methodA(); // stackOverFLow Error
    }
}