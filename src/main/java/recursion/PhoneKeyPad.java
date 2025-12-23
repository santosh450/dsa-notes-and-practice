package recursion;

import java.util.HashMap;
import java.util.Map;

public class PhoneKeyPad {

    static Map<Character, String> map = new HashMap<>();
    static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }


    public static void main(String[] args) {
        pad("", "23");
        leetCode("", "23");
        leetCode("", "2");
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0'; // convert '2' to 2
        for(int i = (digit-1)*3; i< digit*3; i++){
            char ch = (char)('a'+i);
            pad(p+ch, up.substring(1));
        }
    }

    static void leetCode(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        String digit = map.get(up.charAt(0)); // convert '2' to 2
        for(int i = 0; i< digit.length(); i++){
            char ch = digit.charAt(i);
            leetCode(p+ch, up.substring(1));
        }
    }

}
