package java_basic.chap_07_Class;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이"; //까망이(최신형)으로 모델명을 변경해보기
        b1.appendModelName("(최신형)");
        System.out.println(b1.modelName);
    }
}
