package java_basic.chap_08_AbstractClass_Interface.camera;

import java_basic.chap_08_AbstractClass_Interface.detector.Detectable;
import java_basic.chap_08_AbstractClass_Interface.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    public Detectable detector;
    public Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        //Camera(abstract class)에서 abstract 메소드를 구현하지 않으면 오류가 난다.
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
