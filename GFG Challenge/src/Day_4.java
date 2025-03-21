import java.util.*;
public class Day_4 {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
         d = d % n;
        reverse(arr, 0, n-1);
        reverse(arr, 0 ,n-d-1);
        reverse(arr, n-d , n-1 );
        
    }
    public static void reverse(int arr[] , int start , int end){
        while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number od elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
            System.out.println("Enter the number of rotations: ");
            int d = sc.nextInt();
            rotateArr(arr , d);
            System.out.println(Arrays.toString(arr));
            sc.close();
}
}
