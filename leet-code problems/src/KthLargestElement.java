import java.util.Arrays;
import java.util.*;
public class KthLargestElement {
     public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        int result = nums[len - k];
        return result;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = rand.nextInt(100);
            System.out.println(nums[i]);
        }
        System.out.println("enter the kth value : ");
        int k = input.nextInt();
        KthLargestElement obj = new KthLargestElement();
        int result = obj.findKthLargest(nums, k);
        System.out.println(result);
        input.close();
    }

}
