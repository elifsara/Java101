import java.util.Scanner;
public class KatlarinToplami4 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n;
        int toplam = 0;

        do {
            System.out.print("Sayı giriniz: ");
            n = inp.nextInt();
            if (n % 4 == 0){
                toplam = toplam + n;
            }
        } while (n % 2 == 0);
        System.out.print("Toplam: " + toplam);
    }
}
