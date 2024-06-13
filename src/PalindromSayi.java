//Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

public class PalindromSayi {

    //değişkenleri giriyorum yazdığım diğer metotun içine ve sonrasında ilk ve son
    // sayı değerlerini tanımlayarak formülü oluşturuyorum

    static boolean isPalindrom(int number) {
        int temp = number;
        int reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    //ve çıkan sonucun koşulu karşılayıp karşılamadığını yazdırarak öğreniyorum

    public static void main(String[] args) {

        System.out.println(isPalindrom(55));

    }
}
