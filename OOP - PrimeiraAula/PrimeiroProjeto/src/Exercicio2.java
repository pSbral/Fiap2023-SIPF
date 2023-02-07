import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int i, j, max;

        i = teclado.nextInt();
        j = teclado.nextInt();

        max = calcular(i, j);

        System.out.println(max);
        }

    private static int calcular(int i, int j) {
        int n, rep, max = 0;

        for (; i < j; i++) {
            n = i;
            rep = 0;
            while (true) {
                rep++;
                if (n == 1){
                    break;
                }
                if (n % 2 != 0) {
                    n = n * 3 + 1;
                }
                else {
                    n = n / 2;
                }
            }
            if (rep >max)
                max = rep;
        }

        return max;
    }
}