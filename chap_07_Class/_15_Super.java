package java_basic.chap_07_Class;

import java_basic.chap_07_Class.camera.FactoryCam;
import java_basic.chap_07_Class.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        //Super: 부모클래스의 요소를 자식클래스에서 사용

        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("-------------------");
        speedCam.takePicture();
    }
}
