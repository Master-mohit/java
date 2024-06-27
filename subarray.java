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


           if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        } else {
            return edges[0][1];
        }
      
    

    }
}
