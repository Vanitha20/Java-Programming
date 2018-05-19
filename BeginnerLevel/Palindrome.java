import java.util.*;
class Palindrome{
public static void main(String args[])throws Exception{
try{
int rnum=0,t;
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int n=s.nextInt();
int m=n;
if(m<=1000){
while(m!=0){
t=m%10;
rnum=rnum*10+t;
m=m/10;
}
if(rnum==n)
System.out.println("Yes");
else
System.out.println("No");
}
else
System.out.println("No");
}
catch(Exception e){
System.out.println("invalid input");
}
}
}
