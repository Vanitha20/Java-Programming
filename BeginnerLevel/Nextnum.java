import java.util.*;
class Next{
public static void main(String args[]){
try{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n<=10000000)
System.out.println(n+1);
}
catch(Exception e){
System.out.println("Invalid input");
}
}
}
