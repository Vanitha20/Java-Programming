import java.util.*;
class Length{
public static void main(String args[])throws Exception{
try{
int a,c=0;
Scanner s=new Scanner(System.in);
a=s.nextInt();
c=Integer.toString(a).length();
System.out.println(c);
}
catch(Exception e){
System.out.println("invalid input");
}
}
}
