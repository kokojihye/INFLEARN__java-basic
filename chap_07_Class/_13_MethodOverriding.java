package java_basic.chap_07_Class;

import java_basic.chap_07_Class.camera.Camera;
import java_basic.chap_07_Class.camera.FactoryCam;
import java_basic.chap_07_Class.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        //메소드 오버라이딩: 자식클래스에서 부모클래스의 메소드를 덮어쓰기 (재정의)
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
