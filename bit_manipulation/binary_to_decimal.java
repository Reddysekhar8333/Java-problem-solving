import java.util.Scanner;
public class binary_to_decimal{
    static String d2b(int n){//decimal to binary
        String b="";
        while (n>=1){
            int x=n%2;
            n=n/2;
            b=x+b;       
        }
        return b; 
    }
    static int b2d(String b){ //binary to decimal
        int result=0;
        int powof2=1;
        for(int i=b.length()-1;i>=0;i--){
            if(b.charAt(i)=='1'){
                result+=powof2;
            }
            powof2*=2;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=s.nextInt();
        String b=d2b(n);
        System.out.println(b);
        System.out.println("binary to decimal:"+b2d(b));
    }
}