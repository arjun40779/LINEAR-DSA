import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int[] arr={1,5,8,-9,6,0};
        System.out.println("Array: "+Arrays.toString(arr));
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Min: "+min+"\nMax: "+max);

    }
}