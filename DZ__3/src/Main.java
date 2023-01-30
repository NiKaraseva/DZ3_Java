import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
//        ex_01(10);    // Вывод задачи №1


        ex_02(10);   // Вывод задачи №2


    }

    static void ex_01(int n){
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(50));
        }
        System.out.println(list);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }


    static void ex_02(int n){
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(50));
        }
        System.out.println(list);
        System.out.println();

        double average;
        double sum = 0;
        for (int m : list) {
            sum += m;
        }
        average = sum/n;

        System.out.println("Среднее арифметическое списка = " + average);
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("Минимальный элемент списка = " + min);
        System.out.println("Максимальный элемент списка = " + max);

    }

}