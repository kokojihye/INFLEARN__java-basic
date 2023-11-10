package java_basic.chap_07_Class;

import org.w3c.dom.ls.LSOutput;

public class _18_Enum {
    public static void main(String[] args) {
        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.println("동영상 녹화 품질");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        System.out.println("------------------------");
        //열거형.values(): 열거형에 정의된 상수들을 하나씩 꺼내어줌
        for(Resolution myRes : Resolution.values()) {
            //변수명.name(): 열거형에 정의된 상수들의 이름을 출력, name()은 생략해도 결과는 같다.
            //ordinal: 열거형 상수가 정의된 순서를 알게됨
            System.out.println(myRes.name() + ": " + myRes.ordinal());
            //System.out.println(myRes + ": " + myRes.ordinal()); //-> .name()을 생략해도 값이 같음을 알 수 있다
        }

        System.out.println("------------------------");
        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + ": "+ myRes.getwidth());
        }
    }
}

enum Resolution{
    HD(1280), FHD(1920), UHD(3840);

    private final int width;
    Resolution(int width){
        this.width = width;
    }

    public int getwidth() {
        return width;
    }
}