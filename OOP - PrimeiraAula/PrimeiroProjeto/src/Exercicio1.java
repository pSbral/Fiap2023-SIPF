import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        while (n != 1) {
            System.out.println(n);
            if (n % 2 != 0) {
                n = n * 3 + 1;
            } else {
                n = n / 2;
            }
        }

         System.out.println(n);
    }
}

