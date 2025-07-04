public class all_bitwise_operators {
    public static void main(String[] args){
        int a=10;
        int b=12;
        System.out.println("bitwise complement->"+" '~' :"+(~a));
        System.out.println("bitwise AND->"+" '&' :"+(a&b));
        System.out.println("bitwise OR->"+" '|' :"+(a|b));
        System.out.println("bitwise XOR(exclusive OR)->"+" '^' :"+(a^b));
        System.out.println("bitwise left shif operators:");
        System.out.println("b<<1 :"+(b<<1));
        System.out.println("b<<2 :"+(b<<2));
        System.out.println("b<<3 :"+(b<<3));
        System.out.println("bitwise right shif operators:");
        System.out.println("b>>1 :"+(b>>1));
        System.out.println("b>>2 :"+(b>>2));
        System.out.println("b>>3 :"+(b>>3 ));
    }
}
