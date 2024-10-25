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

SELECT 
    CASE 
        WHEN id % 2 = 1 AND id < (SELECT MAX(id) FROM Seat) THEN id + 1
        WHEN id % 2 = 0 THEN id - 1
        ELSE id
    END AS id, 
    student
FROM Seat
ORDER BY id;


class Solution {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();

        while (num >= 1000) {
            roman.append("M");
            num -= 1000;
        }
        
        while (num >= 900) {
            roman.append("CM");
            num -= 900;
        }
        
        while (num >= 500) {
            roman.append("D");
            num -= 500;
        }
        
        while (num >= 400) {
            roman.append("CD");
            num -= 400;
        }
        
        while (num >= 100) {
            roman.append("C");
            num -= 100;
        }
        
        while (num >= 90) {
            roman.append("XC");
            num -= 90;
        }
        
        while (num >= 50) {
            roman.append("L");
            num -= 50;
        }
        
        while (num >= 40) {
            roman.append("XL");
            num -= 40;
        }
        
        while (num >= 10) {
            roman.append("X");
            num -= 10;
        }
        
        while (num >= 9) {
            roman.append("IX");
            num -= 9;
        }
        
        while (num >= 5) {
            roman.append("V");
            num -= 5;
        }
        
        while (num >= 4) {
            roman.append("IV");
            num -= 4;
        }
        
        while (num >= 1) {
            roman.append("I");
            num -= 1;
        }

        return roman.toString();
    }
}