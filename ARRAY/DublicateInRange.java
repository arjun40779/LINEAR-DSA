public class DublicateInRange {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        int k=3;
        boolean ans=false;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j=i+1;
            int range=k;
            while(range>0 && j<n){
                if(arr[i]==arr[j]){
                    ans= true;
                  
                }
                range--;
                j++;
            }
        }
        System.out.println("Ans: "+ans);
    }
}
