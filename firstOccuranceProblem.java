public class firstOccuranceProblem {
    public static int firstOccurance(int arr[], int key, int i){
     if(i==arr.length){
        return -1;
     }
     if(arr[i]==key){
        return i;
     }

     return firstOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={43,3,3,2};
        System.out.print(firstOccurance(arr,33,0));
    }
}
