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

        int maxLen = 1;
        for (int left = 0; left < nums.length; left++) {
            int min = nums[left];
            int max = nums[left];
            int temLen = 1;
            if(maxLen >= nums.length -left ){
                break;
            }
            for (int right = left + 1; right < nums.length; right++) {
                max = Math.max(max, nums[right]);
                min = Math.min(min, nums[right]);
                if (Math.abs(max - min) <= limit) {
                    temLen++;
                    continue;
                } else {
                    break;
                }
            }
            maxLen = Math.max(maxLen, temLen);
        }

        return maxLen;

    }
}
