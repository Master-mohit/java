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
    }\

class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length() <= numRows){
            return s;
        }

        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }

        int count=0;
        while(count<s.length()){
            for(int k=0;k<numRows&& count < s.length();k++){
                rows[k].append(s.charAt(count));
                if(count<s.length()){
                    count++;
                }else{
                    break;
                }
            }
            for(int l=numRows-2;l>0 && count < s.length();l--){
                rows[l].append(s.charAt(count));
                if(count<s.length()){
                    count++;
                }else{
                    break;
                }
            }
            if(count>=s.length()){
                    break;
                }
        }

         StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}

