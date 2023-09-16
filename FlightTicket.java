import java.util.Scanner;
public class FlightTicket {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int mesafe, yas, biletTipi;
        double tutar, indirimliTutar;

        System.out.print("Mesafeyi km türünden giriniz:");
        mesafe = inp.nextInt();

        System.out.print("Yaşınızı giriniz:");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        biletTipi = inp.nextInt();

        tutar = mesafe * 0.10;
        if (yas > 0 && yas < 12) {
            tutar = tutar - tutar * 0.5;
        }else if (yas >= 12 && yas <= 24) {
            tutar = tutar - tutar * 0.1;
        } else if (yas > 65) {
            tutar = tutar - tutar * 0.3;
        }
        if (mesafe <= 0 || yas <= 0){
            System.out.print("Hatalı veri girdiniz!");
        }else {
            switch (biletTipi) {
                case 1:
                    System.out.print("Toplam Tutar: " + tutar + "TL");
                    break;
                case 2: tutar = 2 * (tutar - tutar * 0.2);
                    System.out.print("Toplam Tutar: " + tutar + "TL");
                    break;
                default:
                    System.out.print("Hatalı veri girdiniz!");
            }
        }
    }
}