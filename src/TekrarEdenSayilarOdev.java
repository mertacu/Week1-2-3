public class TekrarEdenSayilarOdev {

    public static void main(String[] args) {
        int[] numbers = {1, 32, 4, 66, 32, 64, 83, 12, 76, 66, 12, 9, 3, 64}; //tekrar eden sayıları içeren dizi

        // Dizideki tekrar eden sayıları bulma
        System.out.println("Dizide tekrar eden sayılar:");
        for (int i = 0; i < numbers.length; i++) {
            int sayac = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    sayac++;
                }
            }
            if (sayac > 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}