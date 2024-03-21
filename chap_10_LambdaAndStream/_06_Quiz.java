package java_basic.chap_10_LambdaAndStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _06_Quiz {
    public static void main(String[] args) {
        List<Visitor> visitors = new ArrayList<>();
        visitors.add(new Visitor("챈들러", 50));
        visitors.add(new Visitor("레이첼", 42));
        visitors.add(new Visitor("모니카", 21));
        visitors.add(new Visitor("벤자민", 18));
        visitors.add(new Visitor("제임스", 5));

        Stream<Visitor> visitorStream = visitors.stream();

        System.out.println("미술관 입장료");
        System.out.println("=======================");
        visitorStream
                .map(visitor -> visitor.age >= 20 ? visitor.name + " 5000원" : visitor.name + " 무료")
                .forEach(System.out::println);
    }
}

class Visitor{
    public String name;
    public Integer age;

    public Visitor(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}