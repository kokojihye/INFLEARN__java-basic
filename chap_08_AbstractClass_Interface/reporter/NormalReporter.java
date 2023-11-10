package java_basic.chap_08_AbstractClass_Interface.reporter;

public class NormalReporter implements Reportable {
    @Override
    public void report() {
        System.out.println("일반 화재 신고를 진행합니다.");
    }
}
