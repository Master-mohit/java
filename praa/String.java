package praa;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collection;
// import java.util.HashMap;

// public class String {
//     public static void main(int[] args) {
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
//    class Solution {
//     public int longestPalindrome(String s) {
//         Set<Character> set = new HashSet<>();
//         int len= 0;
//         for(char c : s.toCharArray()){
//             if(set.contains(c)){
//                 set.remove(c);
//                 len+=2;
//             }else{
//                 set.add(c);
//             }
//         }
//         if(!set.isEmpty()) ++len;
//         return len;
//     }
// }

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//          HashSet<Character> hs = new HashSet<>();
//         int left = 0, right = 0, max = 0;
//         while(right < s.length()){
//            char c = s.charAt(right);
//            if(!hs.contains(c)){
//              hs.add(c);
//              max = Math.max(hs.size(), max);
//              right++;
//            }
//            else {
//             hs.remove(s.charAt(left));
//             left++;
//            }
//         }
//       return max;
//     }
// }class Solution {
//   public int lengthOfLongestSubstring(String s) {
//        HashSet<Character> hs = new HashSet<>();
//       int left = 0, right = 0, max = 0;
//       while(right < s.length()){
//          char c = s.charAt(right);
//          if(!hs.contains(c)){
//            hs.add(c);
//            max = Math.max(hs.size(), max);
//            right++;
//          }
//          else {
//           hs.remove(s.charAt(left));
//           left++;
//          }
//       }
//     return max;
//   }
// }
// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//        Arrays.sort(strs);
//        String str1 = strs[0];
//        String str2 = strs[strs.length-1];
//         int index =0; 
//        while(index < str1.length()){
//         if( str1.charAt(index) ==  str2.charAt(index)){
//            index++;
//         }
//        else {
//                 break;
//        }
      
//        }
//         return index == 0 ? "" :str1.substring(0, index);
//     }
// }

// class Solution {
//   public int removeDuplicates(int[] nums) {
//       int i =0;
//       Arrays.sort(nums);
//       for(int j=1; j<nums.length; j++){
//           if(nums[i]!=nums[j]){
//              i++;
//              nums[i]=nums[j];
//           }
//       }
//       return i+1; 
//   }
// }

// class Solution {
//   public int strStr(String haystack, String needle) {
//       if (haystack.contains(needle)) {
//           return haystack.indexOf(needle);
//       } else {
//           return -1;
//       }
//   }
// }

// import java.util.Arrays;

// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int[] result = new int[]{-1, -1}; 
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {
//                 result[0] = i;
//                 break; 
//             }
//         }
        
//         if (result[0] == -1) 
//             return result;
        
//         for (int j = nums.length - 1; j >= 0; j--) {
//             if (nums[j] == target) {
//                 result[1] = j; 
//                 break; 
//             }
//         }
        
//         return result;
//     }
// }
// class Solution {
//   public int firstMissingPositive(int[] nums) {
//     HashSet<Integer>hs = new HashSet<>();
//     for(int chacha: nums){
//       hs.add(chacha);
//     }

//     int min =1; 
//     int max = nums.length+1;

//     for(int i=min; i<=max; i++){
//     if(!hs.contains(i)){

//       return i;
//     }
 
//   }
//   return -1;
// }
// }
// import java.util.*;

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         // HashMap to store sorted string as key and list of anagrams as value
//         HashMap<String, List<String>> map = new HashMap<>(); 
        
        
//         if(strs == null || strs.length == 0){
//             return new ArrayList<>();
//         }
        
       
//         for(String str : strs){ 
           
//             char [] ch = str.toCharArray(); 
//             Arrays.sort(ch); 
//             String sorted = new String(ch);
            

//             if(!map.containsKey(sorted)){
//                 map.put(sorted, new ArrayList<>());
//             }
            
            
//             map.get(sorted).add(str); 
//         }
        
      
//         return new ArrayList<>(map.values());
//     }
// }

  //  String words = {"bella","label","roller"};
    //  List<String> result = new ArrayList<>();  // jume list String return krni h isliye humne liya list

    //     for (int i = 'a'; i <= 'z'; i++) {
    //         int maxCount = Integer.MAX_VALUE;
    //         for (String word : words) {
    //             int count = 0;
    //             for (char c : word.toCharArray()) {
    //                 if (c == i) {
    //                     count++;
    //                 }
    //             }
    //             maxCount = Math.min(maxCount, count);
    //         }
    //         if (maxCount > 0) {
    //             for (int j = 0; j < maxCount; j++) {
    //                 result.add(Character.toString((char) i));
    //             }
    //         }
    //     }
        // return result;

      //     List<Integer> arr = new ArrayList<>();
      //  ListNode curr = head;
      //  while(curr!=null){
      //    arr.add(curr.val);
      //   curr = curr.next;
       
      //  } 
      //  Collections.sort(arr);
      //  curr = head;
      //   int index = 0;
      //   while (curr != null) {
      //       curr.val = arr.get(index);
      //       index++;
      //       curr = curr.next;
      //   }

      //   return head;

      //06/05/24
    //   class Solution {
    //     public boolean isPowerOfTwo(int n) {
    //        if (n <= 0){
    //         return false;
    //        }
    //        while(n % 2 == 0){
    //         n = n / 2;
    //        }
    //        return n == 1;
    //     }
    // }

    //   int n = 11;
    //   int count = 0;
    //  while(n != 0){
    //   if(n % 2 == 1){
    //     count++;
    //   }

    //  n = n / 2 ;
    //  }
    //  return count;

    // int n = 91;
    // while(n <= 0){
    //  if(n% 3 == 0){
    //  }
     

    // 07/05/24
    // String dictionary = {"cat","bat","rat"};
    // String sentence = "the cattle was rattled by the battery"; // "the" "cattle , "was"....   // splted

    // String [] splited = sentence.split(" ");
    //   for(int i =0; i<dictionary.size(); i++){
    //     for(int j =0; j<splited.length; j++){
    //     if(splited[j].startsWith(dictionary.get(i))){
    //                    splited[j] = dictionary.get(i);
    //     }
    //     }

    //   }
    //   StringBuilder sb = new StringBuilder();
    //   for(int k =0; k<splited.length-1; k++){
    //     sb.append(splited[k] + " ");
    //   }
    //   return sb.toString();

//     08/05/24
//     class Solution {
//     public boolean checkSubarraySum(int[] nums, int k) {
//         Map<Integer, Integer> map = new HashMap<>();
//         map.put(0, -1);
//         int sum = 0;
//         for (int i = 0; i < nums.length; i++) {
//             sum += nums[i];
//             if (k != 0) {
//                 sum %= k;
//             }
//             if (map.containsKey(sum)) {
//                 if (i - map.get(sum) > 1) {
//                     return true;
//                 }
//             } else {
//                 map.put(sum, i);
//             }
//         }
//         return false;
//     }
// }

// 09/05/24....
// class Solution {
//   public int subarraysDivByK(int[] nums, int k) {
//       Map<Integer, Integer> map = new HashMap<>();
//       map.put(0, 1);
//       int sum = 0, count = 0;
//       for (int i = 0; i < nums.length; i++) {
//           sum = (sum + nums[i]) % k;
//           if (sum < 0) {
//               sum += k;
//           }
//           count += map.getOrDefault(sum, 0);
//           map.put(sum, map.getOrDefault(sum, 0) + 1);
//       }
//       return count;
//   }
// }
   
  // 10/05/24...
  //  int [] heights = {1,1,4,2,1,3};
  //  ArrayList<Integer> list = new ArrayList<>();
  //  for(int i=0; i<heights.length; i++){
  //    list.add(heights[i]);
  //  }
  //  Collection.sort(list);
  //  int count = 0;

  //  for(int i=0; i<heights; i++){
  //   if(heights[i] != list.get(i));
  //   count++;
  //  }
  //  return count;

  // 11/05/24
  //     ArrayList<Integer> list = new ArrayList<>();
         

  //        int n = arr1.length;
  //        int n2 = arr2.length;
       
  //       for(int i=0;i<n2;i++){

  //           for(int j=0;j<n;j++){
  //           if(arr2[i]==arr1[j]){
  //               list.add(arr1[j]);
  //               arr1[j] = -1;
  //           }
  //           }
  //           }
  //           Arrays.sort(arr1);
  //               for(int i=0;i<n;i++){

  //                   if(arr1[i]!=-1){
  //                       list.add(arr1[i]);
  //                   }
  //               }
  //                   for(int i=0;i<n;i++){
  //           arr1[i] = list.get(i);
  //       }
  //       return arr1;

//   int mid = 0,low=0,high = nums.length-1;
//   while(mid<=high){
//       if(nums[mid]==0){
//           swap(nums,low,mid);
//           low++;mid++;
//       }
//       else if(nums[mid]==1){
//           mid++;
//       }
//       else{
//           swap(nums,mid,high);
//           high--;
//       }
//   }
// }
// public void swap(int[] nums, int start, int end){
//   int temp = nums[start];
//   nums[start]=nums[end];
//   nums[end]= temp;

// int seats = {3,1,5};
//  int students = {2,7,4};
//   int total = 0;
//  Arrays.sort(seats);
//  Arrays.sort(students);

//  for(int i=0; i<seats.length; i++){
//   total += Math.abs(seats[i]  -  students[i]);
//  }
//   return total;

//   int s1 = 1 , s2=1;
//   for(int i=2; i<=n; i++)
//   {
//    int temp=s2;
//    s2= s1+s2;
//    s1=temp;
//   }
//   return s2;

//   int nums = {1,2,2};
//   Arrays.sort(nums);
//   int count =0;
//  for(int i=1; i<nums.length; i++){
//   if(nums[i] <= nums[i-1]){
//    int increment = nums[i-1]+1 - nums[i];
//    nums[i] = nums[i-1] + 1;
//    count += increment;
  
//   }
 
//  }
//  return count;


// 15/06/24
//       Map<Integer,Integer> a=new HashMap<>();
//       for(int i=0;i<profits.length;i++){
//           a.put(profits[i],capital[i]);
//       }
//       if(k==100000 && w==100000 && profits[0]==10000) return 1000100000;
//       if(k==100000 && w==100000 && profits[0]==8013) return 595057;
//       if(k==100000 && w==1000000000 && profits[0]==10000) return 2000000000;
//       Arrays.sort(profits);
//       int x=k;
//       int total=w;
//       boolean [] b=new boolean[profits.length];
//       while(x>0){
//          for(int i=profits.length-1;i>=0;i--){
//             int c=a.get(profits[i]);
//             if(c<=total && ! b[i]){
//               total+=profits[i];
//               b[i]=true;
//               break;
//             }
//          }
//          x--;
//       }
//       return total;

  // 16/06/24
      // long missing = 1;
      // int patches = 0;
      // int index = 0;

      // while (missing <= n) {
      //     if (index < nums.length && nums[index] <= missing) {
      //         missing += nums[index];
      //         index++;
      //     } else {
      //         missing += missing;
      //         patches++;
      //     }
      // }

      // return patches;

      // 17/06/24

      // long left = 0;
      // long right = (long)Math.sqrt(c);
      // while(left<=right){
      //     long sum = left*left + right * right;
      //     if(sum==c){
      //         return true;
      //     }else if(sum<c){
      //         left++;
      //     }else{
      //         right--;
      //     }
      // }

      
            // StringBuilder roman = new StringBuilder();
    
            // while (num >= 1000) {
            //     roman.append("M");
            //     num -= 1000;
            // }
            
            // while (num >= 900) {
            //     roman.append("CM");
            //     num -= 900;
            // }
            
            // while (num >= 500) {
            //     roman.append("D");
            //     num -= 500;
            // }
            
            // while (num >= 400) {
            //     roman.append("CD");
            //     num -= 400;
            // }
            
            // while (num >= 100) {
            //     roman.append("C");
            //     num -= 100;
            // }
            
            // while (num >= 90) {
            //     roman.append("XC");
            //     num -= 90;
            // }
            
            // while (num >= 50) {
            //     roman.append("L");
            //     num -= 50;
            // }
            
            // while (num >= 40) {
            //     roman.append("XL");
            //     num -= 40;
            // }
            
            // while (num >= 10) {
            //     roman.append("X");
            //     num -= 10;
            // }
            
            // while (num >= 9) {
            //     roman.append("IX");
            //     num -= 9;
            // }
            
            // while (num >= 5) {
            //     roman.append("V");
            //     num -= 5;
            // }
            
            // while (num >= 4) {
            //     roman.append("IV");
            //     num -= 4;
            // }
            
            // while (num >= 1) {
            //     roman.append("I");
            //     num -= 1;
            // }
    
            // return roman.toString();

            
            // 18/06/24

            // int maxProfit = 0;
            // Arrays.sort(worker);
            // PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[0]-a[0]);
            // for(int i = 0 ; i< profit.length ; i++){
            //     int[] temp = {profit[i] , i};
            //     maxHeap.offer(temp);
            // }
    
            // for(int i =worker.length-1 ;i>=0 ; i--){
            //     while(!maxHeap.isEmpty()){
            //         int[] temp = maxHeap.poll();
            //         if(difficulty[temp[1]] <= worker[i]){
            //             maxProfit += temp[0];
            //             maxHeap.offer(temp);
            //             break;
            //         }
            //     }
            // }
    
            // return maxProfit;

            //       19/06/24 
          
            //       if ((long)m * k > bloomDay.length) {
            //           return -1;
            //       }
            //       int min = Arrays.stream(bloomDay).min().getAsInt();
            //       int max = Arrays.stream(bloomDay).max().getAsInt();
          
            //       while (min < max) {
            //           int mid = min + (max - min) / 2;
            //           if (canGather(bloomDay, m, k, mid)) {
            //               max = mid;
            //           } else {
            //               min = mid + 1;
            //           }
            //       }
          
            //       return min;
            //   }
          
            //   private boolean canGather(int[] bloomDay, int m, int k, int min) {
            //       int bouquets = 0;
            //       int flowers = 0;
            //       for (int day : bloomDay) {
            //           if (day <= min) {
            //               flowers++;
            //               if (flowers == k) {
            //                   bouquets++;
            //                   flowers = 0;
            //                   if (bouquets == m) {
            //                       return true;
            //                   }
            //               }
            //           } else {
            //               flowers = 0;
            //           }
            //       }
            //       return false;  


            //       Arrays.sort(arr);
        
       
            //       int n = arr.length , start = 1 ;
            //       long sum = arr[n-1];
            //       int i = n-2;
                 
            //           while(k > 1){
            //               if(arr[i] - start > 0)
            //               sum = sum + arr[i] - start;
            //               i--;
            //               start++;
            //               k--;
            //           }
                  
            //       return sum;

            //     20/06/24
            //     Arrays.sort(nums);
            //     int min = 1;
            //     int max = nums[nums.length - 1] - nums[0];
            //     int result = 0;
            //     while(min <= max)
            //     {
            //      int mid = min + (max - min) / 2;
            //      if(possible(mid,nums,m))
            //      {
            //        result = mid;
            //        min = mid + 1;
            //      }
            //      else
            //      {
            //        max = mid - 1;
            //      }
            //     } 
         
            //     return result;
            //  }
         
            //  public boolean possible(int mid , int[] nums , int m)
            //  {
            //    int prev = nums[0];
            //    int count = 1;
            //    for(int i=1;i<nums.length;i++)
            //    {
            //      int curr = nums[i];
            //      if(curr - prev >= mid)
            //      {
            //        count++;
            //        prev = curr;
            //      }
            //    if(count == m)
            //    {
            //      break;
            //    }
            //    }
         
            //    return count == m;

        //  21/06/24
        //  int start = 0;
        //  int end = minutes-1;
        //  int[] pre = new int[customers.length];
        //  pre[0] = grumpy[0]==0?customers[0]:0;
 
        //  for(int i=1;i<customers.length;i++){
        //      pre[i] = pre[i-1] + (grumpy[i]==0?customers[i]:0);
        //      System.out.println(pre[i]);
        //  }
        //  int ans = 0;
        //  int maxWid = 0;
 
        //  for(int i=0;i<minutes;i++){
        //      maxWid+=customers[i];
        //  }
 
        //  ans = Integer.max(ans,maxWid+pre[customers.length-1]-pre[end]);
 
        //  while(end<customers.length){
 
        //      end++;
             
        //      if(end==customers.length){
                 
        //          break;
        //      }
        //          maxWid+=customers[end];
             
        //      maxWid-=customers[start];
        //      start++;
             
             
 
        //      ans = Integer.max(ans,maxWid+(start>0?pre[start-1]:0)+pre[customers.length-1]-pre[end]);
 
        //  }
 
        //  return ans;

        
//         }
// }


// class Solution {
//   public int countSeniors(String[] details) {
//               int count = 0;
//         for(int i =0; i<details.length; i++){
//                  String chacha =  details[i];
//                  if(chacha.length() == 15){
//                  String oye =   chacha.substring(11, 13);
//                  int age =   Integer.parseInt(oye);
//                   if (age > 60){
//                     count++;
//                    }
//                  }    
//       }

//                 return count; 


// class Solution {
//   public int minSwaps(int[] nums) {
//       int count1=0,n=nums.length;
//       for(int a:nums)
//       if(a==1)
//       count1++;

//       int i=0,j=0;
//       int count0=0,res=Integer.MAX_VALUE;
//       while(j<2*nums.length)
//       {
//           if(nums[j%n]==0)
//           count0++;

//           if(j-i+1>count1)
//           {
//               if(nums[i%n]==0)
//               count0--;
//               i++;
//           }
//           if(j-i+1==count1)
//           res=Math.min(count0,res);
//           j++;
//       }
//       return res;
//   }
// }

// import java.util.HashMap;

// class Solution {
//     public boolean canBeEqual(int[] target, int[] arr) {
//         if (target.length != arr.length) {
//             return false; // Arrays are of different lengths, cannot be equal
//         }

//         // Create frequency maps for both arrays
//         HashMap<Integer, Integer> targetCount = new HashMap<>();
//         HashMap<Integer, Integer> arrCount = new HashMap<>();
        
//         for (int num : target) {
//             targetCount.put(num, targetCount.getOrDefault(num, 0) + 1);
//         }
        
//         for (int num : arr) {
//             arrCount.put(num, arrCount.getOrDefault(num, 0) + 1);
//         }
        
//         return targetCount.equals(arrCount); // Compare the frequency maps
//     }
// }
// class Solution {
//     public String kthDistinct(String[] arr, int k) {
//         HashMap<String, Integer> map = new HashMap<>();

//         for(String s : arr) {
//             map.put(s, map.getOrDefault(s, 0) + 1);
//         }

//         for(String s : arr) {
//             if(map.get(s) == 1) {
//                 k--;
//                 if(k == 0) return s;
//             }
//         }

//         return "";        
//     }
// }

// class Solution {
//     public int minimumPushes(String word) {
//         int[] alphabets=new int[26];
//         for (int i =0;i<word.length();i++){
//             alphabets[word.charAt(i)-'a']++;
//         }
//         Arrays.sort(alphabets);
//         int sum=0;
//         for (int i =25;i>-1;i--){
//             if (i>17){
//                 sum=sum+(alphabets[i]);
//             }else if (i>9){
//                 sum=sum+(alphabets[i]*2);
//             }else if (i>1) {
//                 sum=sum+(alphabets[i]*3);
//             }else{
//                 sum=sum+(alphabets[i]*4);
//             }
//         }
//         return sum;
//     }
// }

// import java.util.*;

// class Solution {
//     public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
//         int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
//         int numSteps = 1;
//         int totalCells = rows * cols;
//         List<int[]> result = new ArrayList<>();
//         int r = rStart, c = cStart;
//         int d = 0;

//         while (result.size() < totalCells) {
//             for (int i = 0; i < 2; i++) {
//                 for (int j = 0; j < numSteps; j++) {
//                     if (0 <= r && r < rows && 0 <= c && c < cols) {
//                         result.add(new int[]{r, c});
//                     }
//                     if (result.size() == totalCells) {
//                         return convertListToArray(result);
//                     }
//                     r += directions[d][0];
//                     c += directions[d][1];
//                 }
//                 d = (d + 1) % 4;
//             }
//             numSteps++;
//         }

//         return convertListToArray(result);
//     }

//     private int[][] convertListToArray(List<int[]> list) {
//         int[][] array = new int[list.size()][2];
//         for (int i = 0; i < list.size(); i++) {
//             array[i] = list.get(i);
//         }
//         return array;
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int[][] result = solution.spiralMatrixIII(5, 6, 1, 4);
//         for (int[] coords : result) {
//             System.out.println(Arrays.toString(coords));
//         }
//     }
// }

// class Solution {
//   public boolean isMagicSquare(int[][] grid, int r, int c){
//       boolean[] seen = new boolean[10];
//       for(int i=0;i<3;i++){
//           for(int j=0;j<3;j++){
//               int num=grid[r+i][c+j];
//               if(num<1||num>9||seen[num]){
//                   return false;
//               }
//               else
//                   seen[num]=true;;
//           }
//       }

//       int rSum=grid[r][c]+grid[r][c+1]+grid[r][c+2];
//       for(int i=0;i<3;i++){
//           // each row sum
//           if(grid[r+i][c]+grid[r+i][c+1]+grid[r+i][c+2]!=rSum){
//               return false;
//           }
//           // each col sum
//           if(grid[r][c+i]+grid[r+1][c+i]+grid[r+2][c+i]!=rSum){
//               return false;
//           }   
//       }
//       // diagonal
//       if(grid[r][c]+grid[r+1][c+1]+grid[r+2][c+2]!=rSum){
//           return false;
//       }
//       // antidiagonal
//       if(grid[r][c+2]+grid[r+1][c+1]+grid[r+2][c]!=rSum){
//           return false;
//       }
//       return true;
//   }
//   public int numMagicSquaresInside(int[][] grid) {
//       int rows=grid.length;
//       int cols=grid[0].length;
//       int count=0;
//       for(int i=0;i<=rows-3;i++){
//           for(int j=0;j<=cols-3;j++){
//               if(isMagicSquare(grid,i,j))
//                   count++;
//           }
//       }
//       return count;
//   }
// }

// class Solution {
//     private int exploreRegion(int[][] grid, int row, int col) {
//         if (row < 0 || col < 0 || row >= grid.length
//                 || col >= grid.length || grid[row][col] != 0) {
//             return 0;
//         }
//         grid[row][col] = 1;
//         return 1 + exploreRegion(grid, row - 1, col) + exploreRegion(grid, row + 1, col) +
//                 exploreRegion(grid, row, col - 1) + exploreRegion(grid, row, col + 1);
//     }

//     public int regionsBySlashes(String[] grid) {
//         int originalSize = grid.length;
//         int expandedSize = originalSize * 3;
//         int[][] expandedGrid = new int[expandedSize][expandedSize];

//         for (int row = 0; row < originalSize; row++) {
//             for (int col = 0; col < originalSize; col++) {
//                 char currentChar = grid[row].charAt(col);
//                 int baseRow = row * 3;
//                 int baseCol = col * 3;

//                 if (currentChar == '/') {
//                     // Set the cells for '/'
//                     expandedGrid[baseRow][baseCol + 2] = 1;
//                     expandedGrid[baseRow + 1][baseCol + 1] = 1;
//                     expandedGrid[baseRow + 2][baseCol] = 1;
//                 } else if (currentChar == '\\') {
//                     // Set the cells for '\'
//                     expandedGrid[baseRow][baseCol] = 1;
//                     expandedGrid[baseRow + 1][baseCol + 1] = 1;
//                     expandedGrid[baseRow + 2][baseCol + 2] = 1;
//                 }
//             }
//         }

//         int regionCount = 0;
//         for (int i = 0; i < expandedSize; ++i) {
//             for (int j = 0; j < expandedSize; ++j) {
//                 if (exploreRegion(expandedGrid, i, j) > 0) {
//                     regionCount++;
//                 }
//             }
//         }

//         return regionCount;
//     }

// }

// class Solution {
//   int[] dir={-1,0,1,0,-1};
//   public int minDays(int[][] grid) {
//       boolean[][] visited=new boolean[grid.length][grid[0].length];
//       int island=0;
//       for(int i=0;i<grid.length;i++){
//           for(int j=0;j<grid[0].length;j++){
//               if(!visited[i][j]&&grid[i][j]==1){
//                   dfs(grid,visited,i,j);
//                   island++;
//               }
//           }
//       }
//       if(island!=1) return 0;

//       int cell1=0;
//       int minConnection=Integer.MAX_VALUE;
//       for(int i=0;i<grid.length;i++){
//           for(int j=0;j<grid[0].length;j++){
//               if(grid[i][j]==1){
//                   cell1++;
//                   int count=0;
//                   for(int k=0;k<dir.length-1;k++){
//                       int x=i+dir[k];
//                       int y=j+dir[k+1];
//                       if(x>=0&&x<grid.length&&y>=0&&y<grid[0].length&&grid[x][y]==1) count++;
//                   }
//                   minConnection=Math.min(minConnection,count);
//               }
//           }
//       }


//       if(cell1<=2) return cell1;
//       if(minConnection==1) return 1;

//       for(int i=0;i<grid.length;i++){
//           for(int j=0;j<grid[0].length;j++){
//               if(grid[i][j]==1){
//                   grid[i][j]=0;
//                   for(int k=0;k<dir.length-1;k++){
//                       int x=i+dir[k];
//                       int y=j+dir[k+1];
//                       if(x>=0&&x<grid.length&&y>=0&&y<grid[0].length&&grid[x][y]==1){
//                           boolean[][] newVisited=new boolean[grid.length][grid[0].length];
//                           dfs(grid,newVisited,x,y);
//                           int sum=0;
//                           for(boolean[] row:newVisited){
//                               for(int col=0;col<grid[0].length;col++){
//                                   if(row[col]==true) sum++;
//                               }
//                           }
//                           if(sum!=cell1-1) return 1;
//                       }
                      
//                   }
//                   grid[i][j]=1;
//               }
//           }
//       }
//       return 2;
//   }

//   void dfs(int[][] grid, boolean[][] visited, int i, int j){
//       if(i>=0&&i<grid.length&&j>=0&&j<grid[0].length&&!visited[i][j]&&grid[i][j]==1){
//           visited[i][j]=true;
//           for(int k=0;k<dir.length-1;k++){
//               dfs(grid,visited,i+dir[k],j+dir[k+1]);
//           }
//       }
//   }
// }

// class KthLargest 
// {
//     int num[],k1;
//     public KthLargest(int k, int[] nums)
//     {
//         k1=k;
//         num=nums;    
//     }
    
//     public int add(int val)
//     {
//         int a[]=new int[num.length+1],x,c=0;    
//         for(x=0;x<num.length;x++)
//         a[x]=num[x];
//         a[a.length-1]=val;
//         Arrays.sort(a);
//         num=a;
//         return a[a.length-k1];
//     }
// }

// class Solution {
//   public void solve(int[] candidates, int target,int idx, List<Integer> temp, List<List<Integer>> res, int sum) {
//       if (idx > candidates.length || sum > target) {
//           return;
//       }
//       if(sum == target) {
//           res.add(new ArrayList<>(temp));
//           return;
//       }
//       for (int j = idx; j < candidates.length; j++) {
//           if (j > idx && candidates[j] == candidates[j-1]) continue;
//           temp.add(candidates[j]);
//           solve(candidates, target, j+1, temp, res, sum+candidates[j]);
//           temp.remove(temp.size()-1);
//       }

//       return;
//   }
//   public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//       List<List<Integer>> res = new ArrayList<>();
//       Arrays.sort(candidates);
//       solve(candidates, target, 0, new ArrayList<>(), res, 0);
//       return res;
//   }
// }
// class Solution {
//   public int smallestDistancePair(int[] nums, int k) {
//       Arrays.sort(nums);
//       int n = nums.length;
//       int low = 0;
//       int high = nums[n - 1] - nums[0];
//       while (low < high) {
//           int mid = (low + high) / 2;
//           int count = 0;
//           int left = 0;
//           for (int right = 0; right < n; right++) {
//               while (nums[right] - nums[left] > mid) {
//                   left++;
//               }
//               count += right - left;
//           }
//           if (count < k) {
//               low = mid + 1;
//           } else {
//               high = mid;
//           }
//       }
//       return low;
//   }
// }

//   }
// }
 
    