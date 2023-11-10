package java_basic.chap_05_Array;

public class _Quiz_05 {
    public static void main(String[] args) {
        //퀴즈5: 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오.
        //조건1. 신발 사이즈는 250부터 295까지 5단위로 증가
        //조건2. 신발 사이즈 수는 총 10가지
        //실행 결과
        /*
            사이즈 250(재고 있음)
            사이즈 255(재고 있음)
            사이즈 260(재고 있음)
            ...
            사이즈 295(재고 있음)
        */
        System.out.println("------------------------------");
        System.out.println("내 풀이");
        int shoesArray[] = new int[10];
        int shoessize = 250;
        for (int i = 0; i <shoesArray.length; i++) {
            shoesArray[i] = shoessize;
            shoessize += 5;
            System.out.println("사이즈 " + shoesArray[i] + "(재고 있음)");
        }
        System.out.println("------------------------------");
        System.out.println("해설 풀이");
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size : sizeArray){
            System.out.println("사이즈 " + size + "(재고 있음)");
        }
    }
}
