package java_basic.chap_07_Class;

import java_basic.chap_07_Class.camera.Camera;
import java_basic.chap_07_Class.camera.FactoryCam;
import java_basic.chap_07_Class.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        //상속
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);
        System.out.println();

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();

    }
}
