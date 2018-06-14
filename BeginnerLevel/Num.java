import java.util.*
class Number{
public static void main(String args[]){
boolean num=true;
Scanner s=new Scanner(System.in)
String n=s.nextLine();
for(int i=0;i<n.length();i++)
if(!Character.isDigit(n.charAt(i)))
num=false;
if(num)
System.out.println("Yes");
else
System.out.println("No");
}
}
