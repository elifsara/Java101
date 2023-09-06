import java.util.Scanner;
public class NotOrtalamaHesaplama {
    public static void main(String[] args){
        int math, pyhsics, chemistry, turkish, music;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        math = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        pyhsics = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        chemistry = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkish = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        music = inp.nextInt();

        double average = (math + pyhsics + chemistry + turkish + music) / 5 ;

        if ((math < 0 || math > 100) || (pyhsics < 0 || pyhsics > 100) || (chemistry < 0 || chemistry > 100) || (turkish < 0 || turkish > 100) || (music < 0 || music > 100)) {
            System.out.print("Lütfen geçerli bir değer giriniz.");
        }
        else {
            if (average >= 55) {
                System.out.print("Sınıfı geçtiniz.");
            }
            else {
                System.out.print("Sınıfta kaldınız.");
            }
            System.out.print(" Ortalamanız: " + average);
        }
    }
}
