import java.util.*;
class Numco{
public static void main(String args[]){
try{
int c=0;
Scanner s=new Scanner(System.in);
String n=s.nextLine();
if(n.length()<=1000){
for(int i=0;i<n.length();i++)
if(Character.isDigit(n.charAt(i)))
c+=1;
System.out.println(c);
}
}
catch(Exception e){
System.out.println("Invalid input");
}
}
