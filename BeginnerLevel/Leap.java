import java.util.*;
class Leap{
public static void main (String args[ ])throws Exception{
try{
int n=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
if(n%2==0){
System.out.println("Leap Year");
}
else
System.out.println("Not a Leap Year");
}
catch(EException e){
System.out.println("invalid input");
}
}
}
