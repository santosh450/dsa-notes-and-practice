package recursion;

public class Palindrome {

    static boolean isPalindrome(int l, int r, String s){
        if(l>=r){
            return true;
        }
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }
        return isPalindrome(l+1, r-1, s);
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(s+" is Palindrome: " +isPalindrome(0, s.length()-1, s));
    }
}
