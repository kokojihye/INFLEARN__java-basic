package java_basic.chap_10_LambdaAndStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림

        // 1. Arrays.stream
        int[] scores = {100, 96, 93, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);


        // 2.Collection.stream()
        List<String> langList = new ArrayList<>();

        /**
         * Arrays.asList();
         * list에 하나씩 add() 해줄 필요가 없다
         * **/

        //langList.add("python");
        //langList.add("java");
        //langList.add("javascript");

        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        System.out.println("size: " + langList.size());

        Stream<String> langListStream = langList.stream();

        // 3. Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        // 스트림 사용
        // 중간 연산 (Intermediate Operation): filter, map, sorted, distinct, skip
        // 최종 연산 (Terminal Operation): count, min, max, sum, forEach, anyMatch, allMatch

        // 90점 이상인 점수만 출력
        System.out.println("-------------------");
        Arrays.stream(scores)
                .filter(x -> x >= 90)
                .forEach(x -> System.out.println(x));

        System.out.println("-------------------");
        Arrays.stream(scores)
                .filter(x -> x >= 90)
                .forEach(System.out::println);

        // 90점 이상인 사람의 수
        System.out.println("-------------------");
        Long count = Arrays.stream(scores)
                .filter(x -> x >= 90).count();
        System.out.println(count);

        //90점 이상인 점수들의 합
        System.out.println("-------------------");
        int sum = Arrays.stream(scores)
                .filter(x -> x >= 90).sum();
        System.out.println(sum);

        //90점 이상인 점수들을 정렬
        System.out.println("-------------------");
        Arrays.stream(scores)
                .filter(x -> x >= 90).sorted()
                .forEach(System.out::println);

        // C로 시작하는 프로그래밍 언어
        System.out.println("-------------------");
        Arrays.stream(langs)
                .filter(x -> x.toLowerCase().startsWith("c"))
                .forEach(System.out::println);

        // java를 포함하는 프로그래밍 언어
        System.out.println("-------------------");
        Arrays.stream(langs)
                .filter(x -> x.contains("java"))
                .forEach(System.out::println);

        // 4글자 이하의 언어를 정렬
        System.out.println("-------------------");
        langList.stream()
                .filter(x -> x.length() <= 4).sorted()
                .forEach(System.out::println);

        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어
        System.out.println("-------------------");
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .forEach(System.out::println);

        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어
        System.out.println("-------------------");
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);

        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어
        System.out.println("-------------------");
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .allMatch(x -> x.contains("c"));
        System.out.println(allMatch);

        // 4글자 이하의언어 중에서 c 라는 글자를 포함하는 언어 뒤에 "어려워요" 라는 글자를 함꼐 출력
        System.out.println("-------------------");
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + "(어려워요)")
                .forEach(System.out::println);

        // c라는 글자를 포함하는 언어를 대문자로 출력
        System.out.println("-------------------");
        langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // c라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        System.out.println("-------------------");
        List<String> langListStartsWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        langListStartsWithC.stream().forEach(System.out::println);
        System.out.println("-------------------");
    }
}
