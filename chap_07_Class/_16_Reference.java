package java_basic.chap_07_Class;

import java_basic.chap_07_Class.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        //참조
        //기본 자료형(Primitive Data Types): int, float, double, long, boolean, ...(소문자로 시작)

        int[] i = new int[3];
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]); //0
        }

        double[] d = new double[3];
        for (int j = 0; j < d.length; j++) {
            System.out.println(d[j]); //0.0
        }

        //참조 자료형 (Non-Primitive Reference Data Types): String, Camera, FactoryCam, SpeedCam, ...(대문자로 시작)
        String[] s = new String[3];
        for (int j = 0; j < d.length; j++) {
            System.out.println(s[j]); //null
        }

        Camera[] c = new Camera[3];
        for (int j = 0; j < c.length; j++) {
            System.out.println(c[j]); //null
        }

        ////////////////////////////////////
        System.out.println("---------------------");
        int a = 10;
        int b = 20;
        System.out.println(a); //10
        System.out.println(b); //20

        b=a;
        System.out.println(a); //10
        System.out.println(b); //10

        b=30;
        System.out.println(a); //10
        System.out.println(b); //30

        System.out.println("---------------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();

        c1.name = "카메라1";
        c2.name = "카메라2";

        System.out.println(c1.name); //카메라1
        System.out.println(c2.name); //카메라2

        c2 = c1; //c2객체가 c1객체를 참조한게 됨
        System.out.println(c1.name); //카메라1
        System.out.println(c2.name); //카메라1

        c2.name = "고장난 카메라"; //c2와 c1이 같은 객체를 참조하므로 c1도 함께 바뀜
        System.out.println(c1.name); //고장난 카메라
        System.out.println(c2.name); //고장난 카메라

        changeName(c2);
        System.out.println(c1.name); //잘못된 카메라
        System.out.println(c2.name); //잘못된 카메라

        c2=null; //c1객체를 참조하는 관계를 끊음
        System.out.println(c2.name); //NullPointerException 발생
    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
