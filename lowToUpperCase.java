public class lowToUpperCase {
    public static String BuyukHarfeCevir(String kelime){
        char[] dizi = new char[kelime.length()];

        for(int i = 0; i < kelime.length(); i++){
            dizi[i] = kelime.charAt(i);
            if(dizi[i] >= 97 && dizi[i] <= 122){
                dizi[i] = (char)(dizi[i] - 32);
            }
            
            
        }
        String sonuc = new String(dizi);
        return sonuc;
    }
    public static void main(String[]args){
        System.out.println(BuyukHarfeCevir("Elif Sara"));
    }
}
