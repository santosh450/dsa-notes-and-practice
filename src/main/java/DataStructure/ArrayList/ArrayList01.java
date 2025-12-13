package DataStructure.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        List<Integer> num2 = Arrays.asList(7, 10, 11, 1, 55);
        System.out.println(num2);

        List<Integer> num3 = Arrays.asList(17, 1, 87, 18, 7);
        ArrayList<Integer> num4 = new ArrayList<>(num3);
        System.out.println(num4);

        ArrayList<Integer> num5 = new ArrayList<>(Arrays.asList(88, 11, 55, 18, 85));
        System.out.println(num5);

    }
}
