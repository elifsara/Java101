public class enUzunString {

    public static String enUzunuBul(String[] list){
        String enUzun = "";
        for(int i = 0; i < list.length; i++){
            if(list[i].length() > enUzun.length()) 
                enUzun = list[i];
        }
    return enUzun;
    }

    public static void main(String[] args){
        String list[] = {"elma", "kale", "gül", "algoritma"};

        System.out.println(enUzunuBul(list));
    }
    
}
