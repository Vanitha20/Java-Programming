import java.util.*;
class Swap{
public static void main(String args[]){
try{
int t;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
if(n<=100000&&m<=100000){
t=n;
n=m;
m=t;
System.out.print(n+" "+m);
}
}
catch(Exception e){
System.out.println("Invalid input");
}
}
}
