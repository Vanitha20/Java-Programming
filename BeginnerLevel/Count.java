import java.util.*;
class Count{
public static void main(String args[]){
int c=0;
Scanner s=new Scanner(System.in);
String n=s.nextLine();
for(int i=0;i<n.length();i++)
if(n.charAt(i)!=' ')
c+=1;
System.out.println(c);
}
}
