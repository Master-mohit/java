import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

// public class subarray {
//     public static void main(String[] args) {
        // 22/06/24
        // int count = 0; 
        // for (int i = 0; i < nums.length; i++) {
        //     int oddCount = 0; 
        //     for (int j = i; j < nums.length; j++) {
        //         if (nums[j] % 2 != 0) {
        //             oddCount++; 
        //         }
        //         if (oddCount == k) {
        //             count++; 
        //         }
        //     }
        // }

        // return count; 

        // 23/06/24

        // int maxLen = 1;
        // for (int left = 0; left < nums.length; left++) {
        //     int min = nums[left];
        //     int max = nums[left];
        //     int temLen = 1;
        //     if(maxLen >= nums.length -left ){
        //         break;
        //     }
        //     for (int right = left + 1; right < nums.length; right++) {
        //         max = Math.max(max, nums[right]);
        //         min = Math.min(min, nums[right]);
        //         if (Math.abs(max - min) <= limit) {
        //             temLen++;
        //             continue;
        //         } else {
        //             break;
        //         }
        //     }
        //     maxLen = Math.max(maxLen, temLen);
        // }

        // return maxLen;

        // 24/06/24
        // int flips=0;
        
        // int change=0;
        // int n =nums.length;

        
        // int[] limit = new int[n];
        // for(int i=0;i<n;i++)
        // {
           
        //     nums[i]= (nums[i]+ change)%2;

           
        //     if(nums[i]==0)
        //     {
        //         if(i+k-1>=nums.length)
        //         return -1;
        //         else
        //         limit[i+k-1]=1;  
        //         change++;
        //         flips++;
        //     }
            
        //     change-=limit[i];
        // }
        // return flips;

        // int flips=0;
        
        // int change=0;
        // int n =nums.length;

        
        // int[] limit = new int[n];
        // for(int i=0;i<n;i++)
        // {
           
        //     nums[i]= (nums[i]+ change)%2;

           
        //     if(nums[i]==0)
        //     {
        //         if(i+k-1>=nums.length)
        //         return -1;
        //         else
        //         limit[i+k-1]=1;  
        //         change++;
        //         flips++;
        //     }
            
        //     change-=limit[i];
        // }
        // return flips;


        /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     private int val = 0;
    
//     public TreeNode bstToGst(TreeNode root) {
//         if (root == null) {
//             return null;
//         }
        
//         if (root.right != null) {
//             bstToGst(root.right);
//         }
        
//         val = root.val = val + root.val;
        
//         if (root.left != null) {
//             bstToGst(root.left);
//         }
        
//         return root;
//     }
// }

// 26/06/24

// class Solution {

//     public TreeNode balanceBST(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         inorderTraversal(root, list);

//         return createBalancedBST(list, 0, list.size() - 1);
//     }

//     private void inorderTraversal(TreeNode root, List<Integer> list) {
//         if (root == null) return;
//         inorderTraversal(root.left, list);
//         list.add(root.val);
//         inorderTraversal(root.right, list);
//     }

//     private TreeNode createBalancedBST(List<Integer> list, int start, int end) {
//         if (start > end)    return null;

//         int mid = start + (end - start) / 2;

//         TreeNode leftSubTree = createBalancedBST(list, start, mid - 1);
//         TreeNode rightSubTree = createBalancedBST(list, mid + 1, end);

//         TreeNode node = new TreeNode(list.get(mid), leftSubTree, rightSubTree);
//         return node;
//     }
// }
                 
        //    27/06/24
        //    if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
        //     return edges[0][0];
        // } else {
        //     return edges[0][1];
        // }
      
        // 28/06/24
        // long[] counts = new long[n];
        // for(int[] road : roads){
        //     counts[road[0]]++;
        //     counts[road[1]]++;
        // }
        // int label = 1;
        // long res=0;
        // Arrays.sort(counts);
        // for(long count : counts) res+=count*label++;
        // return res;
    
    //    29/06/24
    //         List<List<Integer>> res=new ArrayList<>();
    //         for(int i=0; i<n; i++){
    //             res.add(new ArrayList<>());
    //         } 
    
    //         ArrayList<Integer>[] graph=new ArrayList[n];
    //         for(int i=0; i<n; i++){
    //             graph[i]=new ArrayList<>();
    //         }   
    //         for(int[] edge: edges){
    //             graph[edge[0]].add(edge[1]);
    //         }
    //         for(int i=0; i<n; i++){
    //             dfs(graph,i,i,res,new boolean[n]);
    //         }
    //         return res;
    //     }
    //     public void dfs( ArrayList<Integer>[] graph, int parent, int curr, List<List<Integer>> res,boolean[] visit){
    //         visit[curr]=true;
    //         for(int i=0; i< graph[curr].size(); i++){
    //             int dest=graph[curr].get(i);
    //             if(!visit[dest]){
    //                 res.get(dest).add(parent);
    //                 dfs(graph,parent,dest,res,visit);
    //             }
    //         }

    //   01/07/24
    // class Solution {
    //     public boolean threeConsecutiveOdds(int[] arr) {
    //         int oddCount = 0; 
    //         for(var num : arr){
    //             if(num % 2 == 0)oddCount = 0;
    //             else oddCount++;
    //             if(oddCount == 3)return true;
    //         }
    //         return false;

    //     }


    // class Solution {
    //     public int minDifference(int[] nums) {
    //         int n=nums.length;
    //         Arrays.sort(nums);
            
    //         if(nums.length<5) return 0;
    
    //         int m = nums[n-1]-nums[3];
    //         int l = nums[n-2]-nums[2];
    //         int k = nums[n-3]-nums[1];
    //         int j = nums[n-4]-nums[0];
    
    //         return Math.min(Math.min(m, l), Math.min(k, j));
    //     }
    // }
    // }

    // class Solution {
    //     public int[] nodesBetweenCriticalPoints(ListNode head) 
    //     {
    //         ArrayList<Integer> ind=new ArrayList<>();
    //         int res[]=new int[2];
    //         Arrays.fill(res,-1);
    //         int iterate=1;
    //         int val=head.val;
    //         head=head.next;
    //         while(head.next!=null)
    //         {
    //             if((head.val>val&&head.val>head.next.val)||(head.val<val&&head.val<head.next.val))
    //             {
    //                ind.add(iterate);
    //             }
    //             val=head.val;
    //             head=head.next;
    //             iterate++;
    //         }
    //          if(ind.size()<2)
    //         {
    //             return res;
    //         }
    //         int max=ind.get(ind.size()-1)-ind.get(0);
    //         int min=(int)1e9;
    //         for(int i=1;i<ind.size();i++)
    //         {
    //             min=Math.min(min,ind.get(i)-ind.get(i-1));
    //         }
    //         res[0]=min;
    //         res[1]=max;
    //         return res;
    //     }
    // }

    
// class Solution {
//     public int numWaterBottles(int numBottles, int numExchange) {
//         int total = numBottles;
//         int empty = numBottles;

//         while (empty >= numExchange) {
//             int full = empty / numExchange;
//             total += full;
//             empty = empty % numExchange + full;
//         }
//         return total;
//     }
// }

// class Solution {
//     public int findTheWinner(int n, int k) {
//      int ans=0,i=2;
//      while(i<=n){
//         ans=(ans+k)%i;
//         i++;
//      } 
//      return (ans+1);
//     }
// }

// class Solution {
//     public double averageWaitingTime(int[][] customers) {
//         int i,j,a=customers[0][0],b;
//         double c=0;
//         int n=customers.length;
//         for(i=0;i<n;i++){
//             b=a+customers[i][1];
//             c=c+b-customers[i][0];
//             if(i!=n-1){
//             if(b>=customers[i+1][0]){
//                 a=b;
//             }
//             else
//             a=customers[i+1][0];
//             }


//         }
//         return c/n;
//     }
// }
// class Solution {
//     public int minOperations(String[] logs) {
//         Stack<String> st=new Stack<>();
//         for(String str:logs){
//             if(str.equals("../")){
//                 if(!st.isEmpty()){
//                     st.pop();
//                 }
//                 else{
//                     continue;
//                 }
//             }
//             else if(str.equals("./")){
//                 continue;
//             }
//             else{
//                 st.push(str);
//             }
//         }
//         int count=0;
//         while(!st.isEmpty()){
//             st.pop();
//             count++;
//         }
//         return count;
        
//     }
// }

// class Solution {
//     public String reverseParentheses(String s) {
//         Stack<Character> st = new Stack<>();
//         for(int i = 0;i<s.length();i++){
// if(s.charAt(i) ==')'){
//     ArrayList<Character> arr = new ArrayList<>();
//  while(st.peek()!='('){
// arr.add(st.pop());
//  }
//  st.pop();
//  for(int j = 0;j<arr.size();j++){
//     st.push(arr.get(j));
//  }
// }
// else {
//     st.push(s.charAt(i));
// }

//         }
//         String ans = "";
//         while(st.size()>0){
//             ans = st.pop()+ans;
//         }
//         return ans;
//     }
// }

// class Solution {
//     public int maximumGain(String s, int x, int y) {
//         int totalScore = 0;
//         String highPriorityPair, lowPriorityPair;
//         if (x > y) {
//             highPriorityPair = "ab";
//             lowPriorityPair = "ba";
//         } else {
//             highPriorityPair = "ba";
//             lowPriorityPair = "ab";
//         }

//         String stage1 = removeSubstring(s, highPriorityPair);
//         totalScore = (s.length() - stage1.length()) / 2 * Math.max(x, y);
//         String stage2 = removeSubstring(stage1, lowPriorityPair);
//         totalScore = totalScore + (stage1.length() - stage2.length()) / 2 * Math.min(x, y);

//         return totalScore;
//     }

//     private String removeSubstring(String s, String pair) {
//         Stack<Character> targetPair = new Stack<>();
//         StringBuilder result = new StringBuilder();

//         for (Character c : s.toCharArray()) {
//             if (!targetPair.isEmpty() && c == pair.charAt(1) && targetPair.peek() == pair.charAt(0)) {
//                 targetPair.pop();
//             } else {
//                 targetPair.push(c);
//             }
//         }

//         for (char c : targetPair) {
//             result.append(c);
//         }

//         return result.toString();
//     }

// }

// class Solution {
//     public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
//         List<Integer>list = new ArrayList<>();
//         for(int i  = 0;i<positions.length;i++){
//             list.add(i);
//         }
//         Collections.sort(list,(a,b)->Integer.compare(
//            positions[a], positions[b]));
//         Stack<Integer> stck = new Stack<>();
//         for (var l : list) {
//             if (directions.charAt(l) == 'L') {
//                 while (!stck.isEmpty()) {
//                     int temp = stck.peek();
//                     if (healths[l] == healths[temp]) {
//                         healths[l] = 0;
//                         healths[temp] = 0;
//                         stck.pop();
//                         break;
//                     } else if (healths[l] > healths[temp]) {
//                         healths[l]--;
//                         healths[temp] = 0;
//                         stck.pop();
//                     } else {
//                         healths[l] = 0;
//                         healths[temp]--;
//                         break;
//                     }
//                 }
//             } else {
//                 stck.push(l); 
//             }
//         }
//         List<Integer> res = new ArrayList<>();
//         for (var h : healths) {
//             if (h != 0)
//                 res.add(h);
//         }
//         return res;
//     }
// }

// import java.util.*;

// class Solution {
//     public String countOfAtoms(String formula) {
//         Stack<Map<String, Integer>> stack = new Stack<>();
//         stack.push(new HashMap<>());
//         int i = 0;
//         int n = formula.length();
        
//         while (i < n) {
//             if (formula.charAt(i) == '(') {
//                 stack.push(new HashMap<>());
//                 i++;
//             } else if (formula.charAt(i) == ')') {
//                 Map<String, Integer> currMap = stack.pop();
//                 i++;
//                 StringBuilder m = new StringBuilder();
//                 while (i < n && Character.isDigit(formula.charAt(i))) {
//                     m.append(formula.charAt(i));
//                     i++;
//                 }
//                 int mult = (m.length() > 0) ? Integer.parseInt(m.toString()) : 1;
//                 for (String atom : currMap.keySet()) {
//                     currMap.put(atom, currMap.get(atom) * mult);
//                 }
//                 for (String atom : currMap.keySet()) {
//                     stack.peek().put(atom, stack.peek().getOrDefault(atom, 0) + currMap.get(atom));
//                 }
//             } else {
//                 StringBuilder currAtom = new StringBuilder();
//                 currAtom.append(formula.charAt(i));
//                 i++;
//                 while (i < n && Character.isLowerCase(formula.charAt(i))) {
//                     currAtom.append(formula.charAt(i));
//                     i++;
//                 }
//                 StringBuilder m = new StringBuilder();
//                 while (i < n && Character.isDigit(formula.charAt(i))) {
//                     m.append(formula.charAt(i));
//                     i++;
//                 }
//                 int cnt = (m.length() == 0) ? 1 : Integer.parseInt(m.toString());
//                 stack.peek().put(currAtom.toString(), stack.peek().getOrDefault(currAtom.toString(), 0) + cnt);
//             }
//         }
        
//         Map<String, Integer> result = stack.pop();
//         List<String> elements = new ArrayList<>(result.keySet());
//         Collections.sort(elements);
//         StringBuilder sb = new StringBuilder();
//         for (String ele : elements) {
//             sb.append(ele);
//             int cnt = result.get(ele);
//             if (cnt > 1) {
//                 sb.append(cnt);
//             }
//         }
//         return sb.toString();
//     }
// }
// class Solution {
//     public boolean dfs(TreeNode root,int x,StringBuilder sb){
//       if(root==null) return false;
//       if(root.val==x) return true;
//       if(dfs(root.left,x,sb)){
//            sb.append('L');
//            return true;
//     }
//      if(dfs(root.right,x,sb)) {
//      sb.append('R');
//      return true;
//      }
//      return sb.length()>0;
// }
// public String getDirections(TreeNode root, int startValue, int destValue) {
//    StringBuilder start=new StringBuilder();
//    StringBuilder end=new StringBuilder();
//    dfs(root,startValue,start);
//    dfs(root,destValue,end);
//    int left=start.length()-1;
//    int right=end.length()-1;
//    int count=0;
//    while(left>=0&&right>=0){
//    if(start.charAt(left)==end.charAt(right)){
//          left--;right--;count++;
//       }
//       else break;

// }
// String ans=new String();
// for(int i=0;i<=start.length()-1-count;i++) ans=ans+'U';
// ans=ans+new String(end.reverse().substring(count));
// return ans;
// }
// }

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//  class Solution {
//     List<TreeNode> res = new ArrayList<>();
//     Set<Integer> toDelete = new HashSet<>();

//     public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
//         for (int val : to_delete) {
//             toDelete.add(val);
//         }
//         dfs(root, true);
//         return res;
//     }

//     private TreeNode dfs(TreeNode node, boolean isRoot) {
//         if (node == null) return null;
//         boolean deleted = toDelete.contains(node.val);
//         if (isRoot &&!deleted) res.add(node);
//         node.left = dfs(node.left, deleted);
//         node.right = dfs(node.right, deleted);
//         return deleted? null : node;
//     }
// }

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 class Solution {
    List<TreeNode> res = new ArrayList<>();
    Set<Integer> toDelete = new HashSet<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for (int val : to_delete) {
            toDelete.add(val);
        }
        dfs(root, true);
        return res;
    }

    private TreeNode dfs(TreeNode node, boolean isRoot) {
        if (node == null) return null;
        boolean deleted = toDelete.contains(node.val);
        if (isRoot &&!deleted) res.add(node);
        node.left = dfs(node.left, deleted);
        node.right = dfs(node.right, deleted);
        return deleted? null : node;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public int countPairs(TreeNode root, int distance) {
//       dfs(root, distance);
  
//       return ans;
//     }
  
//     private int ans = 0;
  
//     private int[] dfs(TreeNode root, int distance) {
//       int[] d = new int[distance + 1]; // {distance: the number of leaf nodes}
//       if (root == null)
//         return d;
//       if (root.left == null && root.right == null) {
//         d[0] = 1;
//         return d;
//       }
  
//       int[] dl = dfs(root.left, distance);
//       int[] dr = dfs(root.right, distance);
  
//       for (int i = 0; i < distance; ++i)
//         for (int j = 0; j < distance; ++j)
//           if (i + j + 2 <= distance)
//             ans += dl[i] * dr[j];
  
//       for (int i = 0; i < distance; ++i)
//         d[i + 1] = dl[i] + dr[i];
  
//       return d;
//     }
//   }

//   class Solution {
//     public List<Integer> luckyNumbers (int[][] nums) {
      

//         List<Integer> num = new ArrayList();
//         int min = 0;
//         int row = 0;
//         int col = 0;
//         for (int i = 0; i < nums.length; i++) {
//             min = nums[i][0];
//             row = i;
//             col =0;
//             for (int j = 0; j < nums[i].length; j++) {

//                 if (nums[i][j] < min) {
//                     min = nums[i][j];
//                     col = j;
//                 }
//             }
//             if(!checkGreaterInCol(nums,row, col)){
//                 continue;
//             }else{
//                 num.add(nums[row][col]);
//                 return num;
//             }
//         }
//         return num;
    
//     }
//     static boolean checkGreaterInCol(int[][] nums,int row, int col){
//         int max = nums[row][col];
//         for (int i = 0; i < nums.length; i++) {

//             if(nums[i][col] > max){
//                 return false;
//             }
//           }
//         return true;
//     }
// }
// class Solution {
//     public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
//         int n=rowSum.length;
//         int m=colSum.length;
//         int[][] mat=new int[n][m];
//         int i=0,j=0;
//         int r=0,c=0;
//         while(i<n&&j<m){
//             mat[i][j]=Math.min(rowSum[r],colSum[c]);
//             rowSum[r]=rowSum[r]-mat[i][j];
//             colSum[c]=colSum[c]-mat[i][j];
//             if(rowSum[r]==0){
//                 r++;
//                 i++;
//             }
//             else{
//                 c++;
//                 j++;
//             }


//         }
//         return mat;
        
//     }
// }

// class Solution {
//     public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
//         List<Integer> rowOrder = topologicalSort(k, rowConditions);
//         List<Integer> colOrder = topologicalSort(k, colConditions);        
//         if (rowOrder == null || colOrder == null) {
//             return new int[0][0];
//         }        
//         int[][] result = new int[k][k];
//         Map<Integer, Integer> colPosition = new HashMap<>();       
//         for (int i = 0; i < k; i++) {
//             colPosition.put(colOrder.get(i), i);
//         }        
//         for (int i = 0; i < k; i++) {
//             int num = rowOrder.get(i);
//             result[i][colPosition.get(num)] = num;
//         }       
//         return result;
//     }    
//     private List<Integer> topologicalSort(int k, int[][] conditions) {
//         List<List<Integer>> graph = new ArrayList<>();
//         for (int i = 0; i <= k; i++) {
//             graph.add(new ArrayList<>());
//         }
//         int[] inDegree = new int[k + 1];        
//         for (int[] condition : conditions) {
//             int from = condition[0], to = condition[1];
//             graph.get(from).add(to);
//             inDegree[to]++;
//         }        
//         Queue<Integer> queue = new LinkedList<>();
//         for (int i = 1; i <= k; i++) {
//             if (inDegree[i] == 0) {
//                 queue.offer(i);
//             }
//         }        
//         List<Integer> order = new ArrayList<>();
//         while (!queue.isEmpty()) {
//             int node = queue.poll();
//             order.add(node);
//             for (int neighbor : graph.get(node)) {
//                 if (--inDegree[neighbor] == 0) {
//                     queue.offer(neighbor);
//                 }
//             }
//         }        
//         return order.size() == k ? order : null;
//     }
// }

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
        
//         HashSet<Integer> set = new HashSet<>();

//         for(int i =0;i<nums.length;i++){

//             if(set.contains(nums[i]))
//             return true;
//             set.add(nums[i]);
//         }
//         return false;
//     }
// }
// //    

 // Approach 1
//  class Solution {
//     public String[] sortPeople(String[] names, int[] heights) {
//        int n = names.length;
//        HashMap<Integer,String> map = new HashMap<>();
//        for(int i = 0; i < n; i++){
//            map.put(heights[i], names[i]);
//        }
//        Arrays.sort(heights);
//        String res[] = new String[n];
//        int idx = 0;
//        for(int i = n-1; i >= 0; i--){
//            res[idx++] = map.get(heights[i]);
//        }
//        return res;
//     }
// }

// class Solution {
//     public int[] frequencySort(int[] a) {
//         int[] freq = new int[201];
//         int k = 0;
//         int[] ans = new int[a.length];
//         for (int i = 0; i < a.length; i++) {
//             freq[a[i] + 100] += 1;
//         }
//         for (int i = 1; i <= 100; i++) {
//             for (int j = freq.length - 1; j >= 0; j--) {
//                 if (freq[j] == i) {
//                     for (int m = 0; m < freq[j]; m++) {
//                         ans[k++] = j - 100;
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
// }

// class Solution {
//     public int[] sortArray(int[] nums) {
//          Arrays.sort(nums);
//          return nums;
//     }
// }


// second method..

// int[] temp = new int[nums.length];
//         for (int i = 0; i < nums.length - 1; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] > nums[j]) {
//                     int swap = nums[i];
//                     nums[i] = nums[j];
//                     nums[j] = swap;
//                 }
//             }
//         }
//         return nums;

// class Solution {
//     public int findTheCity(int n, int[][] edges, int distanceThreshold) {
//        int[][] dist = new int[n][n];
//        for (int i = 0; i < n; i++){
//             Arrays.fill(dist[i], distanceThreshold + 1);
//             dist[i][i] = 0;
//        }
//        for (int[] e : edges) dist[e[0]][e[1]] = e[2];

//        for (int i = 0; i < n; i++){
//             for (int j = 0; j < n; j++){
//                 for (int k = 0; k < n; k++){
//                     dist[k][j] = Math.min(dist[k][j] , dist[i][k] + dist[i][j]);
//                 }
//             }
//        }
//        int min = 0, minCities = n;
//        for (int i = 0; i < n; i++){
//             int reachable = 0;
//             for (int j = 0; j < n; j++){
//                 if (dist[i][j] <= distanceThreshold) reachable++;
//             }
//             if (reachable <= minCities){
//                 minCities = reachable;
//                 min = i;
//             }
//        }
//        return min;
//     } 

// class Solution {
//     public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
//         long dismap[][]=new long[26][26];
//         for(int i=0;i<26;i++){
//             Arrays.fill(dismap[i],1000000000);
//             dismap[i][i]=0;
//         }
//         for(int i=0;i<cost.length;i++){
//             dismap[original[i]-'a'][changed[i]-'a']=Math.min(dismap[original[i]-'a'][changed[i]-'a'],cost[i]);
//         }
//         for(int k=0;k<26;k++){
//             for(int i=0;i<26;i++){
//                 if(dismap[i][k]<1000000000){
//                     for(int j=0;j<26;j++){
//                         if(dismap[k][j]<1000000000){
//                             dismap[i][j]=Math.min(dismap[i][j],dismap[i][k]+dismap[k][j]);
//                         }
//                     }
//                 }
//             }
//         }
//         long sum=0;
//         for(int i=0;i<source.length();i++){
//             int ch=source.charAt(i)-'a';
//             int ch1=target.charAt(i)-'a';
//             if(dismap[ch][ch1]==1000000000){
//                 return -1;
//             }
//             else{
//                 sum+=(long)dismap[ch][ch1];
//             }
//         }
//         return sum;
//     }
// }
}

// import java.util.*;

// class Solution {
//     public int secondMinimum(int n, int[][] edges, int time, int change) {
//         List<List<Integer>> adj = new ArrayList<>();
//         for (int i = 0; i <= n; i++) {
//             adj.add(new ArrayList<>());
//         }

//         for (int[] edge : edges) {
//             adj.get(edge[0]).add(edge[1]);
//             adj.get(edge[1]).add(edge[0]);
//         }

//         PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
//         int[] dist1 = new int[n + 1];
//         int[] dist2 = new int[n + 1];
//         int[] freq = new int[n + 1];

//         Arrays.fill(dist1, Integer.MAX_VALUE);
//         Arrays.fill(dist2, Integer.MAX_VALUE);

//         minHeap.add(new int[]{0, 1});
//         dist1[1] = 0;

//         while (!minHeap.isEmpty()) {
//             int[] curr = minHeap.poll();
//             int timeTaken = curr[0];
//             int node = curr[1];

//             freq[node]++;

//             if (freq[node] == 2 && node == n) {
//                 return timeTaken;
//             }

//             for (int neighbor : adj.get(node)) {
//                 int newTimeTaken = timeTaken;

//                 if ((newTimeTaken / change) % 2 != 0) {
//                     newTimeTaken = change * (newTimeTaken / change + 1) + time;
//                 } else {
//                     newTimeTaken = newTimeTaken + time;
//                 }

//                 if (dist1[neighbor] > newTimeTaken) {
//                     dist2[neighbor] = dist1[neighbor];
//                     dist1[neighbor] = newTimeTaken;
//                     minHeap.add(new int[]{newTimeTaken, neighbor});
//                 } else if (dist2[neighbor] > newTimeTaken && dist1[neighbor] != newTimeTaken) {
//                     dist2[neighbor] = newTimeTaken;
//                     minHeap.add(new int[]{newTimeTaken, neighbor});
//                 }
//             }
//         }
//         return 0;
//     }
//     class Solution {
//         public int arrayPairSum(int[] nums) {
//             int res = 0;
//             Arrays.sort(nums);
//             for(int i=0; i<nums.length; i+=2){
//                 res = res + nums[i];
//             }
//             return res;
//         }
//     }
//     class Solution {
//         public int findLHS(int[] nums) {
            
//             Arrays.sort(nums);
//             int maxlength =0;
//             int start = 0;
//             for(int end =0; end <nums.length; end++){
//                while(nums[end ] - nums[start] > 1){
//                 start++;
//                } 
//               if (nums[end] - nums[start] == 1){
//                 maxlength =  Math.max(maxlength, end  - start + 1);
//                }
//             }
//             return maxlength;
//         }
//     }

// class Solution {
//     public int numTeams(int[] rating) {
//         int count = 0;
//         int n = rating.length;
//         for(int i=0; i<n; i++){
//        for(int j=i+1; j<n; j++){
//         for(int k =j+1; k<n; k++){
//             if((rating[i] < rating[j] && rating[j] < rating[k])|| 
//             (rating[i] > rating[j] && rating[j] > rating[k])){
//                 count++;
//             }
//        }
//        }
//         }
//         return count;
//     }

    // class Solution {
    //     public int minimumDeletions(String s) {
    //      int acount = 0;
    //      int bcount = 0;
    
    //     for(char chacha : s.toCharArray()){
    //         if(chacha == 'b'){
    //             bcount++;
    //         }
    //         else if(bcount > 0){
    //             bcount--;
    //             acount++;
    //         }
       
    //     }
    //      return acount;
    //     }
    // }
      
   
// }
// }

    
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

return roman.toString()

public int getKthElement(int[] nums1, int[] nums2, int k) {
    int len1 = nums1.length, len2 = nums2.length;
    int i = 0, j = 0; // Starting indices for nums1 and nums2.

    while (true) {
        // If nums1 is exhausted, return the k-th element from nums2.
        if (i == len1) {
            return nums2[j + k - 1];
        }

        // If nums2 is exhausted, return the k-th element from nums1.
        if (j == len2) {
            return nums1[i + k - 1];
        }

        // If k == 1, return the smallest element between nums1[i] and nums2[j].
        if (k == 1) {
            return Math.min(nums1[i], nums2[j]);
        }

        // Divide k into two halves.
        int half = k / 2;

        // Calculate new indices for comparison.
        int newI = Math.min(i + half, len1) - 1;
        int newJ = Math.min(j + half, len2) - 1;

        // Compare elements at new indices.
        int v1 = nums1[newI];
        int v2 = nums2[newJ];

        if (v1 <= v2) {
            // Exclude the left half of nums1 up to newI (inclusive).
            k -= (newI - i + 1);
            i = newI + 1;
        } else {
            // Exclude the left half of nums2 up to newJ (inclusive).
            k -= (newJ - j + 1);
            j = newJ + 1;
        }
    }
}
}

import java.math.BigInteger;
class Solution {
public String multiply(String num1, String num2) {
    
    BigInteger a=new BigInteger(num1);
    BigInteger b=new BigInteger(num2);
    return a.multiply(b).toString();

}
}

class Solution {
public boolean searchMatrix(int[][] matrix, int target) {
    int n = matrix.length, m = matrix[0].length, cur = 0;
    for (int i = 0; i < n; i++) {
        if (target == matrix[i][m - 1]) {
            return true;
        }
        else if (target < matrix[i][m - 1]) {
            cur= i;
            break;
        }
    }
    int start = 0 ,end = m-1;
    while(start <= end){
        int mid = (start + end)/2;
        if(matrix[cur][mid] == target){
            return true;
        }
        if(target > matrix[cur][mid]){
            start = mid + 1;
        }
        else{
            end = mid -1;
        }
    }
    return false;
}
}

class Solution {
public void rotate(int[][] matrix) 
{
    int n = matrix.length;
    int rot[][] = new int[n][n];
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            {
                rot[j][n-1-i] = matrix[i][j];
            }
        }
      }


      for (int i = 0; i < rot.length; i++) {
        for (int j = 0; j < rot[0].length; j++) {
             matrix[i][j] =  rot[i][j];
        }
      }
}
}class Solution {
public int titleToNumber(String columnTitle) {
    int res=0;
    for(char c:columnTitle.toCharArray()){
        res=res*26+(c-'A'+1);
    }
    return res;
}

class Solution {
    public void reverse(int [] nums,int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }

        if(ind==-1){
            reverse(nums,0,n-1);
            return;
        }

        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }

        reverse(nums,ind+1,n-1);
    }
}

class Pair {
        private int row;
        private int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
}

class Solution {

    private char[][] board;
    private String word;

    public boolean exist(char[][] board, String word) {

        int row = board.length;
        int col = board[0].length;
        this.board = board;
        this.word = word;

        for(int r =0; r<row; r++)
        {
            for(int c=0; c<col; c++)
            {
                if (wordSearchDfs(r, c,0))
                {
                    return true;
                }
            }
        }  
        return false;     
    }

    public boolean wordSearchDfs(int r, int c, int i)
    {
        boolean res = false;
        if(i == this.word.length())
        {
            return true;
        }
        if (r < 0 || c < 0 || r >= this.board.length || c >= this.board[0].length || board[r][c] != word.charAt(i)) {
            return false;
        }
        char temp = board[r][c];
        board[r][c] = '#';
        res = wordSearchDfs(r+1, c, i+1) || wordSearchDfs(r, c+1, i+1) ||
        wordSearchDfs(r-1, c, i+1) || wordSearchDfs(r, c-1, i+1);
        board[r][c] = temp;
        return res;
       
    }
}

class Solution {
    class Trie {
        boolean isEnd;
        Trie[] map;
        Trie() {
            this.isEnd = false;
            this.map = new Trie[26];
        }
    }

    Trie root;
    Boolean[] dp;

    public boolean wordBreak(String s, List<String> wordDict) {
        root = new Trie();
        for(String word : wordDict) 
            populate(word);

        int LEN = s.length();
        dp = new Boolean[LEN];

        return help(s, LEN, 0);
    }

    private void populate(String s) {
        Trie cur = root;
        for(int i = 0; i < s.length(); ++i) {
            int idx = s.charAt(i) - 'a';
            if(cur.map[idx] == null) 
                cur.map[idx] = new Trie();
            cur = cur.map[idx];
        }
        cur.isEnd = true;
    }

    private boolean help(String s, int LEN, int idx) {
        if(idx >= LEN) return true;
        if(dp[idx] != null) return dp[idx];

        Trie cur = root;
        int i = idx;

        while(i < LEN) {
            int k = s.charAt(i) - 'a';

            if(cur.map[k] == null) break;
            cur = cur.map[k];

            if(cur.isEnd && help(s, LEN, i + 1)) 
                return dp[idx] = true;
            ++i;
        }
        return dp[idx] = false;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode leftprev=dummy;
        ListNode curr=head;
        for(int i=0; i<left-1;i++){
            leftprev=leftprev.next;
            curr=curr.next;
        }
        ListNode reminder=curr;
        ListNode prev=null;
        for(int i=0; i<=right-left; i++){
        ListNode nextnode=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nextnode;
        }
        leftprev.next=prev;
        reminder.next=curr;
        return dummy.next;
        
        
    }
}

class Solution {
    public boolean lemonadeChange(int[] bills) {
         int r5=0;
        int r10=0;
     
        for(int bill :bills){
            if(bill == 5){
            r5+=1;
            continue;
            }
            else if(bill == 10){
                r10+=1;
                if(r5 <=0)
                return false;
                else
                r5-=1;
            }
            else{
               
               if(r5 > 0 && r10 >0){
                r5-=1;
                r10-=1;
               }else if(r5 >=3){
                    r5-=3;
               }
               else{
                return false;
               }
            }
        }
        return true;
    }

    class Solution {
  public int arrangeCoins(long n) {
    return (int) (-1 + Math.sqrt(8 * n + 1)) / 2;
  }
}