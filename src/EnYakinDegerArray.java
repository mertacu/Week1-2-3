import java.util.Scanner;

public class EnYakinDegerArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir Değer Giriniz : ");
        int a = input.nextInt();

        int[] list = {-123, 231, 31, 56, -12, -102, 543, 65, 23, 98, -32, -167};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (int i : list) {
            if (i < a && i > max) {
                max = i;
            }
            if (i > a && i < min) {
                min = i;
            }
        }
        System.out.println("En Yakın En Büyük Sayı : " + min);
        System.out.println("En Yakın En Küçük Sayı : " + max);

    }
}
