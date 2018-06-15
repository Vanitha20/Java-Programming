import java.util.*;
class Fib{
public static void main(String args[]){
try{
int a=0,b=1,c=1;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<=n;i++){
System.out.print(c+" ");
c=a+b;
a=b;
b=c;
}
}
catch(Exception e){
System.out.println("Invalid input");
}
}
}
