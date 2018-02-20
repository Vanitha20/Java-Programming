import java.util.*;
class Even{
public static void main(String args[])throws Exception{
try{
int n=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
if(n<=100000)
{
if(n%2==0)
System.out.println("Even");
else
System.out.println("Odd");
}
else
System.out.println("invaild input");
}
catch(Exception e)
{
System.out.println("invaild input");
}
}
}
