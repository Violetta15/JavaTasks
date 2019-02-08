package HW;

import java.util.Arrays;

public class HW2 {

    public static void main(String[] args) {
        System.out.println(Arr(new int[]{1, 2, 3, 4}));
        System.out.println(Bubble(new int[]{4, 2, 4, 7, 3, 1, 6, 5}));
        System.out.println(intToStr(32));
        System.out.println(flToStr(11.3f));
        System.out.println(strToInt("65"));
        System.out.println(strToD("45.42"));
        System.out.println(shortestWord("Java это сильно типизированный объектно-ориентированный язык программирования"));
        System.out.println(numberOfWords("Jav d sd sdsdsd dddddddddd a"));
        System.out.println(Delete("Java это сильно типизированный объектно-ориентированный язык программирования"));
    }

    /* 1) Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2 */

    public static int[] Arr(int[] ar) {
        int[] A = new int[]{};
        int a = ar[0];
        ar[0] = ar[2];
        ar[2] = a;

        int b = ar[1];
        ar[1] = ar[3];
        ar[3] = b;

        String s = Arrays.toString(ar);
        System.out.println(s);
        return A;
    }

    /* 2) Отсортировать массив (пузырьком (Bubble) */
    public static int[] Bubble(int[] arB) {
        System.out.println(Arrays.toString(arB));
        int tempB;
        for (int i = 0; i < arB.length; i++)
            for (int j = 0; j < arB.length - 1; j++)
                if (arB[j] > arB[j + 1]) {
                    tempB = arB[j];
                    arB[j] = arB[j + 1];
                    arB[j + 1] = tempB;
                }
        System.out.println(Arrays.toString(arB));
        return arB;
    }

    /* 3) Написать функции преобразования:*/
    /*  1. целого числа в строку*/
    public static String intToStr(int k) {
        String str = Integer.toString(k);
        return (str);
    }

    /* 2. вещественного числа в строку*/
    public static String flToStr(float m) {
        return Float.toString(m);
    }

    /* 3. строки в целое число*/
    public static int strToInt(String q) {
        Integer iQ = new Integer(0);
        try {
            iQ = Integer.valueOf(q);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат строки! " + e.getMessage());
        }
        return iQ;
    }

    /* 4. строки в вещественное число*/
    public static double strToD(String w) {
        Double iW = new Double(45.5);
        try {
            iW = Double.valueOf(w);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат строки! " + e.getMessage());
        }
        return iW;
    }

    /* 5. Дана строка, состоящая из слов, разделенных пробелами и знаками препинания. Определить длину самого короткого
    слова*/
    public static int shortestWord(String str) {
        String[] splitted = str.split("(\\s+)|(,\\s)|(\\.\\s)|(\\.)|(,)");
        int shortest = splitted[0].length();
        for (int i = 0; i < splitted.length; i++) {
            shortest = shortest > splitted[i].length() ? splitted[i].length() : shortest;
        }
        return shortest;
    }

    /* 6. Подсчитать количество слов во введенной пользователем строке*/
    public static int numberOfWords(String st) {
        String input = "Java это сильно типизированный объектно-ориентированный язык программирования";
        int count = 0;
        if (input.length() != 0) {
            count++;
            for (int m = 0; m < input.length(); m++) {
                if (input.charAt(m) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }

    /*  7. В заданной строке удалить последнее слово */
    public static String Delete(String LW) {
        String[] s = LW.split(" ");
        String newLW = "";
        for (int i = 0; i < s.length - 1; i++) {
            newLW += s[i] + " ";

        }
        return newLW;
    }
}
