import java.util.*;
class Large{
public static void main(String args[])throws Exception{
try{
int a,b,c;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if(a>=b&&a>=c)
System.out.println(a);
else if(b>=c&&b>=a)
System.out.println(b);
else
System.out.println(c);
}
catch(Exception e){
System.out.println("enter input as number");
}
}
}
