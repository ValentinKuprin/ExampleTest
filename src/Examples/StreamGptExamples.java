public class StreamGptExamples {
    /**
     *     map() - Этот метод используется для преобразования одного объекта в другой с помощью предоставленной функции. Например:
     *
     * mathematica
     *
     * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     * List<Integer> squaredNumbers = numbers.stream()
     *                                       .map(num -> num * num)
     *                                       .collect(Collectors.toList());
     *
     * Этот код создает список квадратов чисел из другого списка чисел.
     *
     *     filter() - Этот метод используется для фильтрации элементов из потока на основе предоставленного предиката. Например:
     *
     * mathematica
     *
     * List<String> fruits = Arrays.asList("apple", "banana", "kiwi", "orange", "pineapple");
     * List<String> filteredFruits = fruits.stream()
     *                                     .filter(fruit -> fruit.startsWith("a"))
     *                                     .collect(Collectors.toList());
     *
     * Этот код создает список фруктов, которые начинаются с буквы "a".
     *
     *     reduce() - Этот метод используется для уменьшения потока элементов до одного значения с использованием предоставленной функции аккумулятора. Например:
     *
     * mathematica
     *
     * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     * int sum = numbers.stream()
     *                  .reduce(0, (num1, num2) -> num1 + num2);
     *
     * Этот код вычисляет сумму чисел в списке.
     *
     *     flatMap() - Этот метод используется для "разглаживания" потока из потока элементов в один поток элементов. Например:
     *
     * mathematica
     *
     * List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
     * List<Integer> flattenedList = listOfLists.stream()
     *                                           .flatMap(list -> list.stream())
     *                                           .collect(Collectors.toList());
     *
     * Этот код создает список чисел из списка списков чисел.
     *
     *     distinct() - Этот метод используется для удаления дубликатов из потока элементов. Например:
     *
     * mathematica
     *
     * List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5);
     * List<Integer> distinctNumbers = numbers.stream()
     *                                        .distinct()
     *                                        .collect(Collectors.toList());
     *
     * Этот код создает список чисел, в котором удалены дубликаты.
     *
     *     sorted() - Этот метод используется для сортировки элементов потока на основе предоставленного компаратора. Например:
     *
     * mathematica
     *
     * List<String> fruits = Arrays.asList("apple", "banana", "kiwi", "orange", "pineapple");
     * List<String> sortedFruits = fruits.stream()
     *                                   .sorted((fruit1, fruit2) -> fruit1.compareTo(fruit2))
     *                                   .collect(Collectors.toList());
     *
     * Этот код создает список фруктов, отсортированный в алфавит

     forEach() - Этот метод используется для выполнения операции на каждом элементе потока. Например:

     mathematica

     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     numbers.stream()
     .forEach(num -> System.out.println(num));

     Этот код выведет каждое число из списка на экран.

     peek() - Этот метод используется для выполнения операции на каждом элементе потока, сохраняя при этом исходный порядок элементов. Например:

     mathematica

     List<String> fruits = Arrays.asList("apple", "banana", "kiwi", "orange", "pineapple");
     List<String> filteredFruits = fruits.stream()
     .peek(fruit -> System.out.println("Processing: " + fruit))
     .filter(fruit -> fruit.startsWith("a"))
     .peek(fruit -> System.out.println("Filtered: " + fruit))
     .collect(Collectors.toList());

     Этот код создает список фруктов, которые начинаются с буквы "a", и выводит на экран сообщение о каждой фазе обработки.

     count() - Этот метод используется для подсчета количества элементов в потоке. Например:

     mathematica

     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     long count = numbers.stream()
     .count();

     Этот код подсчитывает количество чисел в списке.

     min() - Этот метод используется для нахождения минимального элемента в потоке на основе предоставленного компаратора. Например:

     mathematica

     List<Integer> numbers = Arrays.asList(5, 1, 4, 2, 3);
     Optional<Integer> minNumber = numbers.stream()
     .min((num1, num2) -> num1.compareTo(num2));

     Этот код находит минимальное число в списке.

     max() - Этот метод используется для нахождения максимального элемента в потоке на основе предоставленного компаратора. Например:

     mathematica

     List<Integer> numbers = Arrays.asList(5, 1, 4, 2, 3);
     Optional<Integer> maxNumber = numbers.stream()
     .max((num1, num2) -> num1.compareTo(num2));

     Этот код находит максимальное число в списке.

     anyMatch() - Этот метод используется для проверки, удовлетворяет ли хотя бы один элемент потока предоставленному предикату. Например:

     mathematica

     List<String> fruits = Arrays.asList("apple", "banana", "kiwi", "orange", "pineapple");
     boolean hasApple = fruits.stream()
     .anyMatch(fruit -> fruit.equals("apple"));

     Этот код проверяет, есть ли в списке фруктов хотя бы одно яблоко.

     allMatch() - Этот метод используется для проверки, удовлетворяют ли все элементы потока предост



     noneMatch() - Этот метод используется для проверки, не удовлетворяет ли ни один элемент потока предоставленному предикату. Например:

     mathematica

     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     boolean noneMatchGreaterThanTen = numbers.stream()
     .noneMatch(num -> num > 10);

     Этот код проверяет, не содержит ли список чисел ни одного числа, большего 10.

     findFirst() - Этот метод используется для нахождения первого элемента потока. Например:

     mathematica

     List<String> fruits = Arrays.asList("apple", "banana", "kiwi", "orange", "pineapple");
     Optional<String> firstFruit = fruits.stream()
     .findFirst();

     Этот код находит первый элемент в списке фруктов.

     findAny() - Этот метод используется для нахождения любого элемента потока. Например:

     mathematica

     List<String> fruits = Arrays.asList("apple", "banana", "kiwi", "orange", "pineapple");
     Optional<String> anyFruit = fruits.stream()
     .filter(fruit -> fruit.length() > 5)
     .findAny();

     Этот код находит любой фрукт в списке, длина которого больше 5 символов.

     reduce() - Этот метод используется для выполнения операции сокращения на элементах потока. Например:

     mathematica

     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     Optional<Integer> sum = numbers.stream()
     .reduce((num1, num2) -> num1 + num2);

     Этот код находит сумму всех чисел в списке.

     flatMap() - Этот метод используется для преобразования каждого элемента потока в другой поток и объединения результатов в один поток. Например:

     mathematica

     List<List<Integer>> numberLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
     List<Integer> flatList = numberLists.stream()
     .flatMap(list -> list.stream())
     .collect(Collectors.toList());

     Этот код преобразует список списков чисел в один список чисел.

     distinct() - Этот метод используется для удаления дубликатов из потока. Например:

     mathematica

     List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5);
     List<Integer> distinctNumbers = numbers.stream()
     .distinct()
     .collect(Collectors.toList());

     Этот код удаляет дубликаты из списка чисел.

     sorted() - Этот метод используется для сортировки элементов потока. Например:

     mathematica

     List<Integer> numbers = Arrays.asList(5, 1, 4, 2, 3);
     List<Integer> sortedNumbers = numbers.stream()
     .sorted()
     .collect(Collectors.toList());

     }
