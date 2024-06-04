package praa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class String {
    public static void main(String[] args) {
    //     StringBuilder bs = new StringBuilder(" ");
        
    //     String s = "mohit nougraiya";
    //    String [] splited =  s.split(" ");    //"mohit" "nougrahiya"
    //    for(int i=0; i<splited.length; i++){   
    //          char [] ch = splited[i].toCharArray(); // "m" "o" "h" "i" "t";
    //         int i =0;
    //         int j = ch.length-1;
    //         while(i<j && ch!=0){
    //                 int temp = ch[i];
    //                 ch[i] = ch[j];
    //                 ch[j] = temp;

    //                 bs.append(ch);
    //         }
    //    }
    //    return new String(bs);]



    // String s = "aaAbcBC";
    // HashSet<Character> upper = new HashSet<>();
    // HashSet<Character> lower = new HashSet<>();
    //  char [] ch = s.toCharArray();
    //  for(char up : ch){
    //     if(Character.isUpperCase(up)){
    //       upper.add(up);
    //     }
    //   else if(Character.isLowerCase(up)){
    //     lower.add(up);
    //   }
    //  }
    //  int sum =0;
    //  for(char chacha : lower){
    //   if(upper.contains(Character.isUpperCase(chacha))){
    //     sum++;
    //   }
    //  }
    //  return sum;


    // String a = "mohit";
    // String b = "mohita";
    // int sum =0;
    // int index =0;
    // int i=1;
    //  while(index< a.length){
    //   if(a.charAt(index) != b.charAt(index)){
    //     return substring(index, i);
    //   }
    //  }
    //  return -1;


    // for(int i=0; i<a.length(); i++){
    //   sum += a.charAt(i);
    //   for(int i=0; i<b.length(); i++){
    //     sum -= b.charAt(i);
    //   }
    // }
    // return (char) sum;

      // String s = "abcdefg";    
      // int k ;
      //output = "badcfeg";

      // for(int i=0; i<s.length(); i+=2*k){  // har 2 , 2 ke diffrence me badana h thaywhy i+=2*k
      //  char ch [] = s.toCharArray()
      //   int first = i;
      //   int last = Math.min(i+2-1, s.length()-1);
      //   while(first < last){
      //     int temp = ch[first];
      //     ch[first] = ch[last];
      //     ch[first] = temp;
      //     first++;
      //     last--;
      //   }   
      // }

      // String s ={"eat","tea","tan","ate","nat","bat"};   //["eat" , "ate", "tea"]
      
      // HashMap<Character> map = new HashMap<>(); 
      // ArrayList ar = new ArrayList<>();
      // if(s.length() == null){
      //   return new ArrayList<>();
      // }
      // for(char c : s.toCharArray()){ // "e" "a" "t"
      //      char [] ch = Arrays.sort(c); // "a" "e" "t"
      //     String sorted = new String(ch); // "ate"..
      //     if(!map.containsKey(sorted)){
      //       map.put(sorted, ar);           // ["ate"]
      //     }
      //     else {
      //        map.get(sorted, ar).add(s);     //["ate" "eat"]
      //     }
      // }
      //   return new ArrayList<>();
          
    //   String a = "abba";
    //   String b =  "dog cat cat dog";

    //   HashMap<Character, String> amap = new HashMap<>();
    //   HashMap<Character, String> bmap = new HashMap<>();

    //  for(int i=0; i<a.length(); i++){
    //      char [] ch = a.charAt(i).toCharArray();
          
    //     for(int j=0; j<b.length(); j++){
    //      String splited = b.charAt(j).split()

         
    //      if(!amap.containsKey(ch)){
    //       if(amap.get(ch) != splited ){
    //         return false;
    //       }
    //      }
    //      else {
    //       amap.put(ch, splited);
    //      }

    //      if(!bmap.containsKey(splited));
    //      if(bmap.get(splited) != ch);
    //      return false;
    //     }
    //     else {
    //       bmap.put(splited, ch);
    //     }
    
    //  }
    //  return true;
    //   }

    // }


    // String str1 =  "ABCABC";
    // String str2 =  "ABC";
     
    // int index =0;
    // int i = 1;
    //   while (index < i) { 
    //       if(str1.charAt(index) == str2.charAt(index)){
       
    //       }
    //   }
    //   return "" ;


  //   String s1 ="bank";
  //   String s2 = "kanb";

  // int index = 0;
  //   if(s1.equals(s2)){
  //     return false;
  //   }
  //   int [] arr = new int[2];
  //  char []a =  s1.toCharArray();
  //  char [] b=  s2.toCharArray();
 
  //  int count = 0;
  //  for(int i=0; i<a.length; i++){
  //   if(a.length(i) != b.length(i)){
  //       if(a[i] != b[i]){
  //         if(count < 2){
  //           arr[count]  = i;
  //         }
  //         count++;
  //       }
  //       if(count == 2){
  //         int temp = a[arr[0]];
  //         a[arr[0]] = a[arr[1]];
  //         a[arr[1]] = temp;

  //         String.valueOf(a).equals(b);
  //       }
  //   }
  //  }
  //  return false;

//      String s = "Hello how are you Contestant";
//      int k =4;
//     int index =0;
//     int count = 0;
//     String temp = new String(k);
//      for(int i = 0; i<s.length(); i++){
//       if(s.charAt(i) == ""){
//         temp = s.substring(i, index);
//       }
//       count++;
//       if(count == k){
//         return temp;
//       }
//      }
// return 
    
  // int [] head = {0,1,2,3,4};  
  // int []  nums = {0,3,1,4};

  //  HashSet<Integer> hs = new HashSet<>();
  //    for (int chacha: nums) {
  //     hs.add(chacha); // 0, 3, 1, 4
  //    }
    
  //    int count =0;
  //     while(head != null){
  //       if(hs.contains(head.val) && head.next == null || !set.contains(head.next.val)){
  //         count ++;
  //       }
  //       head.next = head;
  //     }
  //     retrun count;
//       HashMap<Integer> hs = new HashMap<>();
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//     int [] nums = {3,2,3};m // output 3..
//      for(int chacha : nums){
//       hs.put(chacha, hs.get(chacha,0) + 1);

//      }
//      int mujority = n/3;

//      for(int key : keySet()){
//       if(hs.get(key) > mujority){
//            arr.add(key);
//       }
//      }

// return arr;

// HashSet<Integer> hs = new HashSet<>();
// ArrayList<Integer> arr = new ArrayList<Integer>();
//    int [] p = {1,2,3};
//    int [] q = {1,2,3};
//     for (int chacha : p) {
//         hs.add(chacha);
//     }

//     if(!hs.contains(q)){
//       return false;
//     }
//     else if(!hs.equals(q)){
//       return false;
//     }

// else {
//   return true;
// }
  //  ArrayList<Integer> arr = new ArrayList<>();
  //  int [] nums1 = {1,2,2,1};
  //  int [] nums2 = {2,2};
  //   Arrays.sort(nums1);
  //   Arrays.sort(nums2);
  //   int i=0; 
  //   int j =0;
  //   while(i < nums1.length() && j<nums2.length()){
  //     if(nums1[i] < nums2[j]){
  //       i++;
  //     }
  //     else if(nums2[j] < nums1[i]){
  //       j++;
  //     }
  //     else {
  //     }

  //  HashSet<Integer> hs = new HashSet<>();
  // int [] nums = {3,2,1};
  // Ar     arr.add(nusm1[i]);
  // //       i++; 
  // //     j++;
  // //     }

  //rays.sort(nums);
  // int count =1;
  //   for(int i = nums.length-1; i>0; i--){
  // if(nums[i]  != nums[i-1]){
  //   count ++;
  //   if(count == 3){
  //     return nums[i]
  //   }
  // }
  //   }

  // HashMap<String, Integer> map = new HashMap<>();
  // String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
  // String banned = "hit";
  //   String [] Splited = paragraph.isLowerCase().split(" ");

  //    for(String chacha : splited){
  //     if(!chacha.equals(banned)){
  //       map.put(chacha, map.getOrDefault(chacha, 0)+1);
  //     }

  //    }
  //    String mostFre = "";
  //    int  Maxcount=0;
  //    for(String key : map.keySet()){
  //     int count = map.get(key);
  //     if(count > Maxcount){
  //       Maxcount = count;
  //       mostFre = key;
  //     }
  //    }
  //    return mostFre;

  // HashMap <Character, Integer> map = new HashMap<>();
  // StringBuilder sb = new StringBuilder();
  // String s = "tree";
  //     int [] ch = s.toCharArray;
  //     for(Character chacha : ch){
  //       map.put(chacha, map.getOrDefault(chacha, 0) +1);

  //     }
  //     int maxCount =0;
  //     String freq = "";
  //     for(Character key : map.keySet()){
  //       int count = map.get(key);
  //       if(count > maxCount){
  //         maxCount = count;
  //           sb.append(key);
  //       }
  //     }

  // 31/05/24;
    //  int n = 6;
    //   while (n =< 0){
    //     return false;
    //   }
    //   while (n % 2 == 0) { 
    //       n = n / 2;
    //   }
    //   while(n % 3 == 0){
    //     n= n / 3;
    //   }
    //   while(n % 5 == 0){
    //     n = n / 5;
    //   }
    //   return n == 1;
     

 // 01/06/24    
    // int num = 5;
    // String m = Integer.toBinaryString(num);
    // StringBuilder bs = new StringBuilder();

    // for(int i=0; i<m.length; i++){
    //   int chacha = bs.append(m.charAt(i) == 1 ? 0 : 1);

    // }
    // int chachi = Integer.parseInt(chacha, 2);
    // return chachi;
     
    //02/06/2024
  //   int [] num = {1,1,0,1,1,1};
  //    int count =0;
  //    int maxCount = 0;
  //  for(int i=0; i<num.length; i++){
  //   if(num[i] == 1){
  //     count++;
  //    maxCount = Math.max(maxCount, count);
    
  //   }
  //   else {
  //     count = 0;
  //   }
      
  //  }
  //  System.out.println(maxCount);

  // String s = "1101";
  // int countZero = 0;
  // int CountOne =0;
  // int maxCount = 0;
  // int minCount =0;
  //  for(int i =0; i<s.length(); i++){
  //    if(s.charAt(i) == "1"){
  //     CountOne++;
  //     maxCount = Math.max(maxCount, CountOne);
  //    }
  //    countZero = 0;
  //    else if(s.charAt(i) == "0"){
  //     countZero++;
  //     minCount = Math.max(minCount, countZero);
  //     CountOne = 0;
  //    }
  //  }
  //  if(maxCount > minCount){
  //   System.out.println("true");
  //  }
  //  else {
  //   System.out.println("false");
  //  }

  // String s = '1001';
  // int count = 0;
 
  // for(int i =0; i<s.length(); i++){
  //   if(s.charAt(i) == 1 && i == 0;){
  //    count++;
  //    count = 0;
  //   }
  //   else if(s.charAt(i) == 0 && i == 0){
  //     return false;
  //   }
  // }
  // return true;

  // ListNode dummy = new ListNode(0);
  //  ListNode prev = dummy;

  //  while(head != null){
  //   ListNode current = head;
  //  }

  //  while(prev != null && prev.next.val != null){
  //   if(prev.val < current.val){
  //    prev = prev.next;
  //   }
  //     ListNode temp = current.next;
  //     current.next = prev.next;
  //     prev.next = temp;
  //  }
  //  return dummy.next;

  // 04/06/24
   class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int len= 0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                len+=2;
            }else{
                set.add(c);
            }
        }
        if(!set.isEmpty()) ++len;
        return len;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashSet<Character> hs = new HashSet<>();
        int left = 0, right = 0, max = 0;
        while(right < s.length()){
           char c = s.charAt(right);
           if(!hs.contains(c)){
             hs.add(c);
             max = Math.max(hs.size(), max);
             right++;
           }
           else {
            hs.remove(s.charAt(left));
            left++;
           }
        }
      return max;
    }
}class Solution {
  public int lengthOfLongestSubstring(String s) {
       HashSet<Character> hs = new HashSet<>();
      int left = 0, right = 0, max = 0;
      while(right < s.length()){
         char c = s.charAt(right);
         if(!hs.contains(c)){
           hs.add(c);
           max = Math.max(hs.size(), max);
           right++;
         }
         else {
          hs.remove(s.charAt(left));
          left++;
         }
      }
    return max;
  }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String str1 = strs[0];
       String str2 = strs[strs.length-1];
        int index =0; 
       while(index < str1.length()){
        if( str1.charAt(index) ==  str2.charAt(index)){
           index++;
        }
       else {
                break;
       }
      
       }
        return index == 0 ? "" :str1.substring(0, index);
    }
}

class Solution {
  public int removeDuplicates(int[] nums) {
      int i =0;
      Arrays.sort(nums);
      for(int j=1; j<nums.length; j++){
          if(nums[i]!=nums[j]){
             i++;
             nums[i]=nums[j];
          }
      }
      return i+1; 
  }
}

class Solution {
  public int strStr(String haystack, String needle) {
      if (haystack.contains(needle)) {
          return haystack.indexOf(needle);
      } else {
          return -1;
      }
  }
}

import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1}; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                break; 
            }
        }
        
        if (result[0] == -1) 
            return result;
        
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                result[1] = j; 
                break; 
            }
        }
        
        return result;
    }
}
class Solution {
  public int firstMissingPositive(int[] nums) {
    HashSet<Integer>hs = new HashSet<>();
    for(int chacha: nums){
      hs.add(chacha);
    }

    int min =1; 
    int max = nums.length+1;

    for(int i=min; i<=max; i++){
    if(!hs.contains(i)){

      return i;
    }
 
  }
  return -1;
}
}
    }
    
  }