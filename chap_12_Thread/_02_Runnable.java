package java_basic.chap_12_Thread;

import java_basic.chap_12_Thread.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        cleanByBoss();
    }
    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("사장 " + i + "번 방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
