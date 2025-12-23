package recursion;

public class Strings01 {

    public static void main(String[] args) {
        skip("", "bcaccadha");
        System.out.println(skip01("bcaccadha"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char e = up.charAt(0);
        if(e == 'a'){
            skip(p, up.substring(1));
        }
        else {
            skip(p+e, up.substring(1));
        }
    }

    static String skip01(String word){
        if(word.isEmpty()){
            return "";
        }

        char e = word.charAt(0);
        if(e == 'a'){
            return skip01(word.substring(1));
        }
        else {
            return e+ skip01(word.substring(1));
        }
    }
}
