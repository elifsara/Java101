public class notOrtalamasiDizi {
    
    public static void main(String[] args) {
        int[] notlar = new int[100];
        double ort;
        int sum = 0;

        for(int i = 0; i < notlar.length; i++){
            notlar[i] = (int) (Math.random()*100);
            sum += notlar[i];
        }
        ort = (double)sum / notlar.length;
        System.out.println("100 Öğrencinin not ortalaması: " + ort);
    }
    
}
