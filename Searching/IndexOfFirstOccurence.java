
import java.util.Scanner;
public class IndexOfFirstOccurence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = scan.nextInt();
        System.out.println("Enter the sorted array elements :");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the target element :");
        int target = scan.nextInt();
        
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2 ;
            if(arr[mid] == target){
                ans = mid;
                high = mid - 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        if(ans != -1){
            System.out.println("First occurence is at index :" + ans);
        }
        else{
            System.out.println("Element not found in array");
        }
        scan.close();
    }
}
