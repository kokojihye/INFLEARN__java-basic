package java_basic.chap_07_Class;

import java.util.Arrays;
import java.util.Random;

public class LottoNum {
    public static void main(String[] args) {
        int[] LottoNum = new int[7];
        Random random = new Random();

        System.out.print("이번주 로또 번호는 ");
        for (int i = 0; i < LottoNum.length; i++) {
            LottoNum[i] = random.nextInt(45)+1;
            for (int j = 0; j < i; j++) {
                if(LottoNum[j] == LottoNum[i]){
                    LottoNum[i] = random.nextInt(45)+1;
                }
            }
        }
        Arrays.sort(LottoNum);
        for (int i = 0; i < LottoNum.length; i++) {
            System.out.print(LottoNum[i] + " ");
        }
        System.out.print("입니다.");
    }
}
