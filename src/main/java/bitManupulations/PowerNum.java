package bitManupulations;

public class PowerNum {

    public static void main(String[] args) {
        int base = 3;
        int power = 6;

        int res =1;
        while(power>0){

            if((power&1) == 1) {
                res = res * base;
            }
            base = base*base;
            power = power>>1;
        }
        System.out.println(res);
    }
}
