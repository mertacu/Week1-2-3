import java.util.Scanner;

public class MinMaxProgrami {
    public static void main(String[] args) {

        int n, numb, numb1, numb2;
        int max, min;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Adeti : ");
        n = input.nextInt();

        System.out.print("1. sayı : ");
        numb1 = input.nextInt();
        System.out.print("2. sayı : ");
        numb2 = input.nextInt();

        if (numb1 < numb2) {
            max = numb2;
            min = numb1;
        } else {
            min = numb2;
            max = numb1;
        }


        for (int i = 3; i <= n; i++) {
            System.out.print(i + ". sayı : ");
            numb = input.nextInt();

            if (numb < min) {
                min = numb;
            }

            if (numb > max) {
                max = numb;
            }
        }
        System.out.println(n + " adet sayıdan minimum olanı : " + min);
        System.out.print(n + " adet sayıdan maksimum olanı : " + max);
    }
}
