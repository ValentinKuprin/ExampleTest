public class Commands {

/**- коментирование (//)
 *
 * https://devcolibri.com/%D0%B3%D0%BE%D1%80%D1%8F%D1%87%D0%B8%D0%B5-%D0%BA%D0%BB%D0%B0%D0%B2%D0%B8%D1%88%D0%B8-intellij-idea/

 public static void main(Sting[] args) {}       (psvm / main)
 System.out.println(); - вывод в консоль    (sout)

 /n - перенос на другую сторону
 /t - 4 пробела (если есть 1 символ + 3 проб. и тд.)

 Hot keys
 Ctrl + D - Копирует строку (курсов в конце строки)
 Ctrl + Alt + l - выравнивание кода
 Ctrl + Q - Описание функции
 Ctrl + N - Вызвать конструктор
 Shift + F6 - Refactor (изменить имя всех переменных);
 Alt + Shift + U - UpperCase
 Alt + Shift + L - LoverCase
 Ctrl + shift + Up or Down - перенести строку вверх, вниз

 Alt + Enter - импорт, ошибка, возможные варианты
 Alt + insert - Генератор кода

 Специальные команды
 .toString - Преобразовать в строку
 Arrays.deepToString(b) - Распечатать многострочный массив.
 !array[i][j].contains("е") - Массив НЕ содержит букву "e" ("!"- НЕ)


 Integer.mix(x1, x2) - найдет большее (min) меньшее
 x1.compateTo.x2 - сравнивает два значения и выдает 0 если они равны -1 и 1

 boolen   a.equals(b) - сравнить две переменные ()
 compare(int a, int b) (Сравнение (результат 1, 0, -1)
 Short    Short.compare(a, b) - разность
 []       array.lenght - длинна массива
 []       Arrays.toString(переменная) - Содержание массива
 []       Arrays.asList
 []       Arrays.deepToString(переменная) - Содержание многомерного массива
 String   String.valueOf();
 String   str.lenght() - длинна строки
 String   str.isEmpty(); - проверка строки на пустоту  true - пустая /false - непустая
 String     str.toLowerCase() - привести к строчному шрифту
 String     str.toUpperCase() - привести к заглавный шрифту
 String   str.replace("!", "-") - Заменить одно значение на другое (! на -) учитывать регистр.
 String   str.replace (".", "слово") после точки добавить слово
 String   str.repite(i) - повторяет строку n - раз
 String   str.charAt(index) - Обращение к элементу строки, возвращает символ i-позиции начинается с 0, последний lenght-1.
 String   str.indexOf("!") - Поиск элемента в строке (на какое позиции) indexOf("!", 4) - с какой позиции начать (опционально) если ничего не найдено вернет -1.
 String   str.lastIndexOf(!, 2) Поиск элемента в справа на лево (на какое позиции) начиная со 2 позиции, если ничего не найдено вернет -1.
 String   str.substring(1, 4) с какого по какой символ вывести(1вкл., 4 не вкл.) Привет = рив (4-инд не включит.)  (2) - начиная с 3-его = ивет
 str.substring(str.indexOf('a'), str.lastIndexOf('a') +1) - выводит подстроку от первой 'a' вкл до последней 'a' не вкл (+1) для вкл. последней 'а'
 str.substring(1) - выводит подстроку от первого индекса вкл до последнего вкл.
 String   str.trim() - Удалить пробелы перед и после слова.
 String   str.split("-") - позволяет разбить строку на подстроки по определенному разделителю например "-".
 String[] split(String regex) Метод возвращает массив строк. Метод принимает строку regex в качестве параметра.
 String   str.concat("add_words")); // добавить к строке (конкатинация)
 String   str.contains("bc")); // содержит / не содержит "bc"  true / false; учитывать регистр !
 String   str.compareTo(); - лексикографическое сравнение, сравнивает два string
 пример arrayStr[0].compareTo(Character.toString(arrayChar[0])); если arrayStr[0] < Character.toString(arrayChar[0] - -1,
 если arrayStr[0] > Character.toString(arrayChar[0] - +1, если arrayStr[0] = Character.toString(arrayChar[0] - 0
 String   Character.toString('i' - 1); - Печать буквы а не значения символа из ASCII cod
 subtrack
 String.format("%d\n%d\n%d\nПоехали!!!", 3, 2, 1) - для целых чисел
 String.format("%s\n%s\n%s\nПоехали!!!", "3", "two", "one") - для строк

 a.getClass - Вывести класс переменной
 numberInteger instanceof Integer (мы справшиваем этот клас такой то? и получаем ответ true or false)

 Double.parseDouble(str1) - Double.parseDouble(str2)) - разность
 (Double.valueOf(str1) - Double.valueOf(str2)) - разность

 Math

 1+dice.nextInt(6) - Рандомное число 1+ (начинается от 5 и до (6))

 Округление                https://www.youtube.com/watch?v=s9s4uTxSBe4

 Math.floor(10,9) >> Округлит в меньшую сторону до 10.0, -10.9 округлит до -11.0  Тип данных Long, приведение типа (int) перед
 Math.ceil(10.1) - Округлит в большую сторону 11.0, (-10.6) до - 10.0
 Math.round(10.49 \ 10.5) - До 0.5 округлит в меньшую сторону, больше 0.5 в большую сторону -10.5 округлит до -10.
 Math.nextUP / .nextDown
 Math.rint(double a) - возвращает целое число, которое ближайшее по значению аргумента, другими словами — округляет дробь до целого.
 DecimalFormat( "#.###" ) - Строка #.### — это шаблон, который указывает, что мы форматируем передаваемое значение до 3 десятичных знаков.
 Чтобы изменить шаблон после создания объекта DecimalFormat, можно использовать его методы applyPattern и applyLocalizedPattern:

 Math.nextMP(d) - Округление после . - почитать

 Рандомное число            https://www.youtube.com/watch?v=0jTCfOHtYaQ
 ((int)(Math.random()*10)+ 10) - рандомное число от 0 до 1 можно *10 увеличить диапазон до 10-1=9, для целого числа привед. типов.
 + 10 -нижняя граница, верхняя 20-1=19, но если +857, то нижний будет 857, а верхний 866, если пустота и +0, то нижний диапазон =0.
 *10) -20 = от -20 до -11. Если известны границы, нужно посчитать верхняя граница - нижняя + 10...100 = 110-10+1=101 Диапазон от 10 до 0.1
 * -20....-11 -11-(-20)=9 + 1.
 * ((char)((int)(Math.random()*26)+ 65)) - Ранодомная буква от А до Z
 * int let = (int)(Math.random()*26+97 -> System.out.print((char)let) - Рандомная буква от a до z.
 *
 *  Математические операции             https://www.youtube.com/watch?v=rVRZT4RIsYk
 *  Math.sqrt() - Корень квадратный, возвращает double
 *  Math.abs(-8.5) - Абсолютное значение = 8.5 и дабл и инт
 *  Math.pow(5,6) - Возведение в степень 5 в степени 6 вернет double
 *  Math.fma(a b c) - (a+b)*c
 *  Math.max(int a, int b) - Максимальное значение, double and int, только 2 значения Math.max(int c (Math.max(int a, int b)) и тд.
 *  Math.min(int a, int b, ....) - Минимальное значение
 *  Math.PI - 3.141592653589793
 *  MAth.E - 2.718281828459045 Число Элера

 Циклы
 for (int i = 0; i > 5; i = i + i){
 ef(i = 5)
 sout
 } else {
 sout
 }

 int i = 0;
 while (i > 5) {
 Sout
 i = i + 1
 }

 int i = 0;
 do {    - Выполнится хотя бы одно действие до условия !
 sout
 i = 1 + 1

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


 */



 }

