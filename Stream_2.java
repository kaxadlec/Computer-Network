package HW;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_2 {
    public static void main(String[] args) {
        List<String> names = List.of("전소민", "유재석", "지석진", "송지효", "김종국", "양세찬", "하하");
        List<Integer> ages = List.of(37, 51, 57, 42, 47, 37, 44);
        List<Gender> genders = List.of(Gender.여, Gender.남, Gender.남, Gender.여, Gender.남, Gender.남, Gender.남);

        Stream<String> s = names.stream();
        s.filter(n -> n.charAt(0) < '양').forEach(n -> System.out.print(n + " "));
        System.out.println();
        s = names.stream();
        s.sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();
        s = names.stream();
        System.out.println(s.findFirst());
        s = names.stream();
        System.out.println(s.findFirst().get());
        s = names.stream();
        System.out.println(s.count());

        Stream<Integer> si = ages.stream();
        System.out.println(si.reduce(0, (a, b) -> a + b));
        si = ages.stream();
        System.out.println(si.max(Integer::compareTo).get());
        IntStream is = ages.stream().mapToInt(a -> a.intValue());
        System.out.println(is.average().getAsDouble());
    }
}

enum Gender {남, 여}

class Member {
    String name;
    Gender gender;
    int age;

    public Member(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}


