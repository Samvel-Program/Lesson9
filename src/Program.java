import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Заполните массив из 10 чисел");
        int sample[] = new int[10];
        for (int i = 0; i < sample.length; i++) {
            sample[i] = in.nextInt();

        }
        for (int i = 0; i < sample.length; i++) {
            System.out.println(sample[i] * 2);
        }
    }
}


