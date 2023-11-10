package java_basic.chap_08_AbstractClass_Interface;

import java_basic.chap_08_AbstractClass_Interface.camera.FactoryCam;
import java_basic.chap_08_AbstractClass_Interface.detector.AdvancedFireDetector;
import java_basic.chap_08_AbstractClass_Interface.detector.Detectable;
import java_basic.chap_08_AbstractClass_Interface.detector.FireDetector;
import java_basic.chap_08_AbstractClass_Interface.reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        //추상클래스: 미완성된 클래스(세부화 되지 않은 클래스)
        //인터페이스: 뼈대만 제공하는 클래스

        //추상클래스의 특징
        // 1. 단일상속 (extends): 부모를 하나만 가질 수 있음

        //인터페이스 연습1
        //NormalReporter
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable normalReporter2 = new NormalReporter();
        normalReporter2.report();

        //VideoReporter
        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        Reportable videoReporter2 = new VideoReporter();
        videoReporter2.report();

        System.out.println("====================================");

        //인터페이스 연습2
        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("====================================");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(normalReporter);

        factoryCam.detect();
        factoryCam.report();





    }
}
