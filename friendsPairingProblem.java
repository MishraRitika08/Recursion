public class friendsPairingProblem {
    public static int numberOfWays(int n){
    if(n==1 || n==2){
        return n;
    }
    return (numberOfWays(n-1))+((n-1)*numberOfWays(n-2));
}

public static void main(String[] args) {
    System.out.println(numberOfWays(4));
}
}
