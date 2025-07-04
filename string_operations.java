import java.util.Scanner;

public class string_operations {
    public static void main(String args[]){
        String s="mam";
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans=ans+s.charAt(i);
        }
        System.out.println(ans);
        
        if (ans.equals(s)){
            System.out.println("yes, it is palindrome !");
        }
        else{
            System.out.println("no, it is not a palindrome ! ");
        }
    }
}
