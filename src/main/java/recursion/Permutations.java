package recursion;

public class Permutations {

    public static void main(String[] args) {
        permutations("", "abc");
    }

    public static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutations(f+ch+s, up.substring(1));
        }
    }

    public static int permutationsCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count =0;
        char ch = up.charAt(0);
        for(int i=0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            count = count + permutationsCount(f+ch+s, up.substring(1));
        }
        return count;
    }
}
