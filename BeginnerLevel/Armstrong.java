import java.util.*;
class Arms{
public static void main(String args[])throws Exception{
try{
int num=0,t;
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int n=s.nextInt();
int m=n;
if(m<=100000){
while(m!=0){
t=m%10;
num=num+t*t*t;
m=m/10;
}
if(num==n)
System.out.println("Yes");
else
System.out.println("No");
}
else
System.out.println("enter the input within the range");
}
catch(Exception e){
System.out.println("invalid input");
}
}
}
