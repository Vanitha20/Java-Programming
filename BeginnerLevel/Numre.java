import java.util.*;
class Numre{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String m=Integer.toString(n);
StringBuffer sb=new StringBuffer(m);
sb.reverse();
System.out.println(sb);
}
}
