import java.util.Scanner;

public class DaireAlan {

    public static void main(String [] args) {

       double yariCap, mao, pi = 3.14;

       Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        yariCap = inp.nextDouble();
        System.out.print("Dairenin merkez açı ölçüsünü giriniz : ");
        mao = inp.nextDouble();

        double alan = (pi * (yariCap * yariCap) * mao) / 360;
        System.out.println("Dairenin alanı : " + alan);
    }

}
