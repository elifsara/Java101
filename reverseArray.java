public class reverseArray {
    public static void main(String[] args) {
        // İkinci dizi kullanmadan diziyi ter çeviren bir Java programı yazınız.
        int[] dizi = new int[10];

        System.out.print("Orijinal dizi: ");
        for(int i = 0; i < dizi.length; i++){
            dizi[i] = (int)(Math.random()*100);
            System.out.print(dizi[i] + " ");
        } System.out.print("\nReversed Array: ");
        for( int i = 0, j = dizi.length-1; i < j; i++, j--){
            int temp = dizi[i];
            dizi [i] = dizi[j];
            dizi[j] = temp;
        }for(int sayi : dizi)
        System.out.print(sayi + " ");

    }
    
}
