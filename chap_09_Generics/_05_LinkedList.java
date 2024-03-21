package java_basic.chap_09_Generics;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("정준하");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("=================================");

        // 추가
        list.addFirst("서장훈");
        printList(list);

        System.out.println("=================================");

        list.addLast("김희철");
        printList(list);

        System.out.println("=================================");

        //입력한 인덱스에 값이 들어가고, 기존 인덱스에 있는 값들은 +1 된다.
        list.add(1, "김영철");

        list.addLast("김희철");
        printList(list);
        System.out.println("=================================");

        // 삭제
        System.out.println("남은 학생 수 : " + list.size());
        list.remove(list.size()-1);
        System.out.println("남은 학생 수 : " + list.size());
        System.out.println("=================================");

        // 1번 학생과 마지막 학생전학
        System.out.println("남은 학생 수 : " + list.size());
        printList(list);
        list.removeFirst();
        list.removeLast();
        System.out.println("=================================");
        System.out.println("남은 학생 수 : " + list.size());
        printList(list);
        System.out.println("=================================");
        System.out.println(list.get(0));
        list.set(0, "이수근");
        System.out.println(list.get(0));
        System.out.println("=================================");

        list.clear();

        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("정준하");
        list.add("정준하");
        list.add("정준하"); //리스트는 중복 데이터 허용

        Collections.sort(list); // 정렬
        printList(list);

    }
    public static void printList(LinkedList<String> list) {
        for(String s : list) {
            System.out.println(s);
        }
    }
}


