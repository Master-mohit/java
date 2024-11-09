import java.util.Scanner;

public class Main {

    public static void main(int[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your name:");
        int count = sc.nextInt();

        System.out.println("Type your age:");
        int age = sc.nextInt();

        System.out.println("Hello " + count + ", you are " + age + " years old.");

        sc.close();  // Closing the scanner
    }
}
while (num >= 4) {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            
            HashSet<Integer> set = new HashSet<>();
    
            for(int i =0;i<nums.length;i++){
    
                if(set.contains(nums[i]))
                return true;
                set.add(nums[i]);
            }
            return false;
        }
    }

