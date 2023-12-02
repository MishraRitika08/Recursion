public class binaryStringProblem {
    public static void printBinaryString(int n,int lastPlace,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        printBinaryString(n-1, 0,ans+"0");
        if(lastPlace==0){
            printBinaryString(n-1, 1, ans+"1");
        }
    }
    public static void main(String[] args) {
        printBinaryString(3,0,"");
    }
}
