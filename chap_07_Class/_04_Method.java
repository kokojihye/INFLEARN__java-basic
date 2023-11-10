package java_basic.chap_07_Class;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport();
        BlackBox.canAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(256);

        //일반 영상: type1
        //이벤트 영상(충돌 감지): type2

        int fileCount = b1.getVideoFileCount(1); //일반 영상
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수 : "+ fileCount + "개");

        fileCount = b1.getVideoFileCount(1) + b1.getVideoFileCount(2);
        System.out.println("모든 영상 파일 수 : " + fileCount + "개");
    }
}
