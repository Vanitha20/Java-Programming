import java.util.*;
class Neare{
public static void main(String args[]){
try{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n%2==0)
System.out.println(n);
else
System.out.println(n-1);
}
catch(Exception e){
System.out.println("Invalid input");
}
}
}
