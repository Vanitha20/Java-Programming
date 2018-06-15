import java.util.*;
class Minute{
public static void main(String args[]){
try{
int t,m;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
t=n/60;
m=n%60;
System.out.println(t+" "+m);
}
catch(Exception e){
System.out.println("Invalid input");
}
}
}
