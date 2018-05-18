import java.util.*;
class Power{
public static void main(String args[])throws Exception{
try{
int k=1;
Scanner s=new Scanner(System.in);
System.out.println("enter two numbers");
int n=s.nextInt();
int m=s.nextInt();
for(int i=1;i<=m;i++)
k=k*n;
System.out.println(k);
}
catch(Exception e){
System.out.println("invaild input");
}
}
}
