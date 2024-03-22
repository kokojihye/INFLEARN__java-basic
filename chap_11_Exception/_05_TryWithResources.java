package java_basic.chap_11_Exception;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer = null;
        try{
            writer = new MyFileWriter();
            writer.write("아이스크림 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("===========================");

        // try ()에서 객체 생성하면 자동으로 close()를 호출해줌(MyFileWriter 에 AutoCloseable 을 implements 해줬기 떄문)
        try(MyFileWriter writer1 = new MyFileWriter()) {
            writer1.write("빵이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다. ");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용은 " + line);
    }
}