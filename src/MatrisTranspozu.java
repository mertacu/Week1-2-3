public class MatrisTranspozu {

    public static void main(String[] args) {
        int[][] originalMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //Orjinal matrisi ekrana yazdırıyorum
        System.out.println("Orjinal Matris : ");
        printMatrix(originalMatrix);

        //matrisin transpozunu hesapla
        int[][] transpozMatrix = transpozuBul(originalMatrix);

        //transpoz matrisi ekrana yazdır
        System.out.println("Transpoz Matrisi : ");
        printMatrix(transpozMatrix);
    }

    //matrisi ekrana yazdıran metod
    public static void printMatrix(int[][] matrix) {
        for(int[] satir : matrix) {
            for (int eleman : satir) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
    }
     public static int[][] transpozuBul(int[][] matrix) {
        int satirSayisi = matrix.length;
        int sutunSayisi = matrix[0].length;

        int[][] transpozMatrix = new int[sutunSayisi][satirSayisi];

        for(int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozMatrix[j][i] = matrix[i][j];
            }
        }
        return transpozMatrix;
     }
}
