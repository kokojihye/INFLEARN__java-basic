package java_basic.chap_09_Generics;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크(List, Set, Map)
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("정준하");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("=================================");

        // 데이터 삭제
        System.out.println("신청 학생 수 : " + list.size());
        list.remove("박명수");
        System.out.println("신청 학생 수 : " + list.size());
        System.out.println(list.get(3));

        list.remove(list.size() - 1);
        System.out.println("신청 학생 수 : " + list.size());

        System.out.println("=================================");
        // 순회
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=================================");

        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0, "이수근"); // list.set(index, value);
        System.out.println("수강권 양도 후 : " + list.get(0));

        System.out.println("=================================");
        System.out.println(list.indexOf("김종국"));
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("=================================");

        list.clear();
        if(list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다");
        }
        System.out.println("=================================");

        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("정준하");

        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=================================");
    }
}
