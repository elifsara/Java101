public class basamakSayisiBulma {

    public static int BasamakSayisi(int a){
        int counter = 0;
        while (a > 0){
            a = a / 10;
            counter++;
        }

        return counter;
    }
    public static void main(String[] args){
        System.out.println(BasamakSayisi(425135));
    }
}
