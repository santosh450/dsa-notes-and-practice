package bitManupulations;

public class SingleNum {

    public static int singleNumber(int[] nums) {
        int result = 0;

        // check all 32 bits
        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            for (int num : nums) {
                if (((num >> bit) & 1) == 1) {
                    count++;
                }
            }

            // if count is not multiple of 3, set that bit
            if (count % 3 != 0) {
                result |= (1 << bit);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2};
        System.out.println(singleNumber(arr)); // Output: 3
    }
}

