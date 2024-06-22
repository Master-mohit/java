public class subarray {
    public static void main(String[] args) {
        int count = 0; 
        for (int i = 0; i < nums.length; i++) {
            int oddCount = 0; 
            for (int j = i; j < nums.length; j++) {
                if (nums[j] % 2 != 0) {
                    oddCount++; 
                }
                if (oddCount == k) {
                    count++; 
                }
            }
        }

        return count; 

    }
}
