package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones771 {

    public int numJewelsInStones(String jewels, String stones) {
        int result=0;
        for(int i=0;i<stones.length();i++){
            char arr=stones.charAt(i);
            for(int j=0;j<jewels.length();j++){
                if(arr==jewels.charAt(j)){
                    result+=1;break;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        JewelsAndStones771 jewelsAndStones771 = new JewelsAndStones771();

        String f= "aA";
        String s = "aaAAAdssda";

       int  A = jewelsAndStones771.numJewelsInStones(f,s);
        System.out.println(A);
    }
}
