import java.util.Scanner;

public class kucukBuyukEnYakinSayi {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int n; 
        int ksayi = list[0], bsayi = list[0];
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        n = inp.nextInt();
        
        for(int i = 0; i < list.length; i++){
            if(list[i] < n){
                ksayi = list[i];
            }
            if(list[i] > n){
                bsayi = list[i];
            }
        }
        for(int j = 0; j < list.length; j++){
            if(list[j] > ksayi && list[j] < n){
                ksayi = list[j];
            }
            if(list[j] < bsayi && list[j] > n){
                bsayi = list[j];
            }
        }
        System.out.println(n + "'den küçük en büyük sayı: " + ksayi);
        System.out.println(n + "'den büyük en küçük sayi: " + bsayi);
    }
}
