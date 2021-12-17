abstract class A
{
abstract int add(int a,int b);
int mult(int p,int q)
{
int r=p*q;
return r;
}
}
class B extends A
{
int add(int a,int b)
{
int c=a+b;
return c;
}
}
class M
{
public static void main(String arg[])
{
A a1=new A();
int d=a1.mult(5,6);
System.out.println(d);
}
}