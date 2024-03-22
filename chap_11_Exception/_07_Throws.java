package java_basic.chap_11_Exception;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메서드에서 해결할게요.");
        }
    }

    public static void writeFile() throws IOException {
        // 방법 1
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("파일 쓰기에 실패했습니다.");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 자체 해결했어요.");
//        }

        // 방법 2
        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일 쓰기에 실패했습니다.");
    }
}
