import java.util.stream.Collectors;

public class StreamsLambda {
//    exercise3.getUniqueNumbers(integers).size() == integers.stream().distinct().collect(Collectors.toSet()).size()
//    students.removeIf(s -> s.getGpa() < gpa);
//    integers.stream().distinct().collect(Collectors.toList())
//    studentsMap.values().removeIf(student -> student.toString().contains(value));

//     titlePosts.forEach(title -> titleList.add(title.getText()));

    /**
    Пример использования лямбда-выражения для сортировки списка:

    List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
numbers.sort((a, b) -> a.compareTo(b));

    В этом примере мы используем метод sort для сортировки списка целых чисел. В качестве аргумента мы передаем лямбда-выражение, которое сравнивает два числа и возвращает результат в соответствии с порядком сортировки.

    Пример использования лямбда-выражения для фильтрации списка:

    mathematica

    List<String> words = Arrays.asList("hello", "world", "java", "programming");
    List<String> filteredWords = words.stream().filter(s -> s.startsWith("j")).collect(Collectors.toList());

    В этом примере мы используем метод filter для фильтрации списка строк. В качестве аргумента мы передаем

     Пример использования лямбда-выражения для преобразования списка:

     mathematica

     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     List<String> stringNumbers = numbers.stream().map(n -> Integer.toString(n)).collect(Collectors.toList());

     В этом примере мы используем метод map для преобразования списка целых чисел в список строк. В качестве аргумента мы передаем лямбда-выражение, которое преобразует каждое число в строку.

     Пример использования лямбда-выражения для создания потока:

     scss

     Stream<Integer> numbers = Stream.iterate(0, n -> n + 1);
     List<Integer> evenNumbers = numbers.filter(n -> n % 2 == 0).limit(10).collect(Collectors.toList());

     В этом примере мы используем метод iterate для создания потока целых чисел, начиная с 0 и увеличивая на 1 при каждой итерации. Затем мы используем методы filter и limit, чтобы оставить только четные числа и ограничить список до 10 элементов.

     Пример использования лямбда-выражения для реализации интерфейса:

     csharp

     interface Calculator {
     int calculate(int a, int b);
     }

     public class Main {
     public static void main(String[] args) {
     Calculator add = (a, b) -> a + b;
     Calculator subtract = (a, b) -> a - b;
     System.out.println(add.calculate(5, 3)); // Output: 8
     System.out.println(subtract.calculate(5, 3)); // Output: 2
     }
     }

     В этом примере мы определяем интерфейс Calculator, который имеет метод calculate для выполнения математических операций.
     Затем мы создаем объекты лямбда-выражений, чтобы реализовать этот интерфейс и выполнить операции сложения и вычитания.

     Пример использования лямбда-выражения в качестве замыкания:

     arduino

     public class Main {
     public static void main(String[] args) {
     int x = 10;
     Runnable r = () -> {
     System.out.println(x);
     };
     x = 5;
     r.run(); // Output: 5
     }
     }

     В этом примере мы создаем лямбда-выражение внутри метода main и используем его в качестве замыкания для переменной x.
     Затем мы изменяем значение x и вызываем метод run у замыкания, чтобы вывести новое значение переменной.

     Пример использования лямбда-выражения в качестве параметра метода:

     typescript

     public class Main {
     public static void main(String[] args) {
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     processNumbers(numbers, n -> System.out.println(n));
     }

     public static void processNumbers(List<Integer> numbers, Consumer<Integer> action) {
     for (Integer n : numbers) {
     action.accept(n);
     }
     }
     }

     В этом примере мы создаем метод processNumbers, который принимает список целых чисел и объект функционального интерфейса Consumer<Integer> в качестве параметров. Затем мы вызываем этот метод, передавая список чисел и лямбда-выражение, которое выводит каждое число на экран.

     Пример использования лямбда-выражения для обработки исключений:

     csharp

     public class Main {
     public static void main(String[] args) {
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     numbers.forEach(n -> {
     try {
     int result = 10 / n;
     System.out.println(result);
     } catch (ArithmeticException e) {
     System.out.println("Division by zero");
     }
     });
     }
     }

     В этом примере мы используем метод forEach, чтобы перебрать список целых чисел и выполнить лямбда-выражение для каждого элемента.
     Внутри лямбда-выражения мы делаем математическое деление на число и обрабатываем исключение ArithmeticException, если число равно 0.

     Пример использования лямбда-выражения для объединения строк:

     typescript

     public class Main {
     public static void main(String[] args) {
     List<String> words = Arrays.asList("Hello", "world", "Java", "programming");
     String concatenated = words.stream().reduce("", (a, b) -> a + " " + b);
     System.out.println(concatenated); // Output: " Hello world Java programming"
     }
     }

     В этом примере мы используем метод reduce для объединения строк из списка.
     В качестве аргументов мы передаем пустую строку в качестве начального значения и лямбда-выражение,
     которое объединяет две строки с пробелом между ними.

     Пример использования лямбда-выражения для сравнения объектов:

     typescript

     public class Main {
     public static void main(String[] args) {
     List<String> words = Arrays.asList("hello", "world", "Java", "programming");
     words.sort((a, b) -> a.compareToIgnoreCase(b));
     System.out.println(words); // Output: [hello, Java, programming, world]
     }
     }

     В этом примере мы используем метод sort для сортировки списка строк. В качестве аргумента мы передаем лямбда-выражение,
     которое сравнивает две строки без учета
}
     Пример использования лямбда-выражения в потоке данных:

     arduino

     public class Main {
     public static void main(String[] args) {
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
     System.out.println(sum); // Output: 6
     }
     }

     В этом примере мы используем поток данных для фильтрации четных чисел из списка и вычисления их суммы. Мы передаем лямбда-выражение в метод filter, которое проверяет, является ли число четным, и метод mapToInt, который преобразует объекты Integer в примитивы типа int. Затем мы вызываем метод sum, чтобы вычислить сумму чисел.

     Пример использования лямбда-выражения для создания объектов:

     typescript

     public class Main {
     public static void main(String[] args) {
     Supplier<String> supplier = () -> "Hello, world!";
     String message = supplier.get();
     System.out.println(message); // Output: "Hello, world!"
     }
     }

     В этом примере мы создаем объект функционального интерфейса Supplier<String>, который возвращает строку "Hello, world!". Затем мы вызываем метод get, чтобы получить значение из объекта Supplier.

     Пример использования лямбда-выражения для сокращения кода:

     arduino

     public class Main {
     public static void main(String[] args) {
     List<String> words = Arrays.asList("hello", "world", "Java", "programming");
     words.forEach(word -> System.out.println(word));
     }
     }

     В этом примере мы используем лямбда-выражение для вывода каждого элемента списка на экран. Это пример того, как использование лямбда-выражений может сократить код и сделать его более читабельным.

     Пример использования лямбда-выражения для сортировки объектов по нескольким полям:

     arduino

     public class Main {
     public static void main(String[] args) {
     List<Person> people = Arrays.asList(
     new Person("John", "Doe", 30),
     new Person("Jane", "Doe", 25),
     new Person("John", "Smith", 40),
     new Person("Jane", "Smith", 35)
     );
     people.sort((p1, p2) -> {
     int result = p1.getFirstName().compareTo(p2.getFirstName());
     if (result == 0) {
     result = p1.getLastName().compareTo(p2.getLastName());
     }
     return result;
     });
     System.out.println(people);
     }
     }

     class Person {
     private String firstName;
     private String lastName;
     private int age;

     public Person(String firstName, String lastName, int age) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
     }

     // getters and setters

     @Override
     public String toString() {
     return firstName + " "



     public class Main {
     public static void main(String[] args) {
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     try {
     numbers.forEach(number -> {
     int result = 10 / number;
     System.out.println(result);
     });
     } catch (ArithmeticException e) {
     System.err.println("Error: division by zero");
     }
     }
     }

     В этом примере мы используем лямбда-выражение для вычисления результата деления на каждый элемент списка. Также мы используем конструкцию try-catch, чтобы обработать возможное исключение ArithmeticException, возникающее при попытке деления на ноль.

     Пример использования лямбда-выражения для рекурсивной обработки данных:

     csharp

     public class Main {
     public static void main(String[] args) {
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     int sum = recursiveSum(numbers);
     System.out.println(sum); // Output: 15
     }

     private static int recursiveSum(List<Integer> numbers) {
     if (numbers.isEmpty()) {
     return 0;
     } else {
     return numbers.get(0) + recursiveSum(numbers.subList(1, numbers.size()));
     }
     }
     }

     В этом примере мы используем лямбда-выражение для рекурсивного вычисления суммы элементов списка.
     Мы определяем метод recursiveSum, который принимает список чисел и рекурсивно вычисляет сумму элементов, пока список не станет пустым.

     Пример использования лямбда-выражения для обработки потоков данных в параллельном режиме:

     arduino

     public class Main {
     public static void main(String[] args) {
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     int sum = numbers.parallelStream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
     System.out.println(sum); // Output: 6
     }
     }

     В этом примере мы используем поток данных в параллельном режиме для фильтрации четных чисел из списка и вычисления их суммы.
     Мы вызываем метод parallelStream, чтобы получить параллельный поток данных, а затем используем лямбда-выражения для фильтрации и преобразования элементов списка.

     public class Main {
     public static void main(String[] args) {
     Runnable runnable = () -> {
     System.out.println("Hello, World!");
     };

     Thread thread = new Thread(runnable);
     thread.start(); // Output: Hello, World!
     }
     }

     В этом примере мы используем лямбда-выражение для создания анонимного класса, который реализует интерфейс Runnable. Затем мы создаем объект класса Thread и передаем ему экземпляр анонимного класса, чтобы запустить новый поток выполнения.

     Пример использования лямбда-выражения для обработки событий мыши в графическом интерфейсе:

     java

     public class Main {
     public static void main(String[] args) {
     Button button = new Button("Click me!");
     button.setOnAction(event -> {
     System.out.println("Button clicked!");
     });

     VBox root = new VBox(button);
     Scene scene = new Scene(root, 300, 250);
     Stage stage = new Stage();
     stage.setScene(scene);
     stage.show();
     }
     }

     В этом примере мы используем лямбда-выражение для обработки события нажатия кнопки в графическом интерфейсе.
     Мы создаем экземпляр класса Button и устанавливаем на него обработчик событий, который будет вызываться при каждом нажатии на кнопку.
     Обработчик событий реализован в виде лямбда-выражения, которое выводит сообщение на кон

     */
}
