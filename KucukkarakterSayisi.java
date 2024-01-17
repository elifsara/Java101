public class KucukkarakterSayisi {

    public static int KucukKSayisi(String kelime){
        int counter = 0;
        for(int i = 0; i < kelime.length(); i++){
            if(kelime.charAt(i) >= 97 && kelime.charAt(i) <= 122)
                counter++;
        }

        return counter;
    }

    public static void main(String[] args){
        System.out.println(KucukKSayisi("ELKLFSkjsk"));
    }
    
}
