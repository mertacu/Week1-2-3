import java.util.Scanner;

// Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alıyoruz.


public class FibonacciProg {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Serinin eleman sayısını giriniz: ");
        int numb = scanner.nextInt();


        int fibo1 = 0, fibo2 = 1;
        System.out.println("Fibonacci :");
        for (int i = 0; i < numb; i++) {
            System.out.print(fibo1 + " ");
            int nextFibo = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = nextFibo;
        }
    }
}