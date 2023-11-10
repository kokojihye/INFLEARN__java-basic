package java_basic.chap_01_DataType_Variable;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "지혜";
        int hour;
        hour=15;
        System.out.println(name +"님, 배송이 시작됩니다. "+ hour +"시에 방문 예정입니다.");
        System.out.println(name +"님, 배송이 완료되었습니다.");

        double score =90.5;
        char grade ='A';
        name="임광현";
        System.out.println(name+"님의 평균 점수는 "+score+"점입니다.");
        System.out.println("학점은 "+grade+"입니다.");

        boolean pass =true;
        System.out.println("이번 시험에 합격했을까요?: "+pass);

        double d = 3.14123456678;
        float f = 3.14123456789f; //float자료형에 실수값 넣을 때 F나 f입력
        System.out.println(d);
        System.out.println(f); //정밀한 소수값 계산할 때 적합하지 않음

        long l=1000000000000L;
        System.out.println(l);
    }
}
