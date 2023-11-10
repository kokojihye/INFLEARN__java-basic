package java_basic.chap_08_AbstractClass_Interface;

import java_basic.chap_08_AbstractClass_Interface.camera.Camera;
import java_basic.chap_08_AbstractClass_Interface.camera.FactoryCam;
import java_basic.chap_08_AbstractClass_Interface.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        //데이터 추상화 (Data Abstraction): 몰라도 되는 건 숨기고, 꼭 필요한 정보만 공개
        //abstract
        //추상클래스 (아직 완성되지 않은 형태의 클래스 -> 바로 객체 생성 불가능, 반드시 상속 필요!)
        //추상 메소드(추상 클래스 or 인터페이스에서만 사용 가능한, 껍데기만 았는 메소드)

        //Camera camera = new Camera; //Camera는 추상클래스 이므로 객체 생성 X
        //Camera camera = new FactoryCam(); //FactoryCam() 생성자로 만들면 됨

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
