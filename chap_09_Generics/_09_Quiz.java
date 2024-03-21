package java_basic.chap_09_Generics;

import java.util.ArrayList;
import java.util.List;

public class _09_Quiz {
    public static void main(String[] args) {
        List<Student> arr = new ArrayList<>();
        arr.add(new Student("유재석", "파이썬"));
        arr.add(new Student("박명수", "자바"));
        arr.add(new Student("김종국", "자바"));
        arr.add(new Student("조세호", "C"));
        arr.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("------------------");
        for (Student std : arr) {
            if (std.certification.equals("자바")) {
                System.out.println(std.name);
            }
        }

    }

}

class Student {
    public String name;
    public String certification;

    public Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }

}
