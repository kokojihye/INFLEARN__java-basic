package java_basic.chap_07_Class.camera;

//FactoryCam is a Camera(Is-a 관계)
public class FactoryCam extends Camera{ //자식클래스

    public FactoryCam() {
        //this.name="공장카메라";
        //Camera 클래스의 protected Camera 메소드 호출, 부모클래스 생성자 호출
        super("공장카메라");
    }
    public void recordVideo(){
        super.recordVideo(); //부모클래스의 recordVideo 메소드를 그대로 사용
        detectFire(); //자식클래스에서 정의한 추가 기능 사용
    }

    public void detectFire(){
        System.out.println(this.name + ": 화재를 감지합니다");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능: 화재 감지");
    }
}
