// Задание 1

// 1.Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Random;
// import java.util.Scanner;

// public class HW3 {
//     public static void main(String[] args) throws Exception {
//         System.out.print("Введите длину списка N: ");
//         try (Scanner iScanner = new Scanner(System.in)) {
//             int N = iScanner.nextInt();
//             ArrayList<Integer> ar = new ArrayList<Integer>();
//             Random ran = new Random();
//             for (int i = 0; i < N; i++) {
//                 int x = ran.nextInt(N);
//                 ar.add(x);
//             }
//             System.out.println("Произвольный список целых чисел: \n " + ar);

//             for (int i = ar.size() - 1; i >= 0; i--) {
//                 int even = ar.get(i) % 2;
//                 if (even == 0) {
//                     System.out.println("Четное число:" + ar.get(i));
//                     ar.remove(i);
//                 }
//             }
//             Collections.sort(ar);
//             System.out.println("Список с удаленными четными числами: \n " + ar);
//         }
//     }

// }

// Задание 1

// 1.Пусть дан произвольный список целых чисел.

// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

// import java.util.ArrayList;
// import java.util.Random;
// import java.util.Scanner;

// public class HW3 {
//     public static void main(String[] args) throws Exception {
//         System.out.print("Введите длину списка N: ");
//         try (Scanner iScanner = new Scanner(System.in)) {
//             int N = iScanner.nextInt();
//             ArrayList<Integer> ar = new ArrayList<Integer>();
//             Random ran = new Random();
//             for (int i = 0; i < N; i++) {
//                 int x = ran.nextInt(N);
//                 ar.add(x);
//             }
//             System.out.println("Произвольный список целых чисел: \n " + ar);

//             int min = ar.get(0);
//             int max = ar.get(0);
//             float sum = 0;
//             for (int i = 0; i < ar.size(); i++) {
//                 int num = ar.get(i);
//                 if (num < min) {
//                     min = num;
//                 }
//                 if (num > max) {
//                     max = num;
//                 }
//                 sum += num;
//             }
//             float average = sum / ar.size();

//             System.out.println("Минимальное значение: " + min);

//             System.out.println("Максимальное значение: " + max);

//             System.out.println("Среднее арифметическое значение: " + average);
//         }
//     }
// }
// Задание 2.
// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями, 
// вывести название каждой планеты и количество ее повторений в списке.
// Для списка из задачи про Солнечную систему удалить все повторяющиеся элементы.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HW3 {
    public static void main(String[] args) {
        planetsCounter(8);
    }

    static void randomNumbers(int size, int maxValue) {
        ArrayList<Integer> nums = new ArrayList<>(size);
        Random rand = new Random();

        for (int i = 0; i < size; i++)
            nums.add(rand.nextInt(maxValue));

        for (Integer num : nums)
            System.out.print(num + " ");
        System.out.println();

        nums.sort(null);
        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext())
            System.out.print(iter.next() + " ");
    }

    static void planetsCounter(int n) {
        List<String> listPlanets = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus",
                "Neptun");
        List<String> randPlanets = new ArrayList<String>(n);
        int[] counts = new int[listPlanets.size()];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
            System.out.print((randPlanets.get(i)) + " ");
            counts[listPlanets.indexOf(randPlanets.get(i))]++;
        }

        Set<String> set = new LinkedHashSet<>(randPlanets);
        randPlanets.clear();
        randPlanets.addAll(set);

        System.out.println(randPlanets);

        for (int i = 0; i < counts.length; i++)

            System.out.printf("%s - %s\n", listPlanets.get(i), counts[i]);

    }
}
