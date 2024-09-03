import java.util.Arrays;
import java.util.HashSet;


public class arra {
    public static void main(int[] args) {
    // HashSet<Integer> hs1 = new HashSet<>();
    // HashSet<Integer> hs2 = new HashSet<>();

    // int [] nums1 = {4,9,5};
    // int [] nums2 = {9,4,9,8,4};
    // for(int chacha1 :nums1){
    //     hs1.add(chacha1);
    // }
    // for(int chacha2 : nums2){
    //     if(hs1.contains(nums2)){
    //         hs2.add(chacha2);
    //     }
    // }
    // int [] result = new int[hs2.length];
    // int i=0;
    // for(int re: hs2){
    //     result.add(re);
    //     i++;
    // }
    
    //  return result;

    

    class Solution {
        public int[] findErrorNums(int[] nums) {
            Set<Integer> set = new HashSet<>();
            int result[] = new int[2];
            
            // Find the duplicate number
            for(int chacha : nums){
                if(!set.contains(chacha)){
                    set.add(chacha);
                } else {
                    result[0] = chacha;
                }
            }
            
            // Find the missing number
            for(int i = 1; i <= nums.length; i++){
                if(!set.contains(i)){
                    result[1] = i;
                }
            }
            
            return result;   
        }
    }
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if (flowerbed[i] == 0 && 
                (i == 0 || flowerbed[i - 1] == 0) && 
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n == 0;
    }
}
    
    }
}
