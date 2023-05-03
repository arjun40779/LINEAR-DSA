import java.util.*;
public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr={1,105,-8,-9,6,0};
        System.out.println("Array: "+Arrays.toString(arr));
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}
