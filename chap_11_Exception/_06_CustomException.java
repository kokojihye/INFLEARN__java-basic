package java_basic.chap_11_Exception;

public class _06_CustomException {
    public static void main(String[] args) {
        // 사용자 정의 예외
        int age = 17;
        try {
            if (age < 19) {
//                System.out.println("만 19세 미만에게는 판매하지 않습니다.");
                throw new AgeLessThan19Exception("만 19세 미만에게는 판매하지 않습니다.");
            } else {
                System.out.println("주문하신 상품 여기 있습니다.");
            }
        } catch (AgeLessThan19Exception e) {
            System.out.println("미성년자입니다.");
        }catch (Exception e) {
            System.out.println("모든 예외를 처리합니다.");
        }
    }
}

class AgeLessThan19Exception extends Exception {
    public AgeLessThan19Exception(String message) {
        super(message);
    }
}