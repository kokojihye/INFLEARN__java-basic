package java_basic.chap_01_DataType_Variable;

public class _08_Quiz_01 {
    //퀴즈1. 버스 도착 정보를 출력하는 프로그램을 작성하시오. 각 정보는 적절한 자료형의 변수에 정의합니다.
    //정보1. 버스 번호는 "1234", "상암08"과 같은 형태
    //정보2. 남은 거리는 분 단위(예: 3분, 5분)
    //정보3. 남은 거리는 km단위(예: 1.5km, 0.8km)
    public static void main(String[] args) {
        String bus1 = "상암08 버스";
        int time1 = 3;
        double distance1 = 1.2;

        String bus2 = "1234 버스";
        int time2 = 5;
        double distance2 = 2.1;

        System.out.println(bus1+"\n약 "+ time1 +"분 후 도착\n남은 거리"+distance1+"km\n");
        System.out.println(bus2+"\n약 "+ time2 +"분 후 도착\n남은 거리"+distance2+"km\n");
    }
}
