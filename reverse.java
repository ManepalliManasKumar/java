class reverse{
public static void main(String arg[]){
int n=123,digit,rev=0;
while(n!=0)
{
digit=n%10;
rev=rev*10+digit;
n=n/10;
}
System.out.print(rev);
}
}