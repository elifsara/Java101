public class reverseMetot {

    public static String tersCevir(String kelime){
        String yeni = "";
        for(int i = 0; i < kelime.length(); i++){
            yeni = kelime.charAt(i) + yeni;
        }
        return yeni;
    }
    public static void main(String[] args){
        System.out.println(tersCevir("Elif Sara"));
    }
    
}
