package java_basic.chap_09_Generics;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("none");
        list.add("banana");
        list.add("none");
        list.add("cashew nuts");
        list.add("none");

        for (String s : list) {
            System.out.println(s);
        }
        printDivider();

        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        printDivider();

        iterator = list.iterator(); // 커서를 처음 위치로 이동
        printIterator(iterator);

        printDivider();

        iterator = list.iterator();
        printIterator(iterator);

        printDivider();

        iterator = list.iterator();
        while(iterator.hasNext()) {
            String s = iterator.next();
            if(s.contains("none")) {
                iterator.remove();
            }
        }

        iterator = list.iterator();
        printIterator(iterator);

        printDivider();

        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");

        Iterator<String> itSet = set.iterator();
        while(itSet.hasNext()) {
            System.out.println("itSet: " + itSet.next());
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);

        // map.iterator() -> 적용되지 않음
        Iterator<String> itMapKey = map.keySet().iterator();
    }

    public static void printDivider() {
        System.out.println("==================================");
    }

    public static void printIterator(Iterator<String> iterator) {
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
