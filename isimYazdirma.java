public class isimYazdirma {

    public static void isimYazdir(int n, String name){
        for(int i = 0; i < n; i++)
            System.out.println(name);
    }
    public static void main(String[] args){
        isimYazdir(5, "elif");;
    }
}
