public class lastOccuranceProblem {
    public static int lastOccurance(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurance(arr, key, i+1);
        
        if(arr[i]==key && isFound ==-1){
            return i;
        } 
        
        return isFound;    
    }
 
    public static void main(String[] args) {
        int arr[]={3,7,9,3,8};
        System.out.print(lastOccurance(arr,3,0));
    
    }
}
        
