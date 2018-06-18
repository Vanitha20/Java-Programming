import java.util.*;
class Multh{
public static void main(String args[]){
try{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n%13==0)
System.out.println("yes");
else
System.out.println("no");
}
catch(Exception e){
System.out.println("Invalid input");
}
}
}
