public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание. Массивы часть 1.");
        System.out.println("Домашнее задание. Массивы часть 1. Задача 1");
        //задача 1
        int [] weight = new int[]{1, 2, 3};
        double [] weights = new double[]{1.57, 7.654, 9.986};
        int [] example = {100, 200, 300};
        //Задача 2
        System.out.println("Домашнее задание. Массивы часть 1. Задача 2");
        System.out.println(weight[0] + "," + weight[1] + "," + weight[2] + "\n");
        System.out.println(weights[0] + "," + weights[1] + "," + weights[2] + "\n");
        System.out.println(example[0] + "," + example[1] + "," + example[2] + "\n");

        // хотел с помощью цикла вывесли в консоль в трочку и без запятой в конце, но выводит с запятой в конце:
        //for (int i = 0; i < 3; i++) {
        //System.out.print(weight[i]+",");
        //}
        //System.out.println();
        //for (int a = 0; a < 3; a++) {
        //    System.out.print(weights[a]+",");
        //}
        // System.out.println();
        // for (int b = 0; b < 3; b++) {
        //    System.out.print(example[b]+",");
        //}

        //Задача 3
        System.out.println("Домашнее задание. Массивы часть 1. Задача 3");
        System.out.println(weight[2] + "," + weight[1] + "," + weight[0] + "\n");
        System.out.println(weights[2] + "," + weights[1] + "," + weights[0] + "\n");
        System.out.println(example[2] + "," + example[1] + "," + example[0] + "\n");

        //Задача 4
        System.out.println("Домашнее задание. Массивы часть 1. Задача 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0){
                weight[i]++;
                System.out.println(weight[i]);
            }
        }
    }
}
