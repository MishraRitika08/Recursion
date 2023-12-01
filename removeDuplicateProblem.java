public class removeDuplicateProblem {
    public static void removeDup(String str,boolean map[],int idx, StringBuilder ans){
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        char curr = str.charAt(idx);
        if(map[curr-'a']==true){
          removeDup(str, map, idx+1, ans);
        }
        else{
            map[curr-'a']=true;
            removeDup(str, map, idx+1, ans.append(curr));
        }
    }
    public static void main(String[] args) {
        String str="gggggyrttttryr";
        removeDup(str, new boolean[26], 0,new StringBuilder(""));
    }
}
