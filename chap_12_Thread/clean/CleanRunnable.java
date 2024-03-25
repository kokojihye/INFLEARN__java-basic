package java_basic.chap_12_Thread.clean;

public class CleanRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("-- 직원 청소 시작 (Runnable) --");
        for (int i = 2; i <= 10; i+= 2) {
            System.out.println("직원 " + i + "번 방 청소 중(Runnable)");
        }
        System.out.println("-- 직원 청소 끝 (Runnable) --");
    }
}
