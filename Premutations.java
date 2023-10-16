//The Given input is abc and we are printing the possible ways in which 'abc' could arrange


public class Recursion {


   public static void printPermutation(String str, int idx, String perm) {
       if(str.length() == 0) {
           System.out.println(perm);
           return;
       }
      
       for(int i=0; i<str.length(); i++) {
           char x = str.charAt(i);
           String newStr = str.substring(0, i) + str.substring(i+1);
           printPermutation(newStr, idx+1, perm+x);
       }
   }
   public static void main(String args[]) {
       String str = "abc";
       printPermutation(str, 0, "");
   }
}
