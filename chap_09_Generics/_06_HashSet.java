package java_basic.chap_09_Generics;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // HashSet:  중복 허용 X, 순서 보장 X
        // LinkedHashSet: 중복 허용 X, 순서 보장 O

        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");
        set.add("삼겹살");

        printSize(set);
        printHashSet(set);
        printDivider();
        hasElement(set, "삼겹살");
        deleteElement(set, "삼겹살");
        hasElement(set, "삼겹살");
        set.clear();
    }

    public static void printSize(HashSet<String> set) {
        System.out.println("총 구매 상품 수 : " + set.size());
    }

    public static void printDivider() {
        System.out.println("==================================");
    }

    public static void printHashSet(HashSet<String> set) {
        for (String s : set) {
            System.out.println(s);
        }
    }

    public static void hasElement(HashSet<String> set, String element) {
        if(set.contains(element)) {
            System.out.println("구매 목록에 " + element + "이(가) 존재합니다.");
        } else{
            System.out.println("구매 목록에 " + element + "이(가) 존재하지 않습니다.");
        }
    }

    public static void deleteElement(HashSet<String> set, String element) {
        if (set.contains(element)) {
            System.out.println(element + "를 구매 목록에서 삭제합니다.");
            set.remove(element);
        } else {
            System.out.println(element + "가 존재하지 않습니다.");
        }
    }
}
