class fib{
public static void main(String arg[]){
int n,n1,n2,n3;
n1=0;
n2=1;
n=5;
System.out.println(n1);
System.out.println(n2);
while(n>=3)
{
n3=n1+n2;
System.out.println(n3);
n1=n2;
n2=n3;
n--;
}}}