package java_basic.chap_09_Generics;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵: (Key, Value)
        // HashMap<> :중복 허용 X, 순서 보장 X
        // LinkedHashMap<> : 중복 허용 X, 순서 보장 O
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);

        printSize(map);
        printDivider();

        printPoint(map, "유재석");
        printPoint(map, "박명수");
        printPoint(map, "김종국");

        addPoint(map, "김종국", 7);
        printPoint(map, "김종국");

        addPoint(map, "김영철", 5);
        printPoint(map, "김영철");

        map.remove("유재석");
        System.out.println(map.get("유재석")); //  null 반환

        printDivider();

        printHashMapKey(map);
        printHashMapValue(map);
        printHashMap(map);

        map.clear(); // hashMap 전체 삭제

        printDivider();
        printHashMapKey(map);
    }

    public static void printDivider() {
        System.out.println("==================================");
    }

    public static void printSize(HashMap<String, Integer> map) {
        System.out.println("총 고객 수 : " + map.size());
    }

    public static void printPoint(HashMap<String, Integer> map, String name) {
        System.out.println(name + "님의 포인트 : " + map.get(name));
    }

    public static void addPoint(HashMap<String, Integer> map, String name, Integer point) {
        if (map.containsKey(name)) {
            int myPoint = map.get(name);
            map.put(name, myPoint + point);
        } else {
            map.put(name, point);
        }
    }

    public static void printHashMapKey(HashMap<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }

    public static void printHashMapValue(HashMap<String, Integer> map) {
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }

    public static void printHashMap(HashMap<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println("고객명: " + key + "\t포인트: " + map.get(key));
        }
    }

}
