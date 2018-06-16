import java.util.*;
class Muls{
public static void main(String args[]){
try{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n%7==0)
System.out.println("yes");
else
System.out.println("no");
}
catch(Exception e){
System.out.println("Invalid input");
}
}
}
