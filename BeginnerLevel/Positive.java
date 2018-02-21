import java.util.*;
class Positive{
public static void main(String args[])throws Exception{
try{
int n=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
if(n<=100000){
if(n>0)
System.out.println("Positive");
else if(n<0)
System.out.println("Negative");
else
System.out.println("Zero");
}
else
System.out.println("invalid input");
}
catch(Exception e){
System.out.println("enter input as number");
}
}
}
