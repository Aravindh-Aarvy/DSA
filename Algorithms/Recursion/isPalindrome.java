import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("Type the string : ");
        Scanner sc = new Scanner(System.in);
        System.out.println(isPalindrome(sc.nextLine(),0));
    }
    
    static boolean isPalindrome(String k,int idx){
        if(idx>=k.length()/2) return true;
        if(k.charAt(idx)!= k.charAt(k.length()-1-idx)) return false;
        return isPalindrome(k,idx+1);
    }
}
