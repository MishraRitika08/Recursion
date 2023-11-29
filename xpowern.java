public class xpowern {

    //O(n)
    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        int ans= x*power(x, n-1);

        return ans;
    }

    //Ologn
    public static int powerHalf(int x,int n){
        if(n==1){
            return x;
        }
        int Half= powerHalf(x, n/2);
        int sq= Half*Half;
        
        return (n%2==0) ?  sq :  sq*x ; 

    }

    public static void main(String args[]){
        int x=20;
        int y=3;
        System.out.println(powerHalf(x,y));
    }
}
