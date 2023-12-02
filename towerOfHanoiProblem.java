public class towerOfHanoiProblem {
  public static int tOH(int start,int helper,int destination,int n){
    if(n==1||n==0){
        return 1;
    }
    // int ways= tOH(start,destination, helper,n-1);
    // ways++;
    // int ways2=tOH(start,helper,destination,n-1);
    int ways= tOH(start,destination, helper,n-1)+1+tOH(start,helper,destination,n-1);

    return ways;

  }
    public static void tOHSteps(char s,char h,char d,int n){
    if(n==1){
      System.out.println("transfer "+n+" from " + s+ " to "+ d);
      return ;
    }
    // int ways= tOH(start,destination, helper,n-1);
    // ways++;
    // int ways2=tOH(start,helper,destination,n-1);
    tOHSteps(s,d,h,n-1);
    System.out.println("transfer "+n+" from " + s + " to "+ d);
    tOHSteps(h,s,d,n-1);

  }

  public static void main(String[] args) {
    //System.out.println(tOH(0,1,3,3));
    tOHSteps('s','h' ,'d',3);
  }
}
