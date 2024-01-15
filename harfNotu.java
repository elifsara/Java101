import java.util.Scanner;

import javax.xml.transform.Source;

public class harfNotu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int oSayisi;
        System.out.print("Öğrenci saysını giriniz: ");
        oSayisi = inp.nextInt();
        int[] notlar = new int[oSayisi];
        int enIyi = 0;

        for(int i = 0; i < notlar.length; i++){
            System.out.println((i + 1) + ". öğrencinin notunu giriniz: ");
            notlar[i] = inp.nextInt();
            if(notlar[i] > enIyi)
                enIyi = notlar[i];
        }
        for(int i = 0; i < notlar.length; i++){
            if(notlar[i] >= (enIyi-10))
                System.out.println((i+1) + ". Öğrencinin notu: " + notlar[i] + " Harf Notu A");
            else if(notlar[i] >= (enIyi -20))
                System.out.println((i+1) + ". Öğrenicin notu: " + notlar[i] + " Harf Notu B");
            else if(notlar[i] >= (enIyi-30))
                System.out.println((i+1) + ". Öğrencinin notu: " + notlar[i] + " Harf Notu C");
            else if(notlar[i] >= (enIyi -40))
                System.out.println((i+1) + ". Öğrenicin notu: " + notlar[i] + " Harf Notu D");
            else System.out.println((i+1) + ". Öğrenicin notu: " + notlar[i] + " Harf Notu F");
        }
    } 
    
}
