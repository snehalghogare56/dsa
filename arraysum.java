import java.util.*;
public class Solution {
    public static int arraySum(int []arr, int n) {
        // Write your code here.
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
