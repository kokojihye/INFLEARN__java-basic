package java_basic.chap_06_Method;

public class _03_Return {
    //호텔 전화번호
    public static String getPhoneNumber(){
        String phoneNumber = "02-2323-4545";
        return phoneNumber;
    }
    //호텔 주소
    public static String getAddress(){
        String Address = "서울시 노원구 공릉동";
        return Address;
    }
    //호텔 액티비티
    public static String getActivities(){
        return "볼링장, 당구장, 노래방";
    }
    public static void main(String[] args) {
        //반환값, Return
        String hotelNumber = getPhoneNumber();
        System.out.println("호텔 전화번호: "+hotelNumber);

        String hotelAddress = getAddress();
        System.out.println("호텔 주소: "+hotelAddress);

        String hotelActivities = getActivities();
        System.out.println("호텔 액티비티: "+hotelActivities);
    }
}
