import java.util.Comparator;

public class MyComporator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(Integer.parseInt(String.valueOf(o1.charAt(o1.length()-1))) > 
            Integer.parseInt(String.valueOf(o2.charAt(o2.length()-1)))){
                return 1;
        }
        else if(Integer.parseInt(String.valueOf(o1.charAt(o1.length()-1))) < 
            Integer.parseInt(String.valueOf(o2.charAt(o2.length()-1)))){
                return -1;
        }
        else{
            return 0;
        }
    }
    
}
