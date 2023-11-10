package java_basic.chap_07_Class.camera;

public class Camera { //부모클래스
    public String name;

    public Camera() {
        this.name = "카메라";
    }

    //protected: 같은 패키지 내 접근 가능, 다른 패키지는 자식 클래스에서 접근 가능
    protected Camera(String name){
        this.name = name;
    }
    public void takePicture(){
        System.out.println(this.name + ": 사진을 촬영합니다");
    }

    public void recordVideo(){
        System.out.println(this.name + ": 동영상을 녹화합니다");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능: 사진 촬영, 동영상 녹화");
    }
}
