package java_basic.chap_11_Exception;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        writeFile();
    }

    public static void writeFile() {
        try {
            FileWriter writer = new FileWriter("test.txt");
            throw new IOException("파일 쓰기에 실패했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("writeFile 메소드 내에서 자체 해결했어요.");
        }
    }
}
