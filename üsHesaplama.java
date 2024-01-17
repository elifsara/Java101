public class üsHesaplama {

    public static int üsHesapla(int a, int b){
        int sonuc = 1;
        for(int i = 0; i < b; i++){
            sonuc *= a;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        System.out.println(üsHesapla(3, 2));
    }
    
}
