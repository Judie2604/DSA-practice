// reverse a array
import java.util.*;
public class Day_3 {
    public void reverseArray(int arr[]) {
       int len = arr.length;
       int start = 0;
       int end = len -1;
       while(start < end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number od elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
            Day_3 obj = new Day_3();
            obj.reverseArray(arr);
            System.out.println(Arrays.toString(arr));
            sc.close();
}
}

