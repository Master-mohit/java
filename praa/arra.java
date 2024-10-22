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
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0, sumBob = 0;
        for (int a : aliceSizes) sumAlice += a;
        for (int b : bobSizes) sumBob += b;

        int delta = (sumBob - sumAlice) / 2;
        Arrays.sort(bobSizes);

        for (int a : aliceSizes) {
            if (binarySearch(bobSizes, a + delta))
                return new int[]{a, a + delta};
        }

        return new int[0];
    }

    private boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}    
    }

    SELECT w1.id as Id FROM Weather w1
LEFT JOIN Weather w2
ON w1.recordDate = DATE_ADD(w2.recordDate, INTERVAL 1 DAY)
WHERE w1.temperature > w2.temperature;
}
// class Solution {
//     public List<List<Integer>> combine(int n, int r) {
//         List<List<Integer>> result = new ArrayList<>();
//         backTracking(result, new ArrayList<>(), n,r,1);
//         return result;
//     }
//     public static void backTracking( List<List<Integer>> result, List<Integer> tempList, int n , int r, int start){
//         if(tempList.size()==r){
//             result.add(new ArrayList<>(tempList));
//             return;
//         }
//         for(int i=start;i<=n;i++){
//             tempList.add(i);
//             backTracking(result, tempList, n, r, i+1);
//             tempList.remove(tempList.size()-1);
//         }
//     }

class Solution {
    public boolean isPerfectSquare(int num) {
        int ans=(int)Math.sqrt(num);
        int m = ans*ans;
        if(m==num)
        {
            return true;
        }
        return false;
    }
}
}


// SELECT a.person_name FROM
// (SELECT person_name, SUM(weight) OVER(ORDER BY turn) AS cumulative_sum FROM Queue) a
// WHERE a.cumulative_sum <= 1000 ORDER BY a.cumulative_sum DESC LIMIT 1;