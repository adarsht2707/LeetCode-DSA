class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {

            if (digits[i] + carry <= 9) {
                digits[i] = digits[i] + carry;
                carry = 0;
                //break;
            }
            else {
                digits[i] = 0;
                carry = 1;
            }
        }

        if (carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        }

        return digits;
    }
}