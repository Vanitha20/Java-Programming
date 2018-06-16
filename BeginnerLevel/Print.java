import java.util.*;
class Pri{
public static void main(String args[]){
try{
Scanner s=new Scanner(System.in);
String m=s.nextLine();
String a[]=m.split(" ");
String n=a[0];
int v=Integer.parseInt(a[1]);
for(int i=0;i<v;i++)
System.out.print(String.valueOf(n.charAt(i)));
}
catch(Exception e){
System.out.println("Invalid input");
}
}
}
