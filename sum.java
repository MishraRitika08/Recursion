public class sum {
    public static void printSum(int arr[],int i,int sum){
        if(i==(arr.length)){
          System.out.println(sum);
          return;
        }
        sum = sum+arr[i];
        printSum(arr,i+1,sum);
    }
    public static void main(String[] args) {
        int arr[]={3,1,5,6,2};
        printSum(arr,0,0);
    }
}
