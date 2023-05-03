import java.util.*;
class Main{
    public static void main(String[] args) {
        int[] arr={1,5,8,-9,6,0};
        System.out.println("Array: "+Arrays.toString(arr));
        int i=0; int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++; j--;
    }
    System.out.println("Array after reversing: "+Arrays.toString(arr));
}
}