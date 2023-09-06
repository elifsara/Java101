import java.util.Scanner;
public class NumberSorting {
    public static void main(String[] args){

        int a, b, c;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz(a):");
        a = inp.nextInt();

        System.out.print("2. sayıyı girniz(b):");
        b = inp.nextInt();

        System.out.print("3. Sayıyı girniz(c):");
        c = inp.nextInt();

        if ((a < b) && (a < c) ) {
            if (b < c) {
                System.out.print("a<b<c");
            }else {
                System.out.print("a<c<b");
            }
        } else if (b < c) {
            if (a < c ) {
                System.out.print("b<a<c");
            } else {
                System.out.print("b<c<a");
            }

        } else {
            if (a < b){
                System.out.print("c<a<b");
            }else {
                System.out.print("c<b<a");
            }
        }
    }
}
