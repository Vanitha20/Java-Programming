import java.util.*;
class Prime{
public static void main(String args[])throws Exception{
try{
int c=0;
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int n=s.nextInt();
if(n<=1000){
for(int i=1;i<=n;i++){
if(n%i==0)
c++;
}
if(c==2)
System.out.println("Yes");
else
System.out.println("No");
}
else
System.out.println("No");
}
catch(Exception e){
System.out.println("invaild input");
}
}
}
