public class faktoriyelMetot {

    public static int faktoriyelBul(int n){
        int k = 1;
        for(int i = n; i > 0; i--){
            k *= i;
        }

        return k;
    }
    //Recurive metot kullanılırsa
    public static int faktRecursive(int n){
        if(n == 1)
            return 1;
        return faktRecursive(n-1) * n;
    }
    public static void main(String[] args){
        System.out.println(faktoriyelBul(4));
        System.out.println(faktRecursive(5));
    }
}
