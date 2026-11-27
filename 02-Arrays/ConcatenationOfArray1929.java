public class ConcatenationOfArray1929 {
    public int[] getConcatenation(int[] nums) {
        int o = nums.length * 2;
        int l = 0;
        int[] num1 = new int[o];

        for (int i = 0; i < o; i++) {
            num1[i] = nums[l];
            l++;

            if (l == nums.length) {
                l = 0;
            }
        }
        return num1;
    }
}
