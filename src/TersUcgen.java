/* Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile
ekrana ters üçgen çizen programı yazın. */

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args){

        int numb;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        numb = inp.nextInt();

        for(int i = 0; i < numb; i++){
            for (int m = 0; m < 2*(numb-i)-1; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
