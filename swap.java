class swap
{
    int a=10,b=20;
    swap()
    {
        System.out.println("before swaping -> a="+a+"  b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swaping -> a="+a+"  b="+b);
    }
    public static void main(String args[])
    {
        swap sp=new swap();
    }
}