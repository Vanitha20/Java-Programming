import java.util.*;
class Diff{
public static void main(String args[]){
try{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int v=n-m;
if(v%2==0)
System.out.println("even");
else
System.out.println("odd");
}
catch(Exception e){
System.out.println("Invalid input");
}
}
}
