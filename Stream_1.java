package HW;

import java.util.List;
import java.util.stream.Stream;

public class Stream_1 {
    public static void main(String[] args) {
        List<String> names = List.of("1루수", "2루수", "3루수", "유격수", "좌익수", "우익수");

        Stream<String> s = names.stream();
        s.filter(n -> n.charAt(0) < '우').forEach(n -> System.out.print(n + " "));
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
    }
}
