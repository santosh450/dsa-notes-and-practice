package recursion;

import java.util.ArrayList;

public class SubSeq {

    public static void main(String[] args) {
        subSequence("", "abc");
        System.out.println(subSeqList("", "abc", new ArrayList<String>()));
        System.out.println(subSeqList02("", "abc"));
        subSeqListAscii("", "abc");
    }

    static void subSequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        //take
        subSequence(p+up.charAt(0), up.substring(1));
        //Not take
        subSequence(p, up.substring(1));
    }

    static ArrayList<String> subSeqList(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        //take
        ArrayList<String> take = subSeqList(p+up.charAt(0), up.substring(1), new ArrayList<String>());
        //Not take
        ArrayList<String> notTake = subSeqList(p, up.substring(1), new ArrayList<String>());

        take.addAll(notTake);
        return take;
    }

    static ArrayList<String> subSeqList02(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        //take
        ArrayList<String> take = subSeqList02(p+up.charAt(0), up.substring(1));
        //Not take
        ArrayList<String> notTake = subSeqList02(p, up.substring(1));

        take.addAll(notTake);
        return take;
    }

    static void subSeqListAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        //take
        subSequence(p+ch, up.substring(1));
        //Not take
        subSequence(p, up.substring(1));
        subSequence(p+(ch+0), up.substring(1));
    }
}
