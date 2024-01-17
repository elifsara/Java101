public class pozitifSayilarinToplami {

    public static int SayilariTopla(int n){
        int top = 0;
        for(int i = 0; i <= n; i++)
        top += i;

        return top;
    }
    public static void main(String[] args){
        System.out.println(SayilariTopla(5));
    }
    
}
