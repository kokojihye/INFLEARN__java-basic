package java_basic.chap_08_AbstractClass_Interface.camera;

public abstract class Camera {
    public void takePircture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo(){
        System.out.println("비디오를 녹화합니다.");
    }

    public abstract void showMainFeature(); //구현해야 하는 메소드(자식메소드에서)

}
