package by.osinin.classwork.lesson15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) throws IOException {
        List<Integer> values = Arrays.asList(1, 2, 10, 50, 3, 4, 5, 10, 50, 3);
        List<Integer> val2 = List.of(1, 2, 3);
        List<Integer> empyList = Collections.emptyList();
        //empyList.add(1);
        List<Integer> singleElement = Collections.singletonList(1);
        Stream<List<Integer>> listStream = Stream.of(values, values, val2);

        Stream<Integer> valuesStream = values.stream();
        Stream<String> stream = Stream.of("A", "B", "C");
        Stream<String> myRows = Files.lines(Paths.get("car.doc")); //читает все строчки файла и помещает в поток
        Stream<Integer> firstStream = Stream.iterate(0, n -> n + 1);
        Stream<Integer> secondStream = Stream.generate(() -> new Random().nextInt(100));

//        List<Integer> result = firstStream
//                .skip(20) //выкини 2 первых значения
//                .limit(30) //оставить 3 значения
//                .distinct()
//                .peek(x -> System.out.println(x)) //показывает что на этом этапе происходит
//                .sorted((o1, o2) -> o2.compareTo(o1)) //сортирует в обратную сторону
//                .filter(val -> val % 2 == 0) //выкинуть все нечетные
//                .map(x -> x * x)//что бы вывело квадраты
//                .filter(x -> x < 1000) //что бы Х было меньше 1000
//                .collect(Collectors.toList());

        firstStream
                .skip(20) //выкини 2 первых значения
                .limit(30) //оставить 3 значения
                .distinct()
                //.peek(x -> System.out.println(x)) //показывает что на этом этапе происходит
                .sorted((o1, o2) -> o2.compareTo(o1)) //сортирует в обратную сторону
                .filter(val -> val % 2 == 0) //выкинуть все нечетные
                .map(x -> x * x)//что бы вывело квадраты
                .filter(x -> x < 1000) //что бы Х было меньше 1000
                .map(x-> (long) x)
                //.collect(Collectors.toList())
                //.forEach(x -> System.out.println(x));
                //.forEachOrdered(x -> System.out.println(x));
                        .reduce((a,b) -> a*b).ifPresent(x -> System.out.println(x)); //как уменить значения есть в этом потоке



        //System.out.println("Second: " + secondResolt);

        //Set<Integer> integerSet = valuesStream.collect(Collectors.toSet());
        //System.out.println(result);
        //System.out.println(integerSet);


        System.out.println(listStream.flatMap(Collection::stream) //собири числа в один поток
                .filter(x -> x < 3)
                .noneMatch(x -> x % 3 == 0)); //точно ли нет ни одного икса с таким условием
        //.allMatch(x -> x > 1)); //что все числа больше единицы
        //.anyMatch(x -> x >1 )); //если есть число больше единицы скажи true
        //.findAny().orElseThrow()); //найди любое число
        //.findFirst().orElseThrow()); //найти первое число
        //.min((o1, o2) -> o1.compareTo(o2)).orElseThrow()); //найдёт минимальное число (1)
        //.max((o1, o2) -> o1.compareTo(o2)).orElseThrow()); //найдёт максимальное число (50)
        //.count()); //сколько там их осталось
        //.collect(Collectors.toSet());
        //.toList();

    }
}
