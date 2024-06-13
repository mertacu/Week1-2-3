import java.util.Scanner;

public class AsalSayiProgrami {
    public static void main(String[] args) {
        int numb;
        ;

        Scanner input = new Scanner(System.in);

        for (numb = 2; numb <= 100; numb++) {
            int a = 0;
            for (int i = 2; i < numb; i++) {
                if (numb % i == 0) {
                    a = 1;
                    break;
                }
            }
            if (a == 0) {
                System.out.print(numb + " ");
            }
        }
    }
}
