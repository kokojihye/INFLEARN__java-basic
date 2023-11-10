package java_basic.chap_07_Class;

public class _03_ClassVariable {
    //클래스 변수
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        //특정 범위를 초과하는 충돌 가지 시, 자동 신고 기능 개발 여부
        System.out.println(" - 개발 전 - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);

        //모든 객체에 공통적으로 적용되는 클래스 변수는 클래스명.변수명으로 접근하는 것이 권장되는 방식이다.
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        //기능 개발
        BlackBox.canAutoReport = true;

        System.out.println(" - 개발 후 - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);

        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);
    }
}
