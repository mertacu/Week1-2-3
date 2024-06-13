public class OrtalamaHarmonikProgram {


    public static void main(String[] args) {

        int[] numbers = {3, 2, 7, 1, 9};

        double harmonik = 0;

        for (int i = 0; i < numbers.length; i++) {
            harmonik += 1.0 / numbers[i];
        }
        double harmonikOrt = numbers.length / harmonik;

        System.out.println(harmonikOrt);
    }
}
