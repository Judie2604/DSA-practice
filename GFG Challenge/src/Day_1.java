import java.util.Scanner;

public class Day_1 {
    public int getSecondLargest(int[] arr) {
        int len = arr.length;
        if(len < 2){
            return -1 ;
        }
        int max = Integer.MIN_VALUE;
        int secondmax =  Integer.MIN_VALUE;
        for(int i = 0 ; i < len   ; i++){
           
                if(arr[i] > max){
                    secondmax = max;
                    max = arr[i];
                  
                }
                else if( arr[i] > secondmax && arr[i] != max){
                    secondmax = arr[i];
                }
            
        }
        return (secondmax == Integer.MIN_VALUE) ? -1 : secondmax;
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
    Day_1 obj = new Day_1();
    int result = obj.getSecondLargest(arr);
    System.out.println(result);
    input.close();
}
}