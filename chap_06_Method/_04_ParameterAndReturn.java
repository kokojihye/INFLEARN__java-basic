package java_basic.chap_06_Method;

public class _04_ParameterAndReturn {
    public static int getPower(int num){
        int result = num * num;
        return result;
        //return num * num;
    }

    public static int getPowerByExp(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        //전달값과 반환값이 함께 있는 메소드
        int returnVal = getPower(2);
        System.out.println(returnVal); //2 * 2 = 4

        returnVal = getPower(3);
        System.out.println(returnVal);//3 * 2 = 9

        returnVal = getPowerByExp(3, 3);
        System.out.println(returnVal); //3 * 3* 3 = 27

        returnVal = getPowerByExp(2, 4);
        System.out.println(returnVal);//2 * 2 * 2 * 2 = 듦16
    }
}
