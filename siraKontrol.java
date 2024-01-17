public class siraKontrol {

    public static boolean kontrolEt(int[] dizi){

        for(int i = 0; i < dizi.length -1; i++){
            if(dizi[i] > dizi[i+1])
            return false;
            else if(dizi[dizi.length-1] < dizi[dizi.length-2])
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        int[] list = {5, 7 , 8 , 10 ,10};
        System.out.println(kontrolEt(list));
    }
    
}
