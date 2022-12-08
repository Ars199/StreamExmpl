import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //IntStream rangeS = IntStream.range(9, 91); // 9 … 90
        //Stream<String> generateStream = Stream.generate(() -> "f5");
        //System.out.println(generateStream);
        //String[] arr = {"f5","b6","z7"};
        //Stream<String> arrS = Arrays.stream(arr);

        Integer[] sums = new Integer[] {1, 2, 3};// [5];
        Arrays.stream(sums).forEach(System.out::println);

        Stream<Integer> iterStream = Stream.iterate(1, m -> m + 1); // адаем начальное значение, след +1
        Stream.of("3", "4", "5").map(Integer::parseInt).map(x -> x + 10).forEach(System.out::print);

        /*

        Источник            Способ                      Пример

        Коллекция	--                   collection.stream()  --     Collection<String> collection = Arrays.asList("f5", "b6", "z7");
        Значения	--                   Stream.of(v1,… vN)	 --     Stream<String> valuesS = Stream.of("f5", "b6", "z7");
        Примитивы	--                   IntStream.of(1, … N) -- 	IntStream intS = IntStream.of(9, 8, 7);
        Массив	 --                      Arrays.stream(arr)	 --     String[] arr = {"f5","b6","z7"}; Stream<String> arrS = Arrays.stream(arr);
        Файл — каждая новая строка
         становится элементом     --     Files.lines(file_path) --  Stream<String> fromFileS = Files.lines(Paths.get("doc.txt"))

        Если требуется параллельный стрим, то просто напишите collection.parallelStream()
         */
        /*
        В Java 8 Stream API доступны методы двух видов — конвейерные и терминальные
        Конвейерные - промежуточные/много - Конвейерных методов в стриме может быть много. Терминальный метод — только один. После его выполнения стрим завершается.
        Метод                                   Что сделает                                     	Использование
        filter --   фильтр, вернет значения, которые подходят под заданное условие --   collection.stream().filter(«e22»::equals).count();

        sorted --   отсортирует элементы в естественном порядке; можно использовать Comparator	-- collection.stream().sorted().collect(Collectors.toList())

        limit --    лимитирует вывод по тому, количеству, которое вы укажете	--  collection.stream().limit(10).collect(Collectors.toList())

        skip --     пропустит указанное вами количество элементов	--  collection.stream().skip(3).findFirst().orElse("4")

        distinct -- найдет и уберет элементы, которые повторяются; вернет элементы без повторов
        map -- выполнит действия над каждым элементом; вернет элементы с результатами функций	-- Stream.of("3", "4", "5").map(Integer::parseInt).map(x -> x + 10).forEach(System.out::println);
        ...
         */
        /*
        Терминальные

        findFirst --    вернет элемент, соответствующий условию, который стоит первым	 -- collection.stream().findFirst().orElse("10")

        findAny --  вернет любой элемент, соответствующий условию --    collection.stream().findAny().orElse("10")

        collect --  соберет результаты обработки в коллекции и не только	--  collection.stream().filter((s) -> s.contains("10")).collect(Collectors.toList())

        count --    посчитает и выведет, сколько элементов, соответствующих условию	 -- collection.stream().filter("f5"::equals).count()
        ...
        allMatch
        min/max  collection.stream().max(String::compareTo).get()   collection.stream().min(String::compareTo).get()
        forEach
        forEachOrdered
        toArray --
        reduce -- преобразует все элементы в один объект	--  collection.stream().reduce((c1, c2) -> c1 + c2).orElse(0)
          */
        /*
        toList — стрим приводится к списку;
toCollection — получаем коллекцию;
toSet — получаем множество;
toConcurrentMap, toMap — если нужен map;
summingInt, summingDouble, summingLong — если требуется получить сумму чисел;
averagingInt, averagingDouble, averagingLong — если хотите вернуть среднее значение;
groupingBy — если необходимо разбить коллекцию на части
         */
        /*
        isParallel	скажет, параллельный стрим или нет	someStream.isParallel()
parallel	сделает стрим параллельным или вернет сам себя	someStream = stream.parallel()
sequential	сделает стрим  последовательным или вернет сам себя	someStream = stream.sequential()
         */



    }
}