class inheritance1
{
    int a,b;
    inheritance1(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void compute()
    {
        System.out.println("a+b="+(a+b));
    }
}
class inheritance2 extends inheritance1 
{
    int c;
    inheritance2(int a,int b,int c)
    {
        inheritance1(a,b);
        this.c=c;
    }
    void compute()
    {
        System.out.println("a+b+c="+(a+b+c));
    }
    public static void main(String[] args) {
        inheritance1 b=new inheritance1(10,20);
        inheritance2 a=new inheritance2(10,20,30);
        a.compute();
        b.compute();
    }
}