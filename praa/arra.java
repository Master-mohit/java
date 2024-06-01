import java.util.Arrays;
import java.util.HashSet;


public class arra {
    public static void main(int[] args) {
    HashSet<Integer> hs1 = new HashSet<>();
    HashSet<Integer> hs2 = new HashSet<>();

    int [] nums1 = {4,9,5};
    int [] nums2 = {9,4,9,8,4};
    for(int chacha1 :nums1){
        hs1.add(chacha1);
    }
    for(int chacha2 : nums2){
        if(hs1.contains(nums2)){
            hs2.add(chacha2);
        }
    }
    int [] result = new int[hs2.length];
    int i=0;
    for(int re: hs2){
        result.add(re);
        i++;
    }
    
     return result;
    }
}
