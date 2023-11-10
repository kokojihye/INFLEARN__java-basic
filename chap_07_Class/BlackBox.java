package java_basic.chap_07_Class;

public class BlackBox {
    //모델명
    String modelName;
    //해상도
    String resolution;
    //가격
    int price;
    //색상
    String color;
    //시리얼 넘버
    int serialNumber;
    //시리얼 번호를 생성(처음엔 0이었다가 ++연산을 통해 숫자 변경), 모든 객체에서 공통으로 사용하므로 static!
    static int counter = 0;
    //자동 신고 기능
    static boolean canAutoReport = false;

    //객체가 생성될 때 자동으로 호출되는 메소드
    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다: " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color){
//        this(); //기본 생성자 호출
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }
    void autoReport(){
        if (canAutoReport){ //(canAutoReport == true)와 같은 의미
            System.out.println("충돌이 감지되어 자동으로 신고됩니다.");
        } else{
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { //일반 영상
            return 9; //일반 영상의 갯수
        } else if (type == 2) {//이벤트 영상
            return 2; //이벤트 영상의 갯수
        }
        return 11;
    }

    void record(boolean showDataTime, boolean showSpeed, int min) {
        //showDataTime: 날짜정보 표시여부
        //showSpeed: 속도정보 표시여부
        //min: 영상 기록 단위(분)

        System.out.println("녹화를 시작합니다.");
        if (showDataTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
        System.out.println("----------------------------");
    }

    void record(){
        //record메소드에 전달인자가 없을 때 기본 값
        record(true, true, 5);
    }

    static void callServiceCenter() {
        //static이 붙은 경우 모든 객체에 공통으로 적용됨.
        System.out.println("서비스센터(1588-0000)로 연결합니다.");
        //modelName = "test"; (ERROR)
        canAutoReport = false;

        /*
            static으로 선언한 클래스 변수는 static 메소드 내에서 바로 사용 가능하다!
            하지만 인스턴스 변수는 객체가 만들어지기 전에는 접근이 불가능하다.

            메소드 내에서 인스턴스 변수가 필요없다면 공통적으로 적용되게 사용할 수 있다.
            클래스 메소드?!?!
        */
    }

    public void appendModelName(String modelName) {
        this.modelName += modelName;
        //this를 붙이면 클래스 내(BlackBox)의 modelName에 접근하게 된다.
        //인스턴스 변수와 파라미터가 다르다면 상관없지만, 둘이 같은 경우 this를 통해 구분해주어야 한다.
    }

    //Getter & Seeter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if(resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice(){
        return price;
    }

    void setPrice(int price) {
        if(price < 100000){
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }
    String getColor(){
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
