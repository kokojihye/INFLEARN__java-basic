package java_basic.chap_08_AbstractClass_Interface.detector;

public class FireDetector implements Detectable {
    @Override
    public void detect() {
        System.out.println("일반 성능으로 화재를 감지합니다.");
    }
}
