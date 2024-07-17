import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class subarray {
    public static void main(String[] args) {
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
class Solution {
    private int val = 0;
    
    public TreeNode bstToGst(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        if (root.right != null) {
            bstToGst(root.right);
        }
        
        val = root.val = val + root.val;
        
        if (root.left != null) {
            bstToGst(root.left);
        }
        
        return root;
    }
}

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
        }
    }
