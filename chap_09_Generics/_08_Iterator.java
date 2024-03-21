package java_basic.chap_09_Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
