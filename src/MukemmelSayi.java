/* Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise
 ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı yazınız.
 */

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args){
        int summ = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz : ");
        int numb = input.nextInt();

        //Kullanıcıdan alınan sayıya kadar döngü oluşturuyorum. Sonrasında tam bölünen sayıları topluyorum.
        for (int i = 1; i < numb; i++){
            if (numb % i == 0){
                summ += i;
            }
        }

        //Toplamları ile kullanıcıdan aldığım sayı eşitse düzeltiyorum.
        if (summ == numb) {
            System.out.println(numb + " bir mükemmel sayıdır.");
        } else {
            System.out.println(numb +  " bir mükemmel sayı değildir.");
        }
    }
}
