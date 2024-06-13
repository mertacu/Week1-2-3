import java.util.Arrays;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {

        int[] list = {2, 5, 67, 45, 45, 2, 8, 9, 35, 46, 45, 38, 8, 66, 8, 102, 23, 102};
        int[] list2 = new int[list.length];
        int[] list3 = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j] && list[i] % 2 == 0) {
                    list2[index++] = list[i];
                    break;
                }
            }
        }
        System.out.println(" ");

        for (int i = 0; i < index; i++) {
            boolean repeat = false;
            for (int j = 0; j < i; j++) {
                if (list2[i] == list2[j]) {
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {
                list3[i] = list2[i];
                System.out.print(list2[i] + "  ");
            }
        }
    }
}