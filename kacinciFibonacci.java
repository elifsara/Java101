public class kacinciFibonacci {

    public static int Kacinci(int n){
        int a = 0, b = 1, c;
        for(int i = 2; i < n; i++){
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
    public static void main(String[] args){
        System.out.println(Kacinci(6));
    }
}
