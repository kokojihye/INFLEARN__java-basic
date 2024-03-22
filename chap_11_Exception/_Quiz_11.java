package java_basic.chap_11_Exception;

public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 2;

        try{
            switch (errorCode) {
                case 0 :
                    System.out.println("상품 구매를 완료하였습니다.");
                    break;
                case 1 :
                    throw new NotOnSaleException("상품 구매 가능 시간이 아닙니다.");
                case 2:
                    throw new OutOfStockException("해당 상품은 매진되었습니다.");
            }
        } catch (NotOnSaleException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }
        finally {
            System.out.println("이용해 주셔서 감사합니다.");
        }
    }
}

class NotOnSaleException extends Exception {
    public NotOnSaleException(String message) {
        super(message);
    }
}

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}