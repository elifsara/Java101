import java.util.Scanner;
public class SicakligaGoreEtkinlikOnerme {
    public static void main(String[] srgs) {
        int heat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz: ");
        heat = inp.nextInt();

        if (heat <= 5) {
            System.out.print("Kayak yapabilirsiniz.");
        }
        else if (heat > 5 && heat <= 15) {
            System.out.print("Sinemaya gidebilirsiniz");
        } else if (heat > 15 && heat <= 25) {
            System.out.print("Piknik yapabilirsiniz.");
        } else {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
    }
}
