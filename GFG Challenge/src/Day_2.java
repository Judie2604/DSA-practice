import java.util.Scanner;

public class Day_2 {
    void pushZerosToEnd(int[] arr) {
        int len = arr.length;
        int j = 0;
        for(int i = 0 ; i < len ; i++){
           if(arr[i] != 0 ){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp ;
               j++;
           } 
        }
        for(int i = 0 ; i < len ; i++){
            System.out.print(arr[i] + " ");
            }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
            System.out.println(arr[i]);
    }
    Day_2 obj = new Day_2();
    obj.pushZerosToEnd(arr);
    input.close();
}
}
