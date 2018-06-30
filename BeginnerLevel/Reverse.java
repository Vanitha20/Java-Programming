import java.util.*;
class Reverse{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String n=s.nextLine();
if(n.length()<100000){
StringBuffer sb=new StringBuffer(n);
sb.reverse();
System.out.println(sb);
}
}
}
