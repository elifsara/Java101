import java.util.Scanner;

public class diziOlusturma {
    public static void main(String[] args) {
        int [] a = new int[10];
        Scanner inp = new Scanner(System.in);
        int i = 0;
        while(i < 10){
            System.out.println((i+1) + ". eleman");
            int x = inp.nextInt();
            boolean b = false;
            for(int j = 0; j < i; j++){
                if(x == a[j]){
                    b= true;
                    break;
                }
            }if(b) continue;
            else { a[i] = x; i++;}
        }
        for(int eleman:a)
            System.out.print(eleman+" ");
    }
    
}
